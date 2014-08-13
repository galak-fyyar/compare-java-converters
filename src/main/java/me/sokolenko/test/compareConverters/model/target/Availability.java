package me.sokolenko.test.compareConverters.model.target;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.available);
        hash = 97 * hash + Objects.hashCode(this.source);
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
        final Availability other = (Availability) obj;
        if (!Objects.equals(this.available, other.available)) {
            return false;
        }
        if (!Objects.equals(this.source, other.source)) {
            return false;
        }
        return true;
    }
}
