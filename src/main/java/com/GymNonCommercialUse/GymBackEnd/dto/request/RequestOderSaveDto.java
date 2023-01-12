package com.GymNonCommercialUse.GymBackEnd.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;



@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RequestOderSaveDto {

    private int member;
    private Date date;
    private Double total;
    private List<RequestoderDetailsSaveDTO> oderDetails;

}
