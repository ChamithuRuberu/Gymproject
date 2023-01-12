package com.GymNonCommercialUse.GymBackEnd.dto;

import com.GymNonCommercialUse.GymBackEnd.entity.enums.MeasuringUnitsType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class SuppliemntDTO {
    private int suplimntId;
    private String  suplimentName;
    private MeasuringUnitsType measureUnit;
    private double  quantity;
    private double  supplierPrice;
    private double  selling_price;

}
