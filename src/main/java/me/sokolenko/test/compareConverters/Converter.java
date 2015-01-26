package me.sokolenko.test.compareConverters;

import me.sokolenko.test.compareConverters.model.source.Category;

/**
 * @author Anatoliy Sokolenko
 */
public interface Converter {

    me.sokolenko.test.compareConverters.model.target.Category map(Category source);

}
