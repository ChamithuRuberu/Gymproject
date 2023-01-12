package com.GymNonCommercialUse.GymBackEnd.dto.request;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RequestoderDetailsSaveDTO {

    private String supplimentName;
    private int  quantity;
    private Double  amount;
    private int supliments;


}
