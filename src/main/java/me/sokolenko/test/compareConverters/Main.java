package me.sokolenko.test.compareConverters;

import me.sokolenko.test.compareConverters.dozer.DozerConverter;
import me.sokolenko.test.compareConverters.manual.ManualConverter;
import me.sokolenko.test.compareConverters.mapstruct.MapStructConverterImpl;
import me.sokolenko.test.compareConverters.model.source.Category;
import me.sokolenko.test.compareConverters.orika.OrikaConverter;
import org.apache.commons.lang3.StringUtils;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anatoliy Sokolenko
 */
public class Main {

    private static final Map<String, Class> CONVERTERS = new HashMap<String, Class>() {{
        put("dozer", DozerConverter.class);
        put("orika", OrikaConverter.class);
        put("manual", ManualConverter.class);
        put("mapStruct", MapStructConverterImpl.class);
    }};

    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Not all mandatory properties specified. " +
                    "Please specify converter name and number of iterations you would like to perform");
        }

        Converter converter = getConverter(args);
        int iterationsCount = getIterationsCount(args);

        PodamFactory randomizer = new PodamFactoryImpl();
        int[] latencies = new int[iterationsCount];
        for (int i = 0; i < iterationsCount; i++) {
            Category category = randomizer.manufacturePojo(Category.class);

            long start = System.nanoTime();

            me.sokolenko.test.compareConverters.model.target.Category result = converter.map(category);


            long end = System.nanoTime();

            latencies[i] = (int) (end - start);
        }

        printResults(latencies);
    }

    private static void printResults(int[] latencies) {
        Arrays.sort(latencies);

        System.out.println("Min " + latencies[0]);
        System.out.println("Mid " + latencies[latencies.length / 2]);
        System.out.println("90% " + latencies[((int) (latencies.length * 0.9))]);
        System.out.println("95% " + latencies[((int) (latencies.length * 0.95))]);
        System.out.println("99% " + latencies[((int) (latencies.length * 0.99))]);
        System.out.println("99.9% " + latencies[((int) (latencies.length * 0.999))]);
        System.out.println("99.99% " + latencies[((int) (latencies.length * 0.9999))]);
        System.out.println("99.999% " + latencies[((int) (latencies.length * 0.99999))]);
        System.out.println("99.9999% " + latencies[((int) (latencies.length * 0.999999))]);
        System.out.println("Max " + latencies[latencies.length - 1]);

        int total = 0;
        for(int i=0; i<latencies.length; i++) {
            total += latencies[i];
        }

        System.out.println("Avg "+ (total / latencies.length));
    }

    private static Converter getConverter(String[] args) {
        try {
            String conterterName = args[0];
            Class converterClass = CONVERTERS.get(conterterName);
            if (converterClass == null) {
                throw new IllegalArgumentException("Please specify known converter: " + StringUtils.join(CONVERTERS.keySet().toArray()));
            }
            return (Converter) converterClass.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalArgumentException("Converter class should have default public constructor");
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Converter class should have default public constructor");
        }
    }

    private static int getIterationsCount(String[] args) {
        try {
            int iterationsCount;
            String iterationsString = args[1];
            iterationsCount = Integer.valueOf(iterationsString);
            if (iterationsCount <= 0) {
                throw new IllegalArgumentException("Iterations count should be greater than zero");
            }
            return iterationsCount;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Iterations count should be valid integer");
        }
    }

}
