package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
  private Long orderPK;
  private Customer customer;
  private Jeep model;
  private Color color;
  private Engine engine;
  private Tire tire;
  private List<Option> options;
  private BigDecimal price;
  
  @JsonIgnore
  public Long getOrderPK() {
    return orderPK;
  }
}
