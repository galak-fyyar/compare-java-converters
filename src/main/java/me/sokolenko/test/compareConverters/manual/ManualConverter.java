package me.sokolenko.test.compareConverters.manual;

import me.sokolenko.test.compareConverters.Converter;
import me.sokolenko.test.compareConverters.model.target.Resource;
import me.sokolenko.test.compareConverters.model.target.ResourceType;
import me.sokolenko.test.compareConverters.model.target.Parameter;
import me.sokolenko.test.compareConverters.model.target.Availability;
import me.sokolenko.test.compareConverters.model.target.Brand;
import me.sokolenko.test.compareConverters.model.target.Category;
import me.sokolenko.test.compareConverters.model.target.Image;
import me.sokolenko.test.compareConverters.model.target.Link;
import me.sokolenko.test.compareConverters.model.target.LinkType;
import me.sokolenko.test.compareConverters.model.target.ParentCategory;
import me.sokolenko.test.compareConverters.model.target.Price;
import me.sokolenko.test.compareConverters.model.target.Product;
import me.sokolenko.test.compareConverters.model.target.ShippingRule;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anatoliy Sokolenko
 */
public class ManualConverter implements Converter {
    @Override
    public Category map(me.sokolenko.test.compareConverters.model.source.Category source) {
        Category target = new Category();
        target.setId(source.getId());
        target.setCategoryName(source.getName());
        target.setProducts(toTarget(source.getProducts()));
        target.setShipping(toTarget(source.getShipping()));
        target.setUrl(source.getUrl());
        target.setVisible(source.isVisible());
        target.setType(source.getType());
        target.setHasChildren(source.isHasChildren());
        target.setRelatedIds(source.getRelatedIds());
        target.setFrom(new Date(source.getFrom().getTime()));
        target.setClearanceStartDays(source.getClearanceStartDays());
        target.setPosition(source.getPosition());
        target.setCountryEligible(source.getCountryEligible());
        target.setNew(source.isNew());
        target.setActive(source.getActive());
        target.setParameters(toTargetParameters(source.getParameters()));
        target.setPrimaryImageSource(source.getPrimaryImageSource());
        target.setPrimaryPortraitSource(source.getPrimaryPortraitSource());
        target.setAvailableTo(source.getAvailableTo());
        target.setAuthor(source.getAuthor());
        target.setCreatedAt(new Date(source.getCreatedAt().getTime()));
        target.setUpdatedAt(new Date(source.getUpdatedAt().getTime()));
        target.setParentCategory(toTarget(source.getParentCategory()));
        target.setDomainValues(source.getDomainValues());
        target.setPrimaryImage(toTarget(source.getPrimaryImage()));
        target.setSecondaryImages(toTargetImages(source.getSecondaryImages()));
        target.setBrand(toTarget(source.getBrand()));
        target.setPopularity(source.getPopularity());
        target.setCopies(source.getCopies());
        target.setResources(toTargetAssets(source.getResources()));

        return target;
    }

    @Override
    public me.sokolenko.test.compareConverters.model.source.Category unmap(Category target) {
        me.sokolenko.test.compareConverters.model.source.Category source = new me.sokolenko.test.compareConverters.model.source.Category();
        source.setId(target.getId());
        source.setName(target.getCategoryName());
        source.setProducts(toSource(target.getProducts()));
        source.setShipping(toSource(target.getShipping()));
        source.setUrl(target.getUrl());
        source.setVisible(target.isVisible());
        source.setType(target.getType());
        source.setHasChildren(target.isHasChildren());
        source.setRelatedIds(target.getRelatedIds());
        source.setFrom(new Date(target.getFrom().getTime()));
        source.setClearanceStartDays(target.getClearanceStartDays());
        source.setPosition(target.getPosition());
        source.setCountryEligible(target.getCountryEligible());
        source.setNew(target.isNew());
        source.setActive(target.getActive());
        source.setParameters(toSourceParameters(target.getParameters()));
        source.setPrimaryImageSource(target.getPrimaryImageSource());
        source.setPrimaryPortraitSource(target.getPrimaryPortraitSource());
        source.setAvailableTo(target.getAvailableTo());
        source.setAuthor(target.getAuthor());
        source.setCreatedAt(new Date(target.getCreatedAt().getTime()));
        source.setUpdatedAt(new Date(target.getUpdatedAt().getTime()));
        source.setParentCategory(toSource(target.getParentCategory()));
        source.setDomainValues(target.getDomainValues());
        source.setPrimaryImage(toSource(target.getPrimaryImage()));
        source.setSecondaryImages(toSourceImages(target.getSecondaryImages()));
        source.setBrand(toSource(target.getBrand()));
        source.setPopularity(target.getPopularity());
        source.setCopies(target.getCopies());
        source.setResources(toSourceAssets(target.getResources()));

        return source;
    }

