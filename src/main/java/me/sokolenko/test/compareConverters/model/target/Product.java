package me.sokolenko.test.compareConverters.model.target;

import java.util.Map;

/**
 * @author Anatoliy Sokolenko
 */
public class Product {

    private Integer id;

    private Price price;

    private Availability availability;

    private String indicator;

    private boolean enabled;

    private String addByApp;

    private String description;

    private String code;

    private Boolean expired;

    private double surchargeFee;

    private boolean history;

    private boolean orderable;

    private boolean backorderable;

    private Map<String, Parameter> parameters;

    private Boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAddByApp() {
        return addByApp;
    }

    public void setAddByApp(String addByApp) {
        this.addByApp = addByApp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public double getSurchargeFee() {
        return surchargeFee;
    }

    public void setSurchargeFee(double surchargeFee) {
        this.surchargeFee = surchargeFee;
    }

    public boolean isHistory() {
        return history;
    }

    public void setHistory(boolean history) {
        this.history = history;
    }

    public boolean isOrderable() {
        return orderable;
    }

    public void setOrderable(boolean orderable) {
        this.orderable = orderable;
    }

    public boolean isBackorderable() {
        return backorderable;
    }

    public void setBackorderable(boolean backorderable) {
        this.backorderable = backorderable;
    }

    public Map<String, Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
