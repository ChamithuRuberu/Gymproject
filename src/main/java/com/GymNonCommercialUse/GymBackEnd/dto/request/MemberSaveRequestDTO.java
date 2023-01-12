package com.GymNonCommercialUse.GymBackEnd.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberSaveRequestDTO {


    private String memberName;
    private String memberNic;
    private int memberAge;
    private String memberGender;
    private int memberContact;
    private String memberAddress;
    private String memberEmail;
    private int memberWeight;
    private int memberHeight;
    private String memberHealthIssue;
    private String memberMedicines;
    private String memberJobPosition;
    private String registerd_date;
    private String others;
    private String memberInstructor;

}