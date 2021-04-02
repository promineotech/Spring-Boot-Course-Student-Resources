package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Option {
  private Long optionPK;
  private String optionId;
  private OptionType category;
  private String manufacturer;
  private String name;
  private BigDecimal price;
}
