package me.sokolenko.test.compareConverters.mapstruct;

import me.sokolenko.test.compareConverters.Converter;
import me.sokolenko.test.compareConverters.model.source.*;
import me.sokolenko.test.compareConverters.model.target.ParameterDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author: joao.reis
 */
@Mapper
public interface MapStructConverter extends Converter {

    @Override
    @Mappings(
            @Mapping(source = "name", target = "categoryName")
    )
    public me.sokolenko.test.compareConverters.model.target.Category map(Category source);

    me.sokolenko.test.compareConverters.model.target.Resource resourceToTargetResource(Resource value);

    me.sokolenko.test.compareConverters.model.target.ResourceType resourceTypeToTargetResourceType(ResourceType value);

    me.sokolenko.test.compareConverters.model.target.Link linkToTargetLink(Link link);

    me.sokolenko.test.compareConverters.model.target.LinkType linkTypeToTargetLinkType(LinkType linkType);

    me.sokolenko.test.compareConverters.model.target.ParentCategory parentCategoryToTargetParentCategory(ParentCategory value);

    me.sokolenko.test.compareConverters.model.target.ShippingRule shippingRuleToTargetShippingRule(ShippingRule value);

    @Mappings(
            @Mapping(source = "attributes", target = "parameters")
    )
    me.sokolenko.test.compareConverters.model.target.Product productToTargetProduct(Product product);

    ParameterDTO parameterToTargetParameter(Parameter parameter);

    me.sokolenko.test.compareConverters.model.target.Image imageToTargetImage(Image value);

    me.sokolenko.test.compareConverters.model.target.Brand map(Brand value);

    me.sokolenko.test.compareConverters.model.target.Price priceToTargetPrice(Price price);

    me.sokolenko.test.compareConverters.model.target.Availability availabilityToTargetAvailability(Availability availability);
}
