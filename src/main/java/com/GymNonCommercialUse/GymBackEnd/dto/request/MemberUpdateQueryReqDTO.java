package com.GymNonCommercialUse.GymBackEnd.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberUpdateQueryReqDTO {
    private int memberAge;
    private int memberContact;
    private String memberAddress;
    private String memberEmail;
    private int memberWeight;
    private int memberHeight;
    private String memberHealthIssue;
    private String memberMedicines;
    private String memberInstructor;
}
