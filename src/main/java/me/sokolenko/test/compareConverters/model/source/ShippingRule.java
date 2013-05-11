package me.sokolenko.test.compareConverters.model.source;

import java.util.List;
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
}
