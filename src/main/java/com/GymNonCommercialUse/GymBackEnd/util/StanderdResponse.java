package com.GymNonCommercialUse.GymBackEnd.util;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StanderdResponse {
    private int code;
    private String message;
    private Object data;
}