    private List<Resource> toTargetAssets(List<me.sokolenko.test.compareConverters.model.source.Resource> source) {
        List<Resource> target = new ArrayList<>();

        for (me.sokolenko.test.compareConverters.model.source.Resource sourceAsset : source) {
            target.add(toTarget(sourceAsset));
        }

        return target;
    }

    private List<me.sokolenko.test.compareConverters.model.source.Resource> toSourceAssets(List<Resource> target) {
        List<me.sokolenko.test.compareConverters.model.source.Resource> source = new ArrayList<>();

        for (Resource sourceAsset : target) {
            source.add(toSource(sourceAsset));
        }

        return source;
    }

    private Resource toTarget(me.sokolenko.test.compareConverters.model.source.Resource source) {
        Resource target = new Resource();
        target.setId(source.getId());
        target.setDescription(source.getDescription());
        target.setFileName(source.getFileName());
        target.setLinks(toTargetLinks(source.getLinks()));
        target.setHeight(source.getHeight());
        target.setWidth(source.getWidth());
        target.setText(source.getText());
        target.setType(toTarget(source.getType()));
        target.setParameters(toTargetParameters(source.getParameters()));

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.Resource toSource(Resource target) {
        me.sokolenko.test.compareConverters.model.source.Resource source = new me.sokolenko.test.compareConverters.model.source.Resource();
        source.setId(target.getId());
        source.setDescription(target.getDescription());
        source.setFileName(target.getFileName());
        source.setLinks(toSourceLinks(target.getLinks()));
        source.setHeight((int) target.getHeight());
        source.setWidth((int) target.getWidth());
        source.setText(target.getText());
        source.setType(toSource(target.getType()));
        source.setParameters(toSourceParameters(target.getParameters()));

        return source;
    }

    private List<Link> toTargetLinks(List<me.sokolenko.test.compareConverters.model.source.Link> source) {
        List<Link> target = new ArrayList<>();

        for (me.sokolenko.test.compareConverters.model.source.Link sourceLink : source) {
            target.add(toTarget(sourceLink));
        }

        return target;
    }

    private List<me.sokolenko.test.compareConverters.model.source.Link> toSourceLinks(List<Link> target) {
        List<me.sokolenko.test.compareConverters.model.source.Link> source = new ArrayList<>();

        for (Link targetLink : target) {
            source.add(toSource(targetLink));
        }

        return source;
    }

    private Link toTarget(me.sokolenko.test.compareConverters.model.source.Link source) {
        Link target = new Link();
        target.setText(source.getText());
        target.setPosition(source.getPosition());
        target.setParameters(toTargetParameters(source.getParameters()));
        target.setLinkType(toTarget(source.getLinkType()));
        target.setValue(source.getValue());

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.Link toSource(Link target) {
        me.sokolenko.test.compareConverters.model.source.Link source = new me.sokolenko.test.compareConverters.model.source.Link();
        source.setText(target.getText());
        source.setPosition(target.getPosition());
        source.setParameters(toSourceParameters(target.getParameters()));
        source.setLinkType(toSource(target.getLinkType()));
        source.setValue(target.getValue());

        return source;
    }

    private LinkType toTarget(me.sokolenko.test.compareConverters.model.source.LinkType source) {
        return LinkType.valueOf(source.name());
    }

    private me.sokolenko.test.compareConverters.model.source.LinkType toSource(LinkType target) {
        return me.sokolenko.test.compareConverters.model.source.LinkType.valueOf(target.name());
    }

    private ResourceType toTarget(me.sokolenko.test.compareConverters.model.source.ResourceType source) {
        return ResourceType.valueOf(source.name());
    }

    private me.sokolenko.test.compareConverters.model.source.ResourceType toSource(ResourceType target) {
        return me.sokolenko.test.compareConverters.model.source.ResourceType.valueOf(target.name());
    }

    private Brand toTarget(me.sokolenko.test.compareConverters.model.source.Brand source) {
        Brand target = new Brand();
        target.setBrandName(source.getBrandName());
        target.setRightOwner(source.getRightOwner());

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.Brand toSource(Brand target) {
        me.sokolenko.test.compareConverters.model.source.Brand source = new me.sokolenko.test.compareConverters.model.source.Brand();
        source.setBrandName(target.getBrandName());
        source.setRightOwner(target.getRightOwner());

        return source;
    }

    private List<Image> toTargetImages(List<me.sokolenko.test.compareConverters.model.source.Image> source) {
        List<Image> target = new ArrayList<>();

        for (me.sokolenko.test.compareConverters.model.source.Image sourceImage : source) {
            target.add(toTarget(sourceImage));
        }

        return target;
    }

    private List<me.sokolenko.test.compareConverters.model.source.Image> toSourceImages(List<Image> target) {
        List<me.sokolenko.test.compareConverters.model.source.Image> source = new ArrayList<>();

        for (Image targetImage : target) {
            source.add(toSource(targetImage));
        }

        return source;
    }

    private Image toTarget(me.sokolenko.test.compareConverters.model.source.Image source) {
        Image target = new Image();
        target.setName(source.getName());
        target.setSeq(source.getSeq());

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.Image toSource(Image target) {
        me.sokolenko.test.compareConverters.model.source.Image source = new me.sokolenko.test.compareConverters.model.source.Image();
        source.setName(target.getName());
        source.setSeq(target.getSeq());

        return source;
    }

    private ParentCategory toTarget(me.sokolenko.test.compareConverters.model.source.ParentCategory source) {
        ParentCategory target = new ParentCategory();
        target.setId(source.getId());
        target.setName(source.getName());

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.ParentCategory toSource(ParentCategory target) {
        me.sokolenko.test.compareConverters.model.source.ParentCategory source = new me.sokolenko.test.compareConverters.model.source.ParentCategory();
        source.setId(target.getId());
        source.setName(target.getName());

        return source;
    }

    private List<Parameter> toTargetParameters(List<me.sokolenko.test.compareConverters.model.source.Parameter> source) {
        List<Parameter> target = new ArrayList<>(source.size());

        for (me.sokolenko.test.compareConverters.model.source.Parameter sourceParameter : source) {
            target.add(toTarget(sourceParameter));
        }

        return target;
    }

    private List<me.sokolenko.test.compareConverters.model.source.Parameter> toSourceParameters(List<Parameter> target) {
        List<me.sokolenko.test.compareConverters.model.source.Parameter> source = new ArrayList<>(target.size());

        for (Parameter targetParameter : target) {
            source.add(toSource(targetParameter));
        }

        return source;
    }

    private ShippingRule toTarget(me.sokolenko.test.compareConverters.model.source.ShippingRule source) {
        ShippingRule target = new ShippingRule();
        target.setReturnConstraints(source.getReturnConstraints());
        target.setNotes(source.getNotes());
        target.setGiftable(source.getGiftable());
        target.setShipDays(source.getShipDays());

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.ShippingRule toSource(ShippingRule target) {
        me.sokolenko.test.compareConverters.model.source.ShippingRule source = new me.sokolenko.test.compareConverters.model.source.ShippingRule();
        source.setReturnConstraints(target.getReturnConstraints());
        source.setNotes(target.getNotes());
        source.setGiftable(target.getGiftable());
        source.setShipDays(target.getShipDays());

        return source;
    }

    private ArrayList<Product> toTarget(List<me.sokolenko.test.compareConverters.model.source.Product> source) {
        ArrayList<Product> products = new ArrayList<>();
        for (me.sokolenko.test.compareConverters.model.source.Product sourceProduct : source) {
            Product targetProduct = new Product();
            targetProduct.setId(sourceProduct.getId());
            targetProduct.setPrice(toTarget(sourceProduct.getPrice()));
            targetProduct.setAvailability(toTarget(sourceProduct.getAvailability()));
            targetProduct.setIndicator(sourceProduct.getIndicator());
            targetProduct.setEnabled(sourceProduct.isEnabled());
            targetProduct.setAddByApp(sourceProduct.getAddByApp());
            targetProduct.setDescription(sourceProduct.getDescription());
            targetProduct.setCode(sourceProduct.getCode());
            targetProduct.setExpired(sourceProduct.getExpired());
            targetProduct.setSurchargeFee(sourceProduct.getSurchargeFee());
            targetProduct.setHistory(sourceProduct.isHistory());
            targetProduct.setOrderable(sourceProduct.isOrderable());
            targetProduct.setBackorderable(sourceProduct.isBackorderable());
            targetProduct.setParameters(toTarget(sourceProduct.getAttributes()));
            targetProduct.setActive(sourceProduct.getActive());

            products.add(targetProduct);
        }
        return products;
    }

    private ArrayList<me.sokolenko.test.compareConverters.model.source.Product> toSource(List<Product> target) {
        ArrayList<me.sokolenko.test.compareConverters.model.source.Product> products = new ArrayList<>();
        for (Product targetProduct : target) {
            me.sokolenko.test.compareConverters.model.source.Product sourceProduct = new me.sokolenko.test.compareConverters.model.source.Product();
            sourceProduct.setId(targetProduct.getId());
            sourceProduct.setPrice(toSource(targetProduct.getPrice()));
            sourceProduct.setAvailability(toSource(targetProduct.getAvailability()));
            sourceProduct.setIndicator(targetProduct.getIndicator());
            sourceProduct.setEnabled(targetProduct.isEnabled());
            sourceProduct.setAddByApp(targetProduct.getAddByApp());
            sourceProduct.setDescription(targetProduct.getDescription());
            sourceProduct.setCode(targetProduct.getCode());
            sourceProduct.setExpired(targetProduct.getExpired());
            sourceProduct.setSurchargeFee(targetProduct.getSurchargeFee());
            sourceProduct.setHistory(targetProduct.isHistory());
            sourceProduct.setOrderable(targetProduct.isOrderable());
            sourceProduct.setBackorderable(targetProduct.isBackorderable());
            sourceProduct.setAttributes(toSource(targetProduct.getParameters()));
            sourceProduct.setActive(targetProduct.getActive());

            products.add(sourceProduct);
        }
        return products;
    }

    private Map<String, Parameter> toTarget(Map<String, me.sokolenko.test.compareConverters.model.source.Parameter> source) {
        Map<String, Parameter> target = new HashMap<>(source.size());

        for (Map.Entry<String, me.sokolenko.test.compareConverters.model.source.Parameter> sourceEntry : source.entrySet()) {
            target.put(sourceEntry.getKey(), toTarget(sourceEntry.getValue()));
        }

        return target;
    }

    private Map<String, me.sokolenko.test.compareConverters.model.source.Parameter> toSource(Map<String, Parameter> target) {
        Map<String, me.sokolenko.test.compareConverters.model.source.Parameter> source = new HashMap<>(target.size());

        for (Map.Entry<String, Parameter> targetEntry : target.entrySet()) {
            source.put(targetEntry.getKey(), toSource(targetEntry.getValue()));
        }

        return source;
    }

    private Parameter toTarget(me.sokolenko.test.compareConverters.model.source.Parameter source) {
        Parameter target = new Parameter();
        target.setName(source.getName());
        target.setHidden(source.isHidden());
        target.setOrder(source.getOrder());

        List<String> targetValues = new ArrayList<>();
        for (String sourceValue : source.getValues()) {
            targetValues.add(sourceValue);
        }

        target.setValues(targetValues);

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.Parameter toSource(Parameter target) {
        me.sokolenko.test.compareConverters.model.source.Parameter source = new me.sokolenko.test.compareConverters.model.source.Parameter();
        source.setName(target.getName());
        source.setHidden(target.isHidden());
        source.setOrder(target.getOrder());

        List<String> sourceValues = new ArrayList<>();
        for (String targetValue : target.getValues()) {
            sourceValues.add(targetValue);
        }

        source.setValues(sourceValues);

        return source;
    }

    private Availability toTarget(me.sokolenko.test.compareConverters.model.source.Availability source) {
        Availability target = new Availability();
        target.setSource(source.getSource());
        target.setAvailable(source.isAvailable());

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.Availability toSource(Availability target) {
        me.sokolenko.test.compareConverters.model.source.Availability source = new me.sokolenko.test.compareConverters.model.source.Availability();
        source.setSource(target.getSource());
        source.setAvailable(target.isAvailable());

        return source;
    }

    private Price toTarget(me.sokolenko.test.compareConverters.model.source.Price source) {
        Price target = new Price();
        target.setOriginalPrice(source.getOriginalPrice());
        target.setPreviousPrice(source.getPreviousPrice());
        target.setRetailPrice(source.getRetailPrice());
        target.setSalePrice(source.getSalePrice());
        target.setFrom(new Date(source.getFrom().getTime()));
        target.setTo(new Date(source.getTo().getTime()));
        target.setDescription(source.getDescription());
        target.setOnSale(source.isOnSale());

        return target;
    }

    private me.sokolenko.test.compareConverters.model.source.Price toSource(Price target) {
        me.sokolenko.test.compareConverters.model.source.Price source = new me.sokolenko.test.compareConverters.model.source.Price();
        source.setOriginalPrice(target.getOriginalPrice());
        source.setPreviousPrice(target.getPreviousPrice());
        source.setRetailPrice(target.getRetailPrice());
        source.setSalePrice(target.getSalePrice());
        source.setFrom(new java.sql.Date(target.getFrom().getTime()));
        source.setTo(new java.sql.Date(target.getTo().getTime()));
        source.setDescription(target.getDescription());
        source.setOnSale(target.isOnSale());

        return source;
    }
}
