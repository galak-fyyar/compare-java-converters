package me.sokolenko.test.compareConverters.orika;

import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import me.sokolenko.test.compareConverters.Converter;
import me.sokolenko.test.compareConverters.model.source.Category;
import me.sokolenko.test.compareConverters.model.source.Product;

/**
 * @author Anatoliy Sokolenko
 */
public class OrikaConverter implements Converter {

    private final BoundMapperFacade<Category, me.sokolenko.test.compareConverters.model.target.Category> mapper;

    public OrikaConverter() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Category.class,
                me.sokolenko.test.compareConverters.model.target.Category.class)
                .field("name", "categoryName")
                .byDefault().register();

        mapperFactory.classMap(Product.class,
                me.sokolenko.test.compareConverters.model.target.Product.class)
                .field("attributes", "parameters")
                .byDefault().register();

        mapper = mapperFactory.getMapperFacade(Category.class, me.sokolenko.test.compareConverters.model.target.Category.class);
    }

    @Override
    public me.sokolenko.test.compareConverters.model.target.Category map(Category source) {
        return mapper.map(source);
    }

    @Override
    public Category unmap(me.sokolenko.test.compareConverters.model.target.Category source) {
        return mapper.mapReverse(source);
    }
}
