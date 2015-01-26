package me.sokolenko.test.compareConverters.model.target;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author Anatoliy Sokolenko
 */
public class Category {

    private int id;

    private String categoryName;

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

    private List<ParameterDTO> parameters;

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public List<ParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterDTO> parameters) {
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

    public void setBrand(Brand brandDTO) {
        this.brand = brandDTO;
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
}
