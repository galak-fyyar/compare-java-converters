package me.sokolenko.test.compareConverters;

import me.sokolenko.test.compareConverters.dozer.DozerConverter;
import me.sokolenko.test.compareConverters.manual.ManualConverter;
import me.sokolenko.test.compareConverters.mapstruct.MapStructConverter;
import me.sokolenko.test.compareConverters.mapstruct.MapStructConverterImpl;
import me.sokolenko.test.compareConverters.model.source.Category;
import me.sokolenko.test.compareConverters.orika.OrikaConverter;
import org.openjdk.jmh.annotations.*;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 * @author Christophe Labouisse on 06/04/2015.
 */
@State(Scope.Thread)
public class JHMBenchmark {
    private final ManualConverter manualConverter = new ManualConverter();
    private final DozerConverter dozerConverter = new DozerConverter();
    private final MapStructConverter mapStructConverter = new MapStructConverterImpl();
    private final OrikaConverter orikaConverter = new OrikaConverter();

    private int index = 0;

    private Category[] sources;
    private PodamFactory randomizer;

    @Setup(Level.Trial)
    public void initSources() {
        randomizer = new PodamFactoryImpl();
        sources = new Category[100000];

        for (int i = 0; i < sources.length; i++) {
            sources[i] = randomizer.manufacturePojo(Category.class);
        }
    }

    @Benchmark
    public me.sokolenko.test.compareConverters.model.target.Category measureManual() {
        Category source = getNextCategory();
        return manualConverter.map(source);
    }

    @Benchmark
    public me.sokolenko.test.compareConverters.model.target.Category measureMapStruct() {
        Category source = getNextCategory();
        return mapStructConverter.map(source);
    }

    @Benchmark
    public me.sokolenko.test.compareConverters.model.target.Category measureDozer() {
        Category source = getNextCategory();
        return dozerConverter.map(source);
    }

    @Benchmark
    public me.sokolenko.test.compareConverters.model.target.Category measureOrika() {
        Category source = getNextCategory();
        return orikaConverter.map(source);
    }

    private Category getNextCategory() {
        Category source = sources[index++];
        if (index >= sources.length) index = 0;
        return source;
    }

}
