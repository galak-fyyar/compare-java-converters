package me.sokolenko.test.compareConverters.model.target;

import java.util.List;
import java.util.Objects;

/**
 * @author Anatoliy Sokolenko
 */
public class Parameter {

    private String name;

    private List<String> values;

    private int order;

    private boolean hidden;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.values);
        hash = 97 * hash + this.order;
        hash = 97 * hash + (this.hidden ? 1 : 0);
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
        final Parameter other = (Parameter) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.values, other.values)) {
            return false;
        }
        if (this.order != other.order) {
            return false;
        }
        if (this.hidden != other.hidden) {
            return false;
        }
        return true;
    }
}
