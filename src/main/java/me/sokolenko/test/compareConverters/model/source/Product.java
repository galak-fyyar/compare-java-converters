package me.sokolenko.test.compareConverters.model.source;

import java.util.Map;
import java.util.Objects;

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

    private Map<String, Parameter> attributes;

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

    public Map<String, Parameter> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Parameter> attributes) {
        this.attributes = attributes;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.price);
        hash = 71 * hash + Objects.hashCode(this.availability);
        hash = 71 * hash + Objects.hashCode(this.indicator);
        hash = 71 * hash + (this.enabled ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.addByApp);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.code);
        hash = 71 * hash + Objects.hashCode(this.expired);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.surchargeFee) ^ (Double.doubleToLongBits(this.surchargeFee) >>> 32));
        hash = 71 * hash + (this.history ? 1 : 0);
        hash = 71 * hash + (this.orderable ? 1 : 0);
        hash = 71 * hash + (this.backorderable ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.attributes);
        hash = 71 * hash + Objects.hashCode(this.active);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.availability, other.availability)) {
            return false;
        }
        if (!Objects.equals(this.indicator, other.indicator)) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        if (!Objects.equals(this.addByApp, other.addByApp)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.expired, other.expired)) {
            return false;
        }
        if (Double.doubleToLongBits(this.surchargeFee) != Double.doubleToLongBits(other.surchargeFee)) {
            return false;
        }
        if (this.history != other.history) {
            return false;
        }
        if (this.orderable != other.orderable) {
            return false;
        }
        if (this.backorderable != other.backorderable) {
            return false;
        }
        if (!Objects.equals(this.attributes, other.attributes)) {
            return false;
        }
        if (!Objects.equals(this.active, other.active)) {
            return false;
        }
        return true;
    }
}
