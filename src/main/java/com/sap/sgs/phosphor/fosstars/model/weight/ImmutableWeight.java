package com.sap.sgs.phosphor.fosstars.model.weight;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sap.sgs.phosphor.fosstars.model.Weight;
import com.sap.sgs.phosphor.fosstars.model.tuning.Parameter;
import java.util.Objects;

/**
 * An immutable weight.
 */
public class ImmutableWeight extends AbstractWeight {

  /**
   * Weight value.
   */
  private final double value;

  @JsonCreator
  public ImmutableWeight(@JsonProperty("value") double value) {
    this.value = Weight.check(value);
  }

  @Override
  public Parameter value(double v) {
    throw new UnsupportedOperationException("You can't update me because I am immutable!");
  }

  @Override
  @JsonGetter("value")
  public final Double value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof ImmutableWeight == false) {
      return false;
    }
    ImmutableWeight weight = (ImmutableWeight) o;
    return Double.compare(weight.value, value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}