package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Engine {
  private Long enginePK;
  private String engineId;
  private Float sizeInLiters;
  private String name;
  private FuelType fuelType;
  private Float mpgCity;
  private Float mpgHwy;
  private boolean hasStartStop;
  private String description;
  private BigDecimal price;
}
