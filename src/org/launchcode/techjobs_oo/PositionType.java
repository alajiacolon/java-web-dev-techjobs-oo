package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField{

    public PositionType() {
        id = nextId;
        nextId++;
    }
    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id &&
                Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }


}
