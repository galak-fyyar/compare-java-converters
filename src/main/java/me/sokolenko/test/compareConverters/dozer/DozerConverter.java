package me.sokolenko.test.compareConverters.dozer;

import me.sokolenko.test.compareConverters.Converter;
import me.sokolenko.test.compareConverters.model.source.Category;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

/**
 * @author Anatoliy Sokolenko
 */
public class DozerConverter implements Converter {

    private final Mapper mapper;

    public DozerConverter() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(getClass().getResourceAsStream("dozer-mapping.xml"));

        this.mapper = mapper;
    }

    @Override
    public me.sokolenko.test.compareConverters.model.target.Category map(Category source) {
        return mapper.map(source, me.sokolenko.test.compareConverters.model.target.Category.class);
    }

    @Override
    public Category unmap(me.sokolenko.test.compareConverters.model.target.Category source) {
        return mapper.map(source, Category.class);
    }
}
