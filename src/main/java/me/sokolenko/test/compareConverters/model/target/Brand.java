package me.sokolenko.test.compareConverters.model.target;

import java.util.Objects;

/**
 * @author Anatoliy Sokolenko
 */
public class Brand {

    private String brandName;

    private String rightOwner;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getRightOwner() {
        return rightOwner;
    }

    public void setRightOwner(String rightOwner) {
        this.rightOwner = rightOwner;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.brandName);
        hash = 79 * hash + Objects.hashCode(this.rightOwner);
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
        final Brand other = (Brand) obj;
        if (!Objects.equals(this.brandName, other.brandName)) {
            return false;
        }
        if (!Objects.equals(this.rightOwner, other.rightOwner)) {
            return false;
        }
        return true;
    }
}
