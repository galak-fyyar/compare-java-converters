package me.sokolenko.test.compareConverters.jmapper;

import com.googlecode.jmapper.JMapper;
import me.sokolenko.test.compareConverters.Converter;
import me.sokolenko.test.compareConverters.model.target.Category;

/**
 * @author: reisj
 */
public class JMapperConverter implements Converter {

    @Override
    public Category map(me.sokolenko.test.compareConverters.model.source.Category source) {
        JMapper mapper = new JMapper(Category.class,
                me.sokolenko.test.compareConverters.model.source.Category.class,
                "conf/jmapper.xml");

        return (Category) mapper.getDestination(source);
    }
}
