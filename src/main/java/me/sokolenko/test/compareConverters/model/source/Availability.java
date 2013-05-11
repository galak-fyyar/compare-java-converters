package me.sokolenko.test.compareConverters.model.source;

/**
 * @author Anatoliy Sokolenko
 */
public class Availability {

    private Boolean available;

    private String source;

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
