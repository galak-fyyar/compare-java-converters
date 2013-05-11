package me.sokolenko.test.compareConverters.orika;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import me.sokolenko.test.compareConverters.Converter;
import me.sokolenko.test.compareConverters.model.source.Category;

/**
 * @author Anatoliy Sokolenko
 */
public class OrikaConverter implements Converter {

    private final MapperFacade mapper;

    public OrikaConverter() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Category.class,
                me.sokolenko.test.compareConverters.model.target.Category.class)
                .field("name", "categoryName")
                .byDefault().register();

        mapper = mapperFactory.getMapperFacade();
    }

    @Override
    public me.sokolenko.test.compareConverters.model.target.Category map(Category source) {
        return mapper.map(source, me.sokolenko.test.compareConverters.model.target.Category.class);
    }
}
