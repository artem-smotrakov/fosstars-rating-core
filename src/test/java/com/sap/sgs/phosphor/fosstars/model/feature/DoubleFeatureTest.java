package com.sap.sgs.phosphor.fosstars.model.feature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.sgs.phosphor.fosstars.model.Value;
import java.io.IOException;
import org.junit.Test;

public class DoubleFeatureTest {

  @Test
  public void serializeAndDeserialize() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    DoubleFeature feature = new DoubleFeature("test");
    byte[] bytes = mapper.writeValueAsBytes(feature);
    assertNotNull(bytes);
    assertTrue(bytes.length > 0);

    DoubleFeature clone = mapper.readValue(bytes, DoubleFeature.class);
    assertNotNull(clone);
    assertEquals(feature, clone);
    assertEquals(feature.hashCode(), clone.hashCode());
  }

  @Test
  public void equalsAndHashCode() {
    DoubleFeature one = new DoubleFeature("one");
    DoubleFeature two = new DoubleFeature("two");
    DoubleFeature anotherOne = new DoubleFeature("one");

    assertNotEquals(one, two);
    assertEquals(one, anotherOne);

    assertNotEquals(one.hashCode(), two.hashCode());
    assertEquals(one.hashCode(), anotherOne.hashCode());
  }

  @Test
  public void value() {
    Value<Double> value = new DoubleFeature("test").value(10.2);
    assertNotNull(value);
    assertEquals(10.2, value.get(), 0.001);
  }

  @Test
  public void parseValidDouble() {
    Value<Double> value = new DoubleFeature("test").parse("10.2");
    assertNotNull(value);
    assertEquals(10.2, value.get(), 0.001);
  }

  @Test(expected = NumberFormatException.class)
  public void parseInvalidDouble() {
    new DoubleFeature("test").parse("a");
  }
}
