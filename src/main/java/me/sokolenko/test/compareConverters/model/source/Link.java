package me.sokolenko.test.compareConverters.model.source;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anatoliy Sokolenko
 */
public class Link {

    private String position;

    private String text;

    private LinkType linkType;

    private String value;

    private List<Parameter> parameters = new ArrayList<Parameter>();

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LinkType getLinkType() {
        return linkType;
    }

    public void setLinkType(LinkType linkType) {
        this.linkType = linkType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
