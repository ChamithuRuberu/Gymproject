package com.GymNonCommercialUse.GymBackEnd.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "member")

public class Member {
    @Id
    @Column(name = "member_id", length = 10)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int memberId;

    @Column(name = "name",length = 30)
    private String  memberName;

    @Column(name ="nic",length =13,unique = true)
    private String memberNic;

    @Column(name = "age",length = 10)
    private int memberAge;

    @Column(name = "gender")
    private String memberGender;

    @Column(name = "contact",length = 50,unique = true)
    private int memberContact;

    @Column(name = "address",length = 20)
    private String memberAddress;

    @Column(name = "email",unique = true)
    private String memberEmail;

    @Column(name = "weight")
    private int memberWeight;

    @Column(name = "height")
    private int memberHeight;

    @Column(name = "health_issue")
    private String memberHealthIssue;

    @Column(name = "medicines")
    private String memberMedicines;

    @Column(name = "job_position")
    private String memberJobPosition;

    @Column(name = "registerd_date")
    private String registerd_date;

    @Column(name = "others")
    private String others;

    @Column(name = "instructor")
    private String memberInstructor;

    @Column(name = "active_state",columnDefinition = "TINYINT default 1")
    private boolean activestate;



    @OneToMany(mappedBy="member")
    private Set<Oder>oders;


    public Member() {
    }

    public Member(int memberId, String memberName, String memberNic, int memberAge, String memberGender, int memberContact, String memberAddress, String memberEmail, int memberWeight, int memberHeight, String memberHealthIssue, String memberMedicines, String memberJobPosition, String registerd_date, String others, String memberInstructor, boolean activestate) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberNic = memberNic;
        this.memberAge = memberAge;
        this.memberGender = memberGender;
        this.memberContact = memberContact;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberWeight = memberWeight;
        this.memberHeight = memberHeight;
        this.memberHealthIssue = memberHealthIssue;
        this.memberMedicines = memberMedicines;
        this.memberJobPosition = memberJobPosition;
        this.registerd_date = registerd_date;
        this.others = others;
        this.memberInstructor = memberInstructor;
        this.activestate = activestate;
    }

    // full arg constructor without memberid to implement memberid++
    public Member(String memberName, String memberNic, int memberAge, String memberGender, int memberContact, String memberAddress, String memberEmail, int memberWeight, int memberHeight, String memberHealthIssue, String memberMedicines, String memberJobPosition, String registerd_date, String others, String memberInstructor, boolean activestate) {
        this.memberName = memberName;
        this.memberNic = memberNic;
        this.memberAge = memberAge;
        this.memberGender = memberGender;
        this.memberContact = memberContact;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberWeight = memberWeight;
        this.memberHeight = memberHeight;
        this.memberHealthIssue = memberHealthIssue;
        this.memberMedicines = memberMedicines;
        this.memberJobPosition = memberJobPosition;
        this.registerd_date = registerd_date;
        this.others = others;
        this.memberInstructor = memberInstructor;
        this.activestate = activestate;
    }

    public int getMemberId() {return memberId;}

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNic() {
        return memberNic;
    }

    public void setMemberNic(String memberNic) {
        this.memberNic = memberNic;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public int getMemberContact() {
        return memberContact;
    }

    public void setMemberContact(int memberContact) {
        this.memberContact = memberContact;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public int getMemberWeight() {
        return memberWeight;
    }

    public void setMemberWeight(int memberWeight) {
        this.memberWeight = memberWeight;
    }

    public int getMemberHeight() {
        return memberHeight;
    }

    public void setMemberHeight(int memberHeight) {
        this.memberHeight = memberHeight;
    }

    public String getMemberHealthIssue() {
        return memberHealthIssue;
    }

    public void setMemberHealthIssue(String memberHealthIssue) {
        this.memberHealthIssue = memberHealthIssue;
    }

    public String getMemberMedicines() {
        return memberMedicines;
    }

    public void setMemberMedicines(String memberMedicines) {
        this.memberMedicines = memberMedicines;
    }

    public String getMemberJobPosition() {
        return memberJobPosition;
    }

    public void setMemberJobPosition(String memberJobPosition) {
        this.memberJobPosition = memberJobPosition;
    }

    public String getRegisterd_date() {
        return registerd_date;
    }

    public void setRegisterd_date(String registerd_date) {
        this.registerd_date = registerd_date;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getMemberInstructor() {
        return memberInstructor;
    }

    public void setMemberInstructor(String memberInstructor) {
        this.memberInstructor = memberInstructor;
    }

    public boolean isActivestate() {
        return activestate;
    }

    public void setActivestate(boolean activestate) {
        this.activestate = activestate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberNic='" + memberNic + '\'' +
                ", memberAge=" + memberAge +
                ", memberGender='" + memberGender + '\'' +
                ", memberContact=" + memberContact +
                ", memberAddress='" + memberAddress + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberWeight=" + memberWeight +
                ", memberHeight=" + memberHeight +
                ", memberHealthIssue='" + memberHealthIssue + '\'' +
                ", memberMedicines='" + memberMedicines + '\'' +
                ", memberJobPosition='" + memberJobPosition + '\'' +
                ", registerd_date='" + registerd_date + '\'' +
                ", others='" + others + '\'' +
                ", memberInstructor='" + memberInstructor + '\'' +
                ", activestate=" + activestate +
                '}';
    }
}