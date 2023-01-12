package com.GymNonCommercialUse.GymBackEnd.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SupliemnetSaveRequestDTO {

    private String suplimentName;
    private String measureUnit;
    private double quantity;
    private double supplierPrice;
    private double selling_price;

}
