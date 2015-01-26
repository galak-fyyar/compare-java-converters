package me.sokolenko.test.compareConverters.model.target;

/**
 * @author Anatoliy Sokolenko
 */
public class Availability {

    private boolean available;

    private String source;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
