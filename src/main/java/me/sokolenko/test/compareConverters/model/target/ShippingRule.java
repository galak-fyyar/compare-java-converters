package me.sokolenko.test.compareConverters.model.target;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @author Anatoliy Sokolenko
 */
public class ShippingRule {

    private Set<String> returnConstraints;

    private List<String> notes;

    private Boolean giftable;

    private int shipDays;

    public Set<String> getReturnConstraints() {
        return returnConstraints;
    }

    public void setReturnConstraints(Set<String> returnConstraints) {
        this.returnConstraints = returnConstraints;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Boolean getGiftable() {
        return giftable;
    }

    public void setGiftable(Boolean giftable) {
        this.giftable = giftable;
    }

    public int getShipDays() {
        return shipDays;
    }

    public void setShipDays(int shipDays) {
        this.shipDays = shipDays;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.returnConstraints);
        hash = 23 * hash + Objects.hashCode(this.notes);
        hash = 23 * hash + Objects.hashCode(this.giftable);
        hash = 23 * hash + this.shipDays;
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
        final ShippingRule other = (ShippingRule) obj;
        if (!Objects.equals(this.returnConstraints, other.returnConstraints)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        if (!Objects.equals(this.giftable, other.giftable)) {
            return false;
        }
        if (this.shipDays != other.shipDays) {
            return false;
        }
        return true;
    }
}
