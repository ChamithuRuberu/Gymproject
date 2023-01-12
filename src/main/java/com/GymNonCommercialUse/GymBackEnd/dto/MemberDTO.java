package com.GymNonCommercialUse.GymBackEnd.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {

    private int memberId;
    private String  memberName;
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
    private boolean activestate;

//    public MemberDTO() {
//    }
//
//    public MemberDTO(int memberId, String memberName, String memberNic, int memberAge, String memberGender, int memberContact, String memberAddress, String memberEmail, int memberWeight, int memberHeight, String memberHealthIssue, String memberMedicines, String memberJobPosition, String registerd_date, String others, String memberInstructor, boolean activestate) {
//        this.memberId = memberId;
//        this.memberName = memberName;
//        this.memberNic = memberNic;
//        this.memberAge = memberAge;
//        this.memberGender = memberGender;
//        this.memberContact = memberContact;
//        this.memberAddress = memberAddress;
//        this.memberEmail = memberEmail;
//        this.memberWeight = memberWeight;
//        this.memberHeight = memberHeight;
//        this.memberHealthIssue = memberHealthIssue;
//        this.memberMedicines = memberMedicines;
//        this.memberJobPosition = memberJobPosition;
//        this.registerd_date = registerd_date;
//        this.others = others;
//        this.memberInstructor = memberInstructor;
//        this.activestate = activestate;
//    }
//
//    public int getMemberId() {
//        return memberId;
//    }
//
//    public void setMemberId(int memberId) {
//        this.memberId = memberId;
//    }
//
//    public String getMemberName() {
//        return memberName;
//    }
//
//    public void setMemberName(String memberName) {
//        this.memberName = memberName;
//    }
//
//    public String getMemberNic() {
//        return memberNic;
//    }
//
//    public void setMemberNic(String memberNic) {
//        this.memberNic = memberNic;
//    }
//
//    public int getMemberAge() {
//        return memberAge;
//    }
//
//    public void setMemberAge(int memberAge) {
//        this.memberAge = memberAge;
//    }
//
//    public String getMemberGender() {
//        return memberGender;
//    }
//
//    public void setMemberGender(String memberGender) {
//        this.memberGender = memberGender;
//    }
//
//    public int getMemberContact() {
//        return memberContact;
//    }
//
//    public void setMemberContact(int memberContact) {
//        this.memberContact = memberContact;
//    }
//
//    public String getMemberAddress() {
//        return memberAddress;
//    }
//
//    public void setMemberAddress(String memberAddress) {
//        this.memberAddress = memberAddress;
//    }
//
//    public String getMemberEmail() {
//        return memberEmail;
//    }
//
//    public void setMemberEmail(String memberEmail) {
//        this.memberEmail = memberEmail;
//    }
//
//    public int getMemberWeight() {
//        return memberWeight;
//    }
//
//    public void setMemberWeight(int memberWeight) {
//        this.memberWeight = memberWeight;
//    }
//
//    public int getMemberHeight() {
//        return memberHeight;
//    }
//
//    public void setMemberHeight(int memberHeight) {
//        this.memberHeight = memberHeight;
//    }
//
//    public String getMemberHealthIssue() {
//        return memberHealthIssue;
//    }
//
//    public void setMemberHealthIssue(String memberHealthIssue) {
//        this.memberHealthIssue = memberHealthIssue;
//    }
//
//    public String getMemberMedicines() {
//        return memberMedicines;
//    }
//
//    public void setMemberMedicines(String memberMedicines) {
//        this.memberMedicines = memberMedicines;
//    }
//
//    public String getMemberJobPosition() {
//        return memberJobPosition;
//    }
//
//    public void setMemberJobPosition(String memberJobPosition) {
//        this.memberJobPosition = memberJobPosition;
//    }
//
//    public String getRegisterd_date() {
//        return registerd_date;
//    }
//
//    public void setRegisterd_date(String registerd_date) {
//        this.registerd_date = registerd_date;
//    }
//
//    public String getOthers() {
//        return others;
//    }
//
//    public void setOthers(String others) {
//        this.others = others;
//    }
//
//    public String getMemberInstructor() {
//        return memberInstructor;
//    }
//
//    public void setMemberInstructor(String memberInstructor) {
//        this.memberInstructor = memberInstructor;
//    }
//
//    public boolean isActivestate() {
//        return activestate;
//    }
//
//    public void setActivestate(boolean activestate) {
//        this.activestate = activestate;
//    }
//
//    @Override
//    public String toString() {
//        return "MemberDTO{" +
//                "memberId=" + memberId +
//                ", memberName='" + memberName + '\'' +
//                ", memberNic='" + memberNic + '\'' +
//                ", memberAge=" + memberAge +
//                ", memberGender='" + memberGender + '\'' +
//                ", memberContact=" + memberContact +
//                ", memberAddress='" + memberAddress + '\'' +
//                ", memberEmail='" + memberEmail + '\'' +
//                ", memberWeight=" + memberWeight +
//                ", memberHeight=" + memberHeight +
//                ", memberHealthIssue='" + memberHealthIssue + '\'' +
//                ", memberMedicines='" + memberMedicines + '\'' +
//                ", memberJobPosition='" + memberJobPosition + '\'' +
//                ", registerd_date='" + registerd_date + '\'' +
//                ", others='" + others + '\'' +
//                ", memberInstructor='" + memberInstructor + '\'' +
//                ", activestate=" + activestate +
//                '}';
//    }
}