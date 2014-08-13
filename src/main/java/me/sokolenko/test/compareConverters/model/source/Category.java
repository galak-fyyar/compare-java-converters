package me.sokolenko.test.compareConverters.model.source;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author Anatoliy Sokolenko
 */
public class Category {

    private int id;

    private String name;

    private List<Product> products;

    private ShippingRule shipping;

    private String url;

    private boolean visible;

    private String type;

    private boolean hasChildren;

    private List<Integer> relatedIds;

    private Date from;

    private Integer clearanceStartDays;

    private int position;

    private Boolean countryEligible;

    private boolean isNew;

    private Boolean active;

    private List<Parameter> parameters;

    private String primaryImageSource;

    private String primaryPortraitSource;

    private List<String> availableTo;

    private String author;

    private Date createdAt;

    private Date updatedAt;

    private ParentCategory parentCategory;

    private Collection<String> domainValues;

    private Image primaryImage;

    private List<Image> secondaryImages;

    private Brand brand;

    private Double popularity;

    private Integer copies;

    private List<Resource> resources;

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ShippingRule getShipping() {
        return shipping;
    }

    public void setShipping(ShippingRule shipping) {
        this.shipping = shipping;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public List<Integer> getRelatedIds() {
        return relatedIds;
    }

    public void setRelatedIds(List<Integer> relatedIds) {
        this.relatedIds = relatedIds;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Integer getClearanceStartDays() {
        return clearanceStartDays;
    }

    public void setClearanceStartDays(Integer clearanceStartDays) {
        this.clearanceStartDays = clearanceStartDays;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Boolean getCountryEligible() {
        return countryEligible;
    }

    public void setCountryEligible(Boolean countryEligible) {
        this.countryEligible = countryEligible;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getPrimaryImageSource() {
        return primaryImageSource;
    }

    public void setPrimaryImageSource(String primaryImageSource) {
        this.primaryImageSource = primaryImageSource;
    }

    public String getPrimaryPortraitSource() {
        return primaryPortraitSource;
    }

    public void setPrimaryPortraitSource(String primaryPortraitSource) {
        this.primaryPortraitSource = primaryPortraitSource;
    }

    public List<String> getAvailableTo() {
        return availableTo;
    }

    public void setAvailableTo(List<String> availableTo) {
        this.availableTo = availableTo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ParentCategory getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(ParentCategory parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Collection<String> getDomainValues() {
        return domainValues;
    }

    public void setDomainValues(Collection<String> domainValues) {
        this.domainValues = domainValues;
    }

    public Image getPrimaryImage() {
        return primaryImage;
    }

    public void setPrimaryImage(Image primaryImage) {
        this.primaryImage = primaryImage;
    }

    public List<Image> getSecondaryImages() {
        return secondaryImages;
    }

    public void setSecondaryImages(List<Image> secondaryImages) {
        this.secondaryImages = secondaryImages;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.products);
        hash = 97 * hash + Objects.hashCode(this.shipping);
        hash = 97 * hash + Objects.hashCode(this.url);
        hash = 97 * hash + (this.visible ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + (this.hasChildren ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.relatedIds);
        hash = 97 * hash + Objects.hashCode(this.from);
        hash = 97 * hash + Objects.hashCode(this.clearanceStartDays);
        hash = 97 * hash + this.position;
        hash = 97 * hash + Objects.hashCode(this.countryEligible);
        hash = 97 * hash + (this.isNew ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.active);
        hash = 97 * hash + Objects.hashCode(this.parameters);
        hash = 97 * hash + Objects.hashCode(this.primaryImageSource);
        hash = 97 * hash + Objects.hashCode(this.primaryPortraitSource);
        hash = 97 * hash + Objects.hashCode(this.availableTo);
        hash = 97 * hash + Objects.hashCode(this.author);
        hash = 97 * hash + Objects.hashCode(this.createdAt);
        hash = 97 * hash + Objects.hashCode(this.updatedAt);
        hash = 97 * hash + Objects.hashCode(this.parentCategory);
        hash = 97 * hash + Objects.hashCode(this.domainValues);
        hash = 97 * hash + Objects.hashCode(this.primaryImage);
        hash = 97 * hash + Objects.hashCode(this.secondaryImages);
        hash = 97 * hash + Objects.hashCode(this.brand);
        hash = 97 * hash + Objects.hashCode(this.popularity);
        hash = 97 * hash + Objects.hashCode(this.copies);
        hash = 97 * hash + Objects.hashCode(this.resources);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.products, other.products)) {
            return false;
        }
        if (!Objects.equals(this.shipping, other.shipping)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (this.visible != other.visible) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (this.hasChildren != other.hasChildren) {
            return false;
        }
        if (!Objects.equals(this.relatedIds, other.relatedIds)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.clearanceStartDays, other.clearanceStartDays)) {
            return false;
        }
        if (this.position != other.position) {
            return false;
        }
        if (!Objects.equals(this.countryEligible, other.countryEligible)) {
            return false;
        }
        if (this.isNew != other.isNew) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        if (!Objects.equals(this.parameters, other.parameters)) {
            return false;
        }
        if (!Objects.equals(this.primaryImageSource, other.primaryImageSource)) {
            return false;
        }
        if (!Objects.equals(this.primaryPortraitSource, other.primaryPortraitSource)) {
            return false;
        }
        if (!Objects.equals(this.availableTo, other.availableTo)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.createdAt, other.createdAt)) {
            return false;
        }
        if (!Objects.equals(this.updatedAt, other.updatedAt)) {
            return false;
        }
        if (!Objects.equals(this.parentCategory, other.parentCategory)) {
            return false;
        }
        if (!Objects.equals(this.domainValues, other.domainValues)) {
            return false;
        }
        if (!Objects.equals(this.primaryImage, other.primaryImage)) {
            return false;
        }
        if (!Objects.equals(this.secondaryImages, other.secondaryImages)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.popularity, other.popularity)) {
            return false;
        }
        if (!Objects.equals(this.copies, other.copies)) {
            return false;
        }
        if (!Objects.equals(this.resources, other.resources)) {
            return false;
        }
        return true;
    }
}
