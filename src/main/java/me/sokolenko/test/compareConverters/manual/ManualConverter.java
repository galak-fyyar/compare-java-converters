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

    private List<Resource> toTargetAssets(List<me.sokolenko.test.compareConverters.model.source.Resource> source) {
        List<Resource> target = new ArrayList<Resource>();

        for (me.sokolenko.test.compareConverters.model.source.Resource sourceAsset : source) {
            target.add(toTarget(sourceAsset));
        }

        return target;
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

    private List<Link> toTargetLinks(List<me.sokolenko.test.compareConverters.model.source.Link> source) {
        List<Link> target = new ArrayList<Link>();

        for (me.sokolenko.test.compareConverters.model.source.Link sourceLink : source) {
            target.add(toTarget(sourceLink));
        }

        return target;
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

    private LinkType toTarget(me.sokolenko.test.compareConverters.model.source.LinkType source) {
        return LinkType.valueOf(source.name());
    }

    private ResourceType toTarget(me.sokolenko.test.compareConverters.model.source.ResourceType source) {
        return ResourceType.valueOf(source.name());
    }

    private Brand toTarget(me.sokolenko.test.compareConverters.model.source.Brand source) {
        Brand target = new Brand();
        target.setBrandName(source.getBrandName());
        target.setRightOwner(source.getRightOwner());

        return target;
    }

    private List<Image> toTargetImages(List<me.sokolenko.test.compareConverters.model.source.Image> source) {
        List<Image> target = new ArrayList<Image>();

        for (me.sokolenko.test.compareConverters.model.source.Image sourceImage : source) {
            target.add(toTarget(sourceImage));
        }

        return target;
    }

    private Image toTarget(me.sokolenko.test.compareConverters.model.source.Image source) {
        Image target = new Image();
        target.setName(source.getName());
        target.setSeq(source.getSeq());

        return target;
    }

    private ParentCategory toTarget(me.sokolenko.test.compareConverters.model.source.ParentCategory source) {
        ParentCategory target = new ParentCategory();
        target.setId(source.getId());
        target.setName(source.getName());

        return target;
    }

    private List<Parameter> toTargetParameters(List<me.sokolenko.test.compareConverters.model.source.Parameter> source) {
        List<Parameter> target = new ArrayList<Parameter>(source.size());

        for (me.sokolenko.test.compareConverters.model.source.Parameter sourceParameter : source) {
            target.add(toTarget(sourceParameter));
        }

        return target;
    }

    private ShippingRule toTarget(me.sokolenko.test.compareConverters.model.source.ShippingRule source) {
        ShippingRule target = new ShippingRule();
        target.setReturnConstraints(source.getReturnConstraints());
        target.setNotes(source.getNotes());
        target.setGiftable(source.getGiftable());
        target.setShipDays(source.getShipDays());

        return target;
    }

    private ArrayList<Product> toTarget(List<me.sokolenko.test.compareConverters.model.source.Product> source) {
        ArrayList<Product> products = new ArrayList<Product>();
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

    private Map<String, Parameter> toTarget(Map<String, me.sokolenko.test.compareConverters.model.source.Parameter> source) {
        Map<String, Parameter> target = new HashMap<String, Parameter>(source.size());

        for (Map.Entry<String, me.sokolenko.test.compareConverters.model.source.Parameter> sourceEntry : source.entrySet()) {
            target.put(sourceEntry.getKey(), toTarget(sourceEntry.getValue()));
        }

        return target;
    }

    private Parameter toTarget(me.sokolenko.test.compareConverters.model.source.Parameter source) {
        Parameter target = new Parameter();
        target.setName(source.getName());
        target.setHidden(source.isHidden());
        target.setOrder(source.getOrder());

        List<String> targetValues = new ArrayList<String>();
        for (String sourceValue : source.getValues()) {
            targetValues.add(sourceValue);
        }

        target.setValues(targetValues);

        return target;
    }

    private Availability toTarget(me.sokolenko.test.compareConverters.model.source.Availability source) {
        Availability target = new Availability();
        target.setSource(source.getSource());
        target.setAvailable(source.isAvailable());

        return target;
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
}
