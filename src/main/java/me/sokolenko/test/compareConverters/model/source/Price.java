package me.sokolenko.test.compareConverters.model.source;

import java.sql.Date;
import java.util.Objects;

/**
 * @author Anatoliy Sokolenko
 */
public class Price {

    private double originalPrice;

    private double previousPrice;

    private double retailPrice;

    private double salePrice;

    private Date from;

    private Date to;

    private String description;

    private boolean onSale;

    public Price() {
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(double previousPrice) {
        this.previousPrice = previousPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.originalPrice) ^ (Double.doubleToLongBits(this.originalPrice) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.previousPrice) ^ (Double.doubleToLongBits(this.previousPrice) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.retailPrice) ^ (Double.doubleToLongBits(this.retailPrice) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.salePrice) ^ (Double.doubleToLongBits(this.salePrice) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.from);
        hash = 67 * hash + Objects.hashCode(this.to);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (this.onSale ? 1 : 0);
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
        final Price other = (Price) obj;
        if (Double.doubleToLongBits(this.originalPrice) != Double.doubleToLongBits(other.originalPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.previousPrice) != Double.doubleToLongBits(other.previousPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.retailPrice) != Double.doubleToLongBits(other.retailPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.salePrice) != Double.doubleToLongBits(other.salePrice)) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.to, other.to)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.onSale != other.onSale) {
            return false;
        }
        return true;
    }
}
