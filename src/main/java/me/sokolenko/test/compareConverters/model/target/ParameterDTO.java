package me.sokolenko.test.compareConverters.model.target;

import java.util.List;

/**
 * @author Anatoliy Sokolenko
 */
public class ParameterDTO {

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
}
