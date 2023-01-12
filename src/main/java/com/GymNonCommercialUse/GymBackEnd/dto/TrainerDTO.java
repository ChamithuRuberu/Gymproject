package com.GymNonCommercialUse.GymBackEnd.dto;

public class TrainerDTO {

    private int trainerId;
    private String trainerName;
    private String nic;
    private int age;
    private String gender;
    private String contact;
    private String address;
    private String email;
    private int weight;
    private int height;
    private String regDate;
    private String position;
    private String specific_For;
    private String others;

    public TrainerDTO() {
    }

    public TrainerDTO(int trainerId, String trainerName, String nic, int age, String gender, String contact, String address, String email, int weight, int height, String regDate, String position, String specific_For, String others) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.nic = nic;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.address = address;
        this.email = email;
        this.weight = weight;
        this.height = height;
        this.regDate = regDate;
        this.position = position;
        this.specific_For = specific_For;
        this.others = others;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecific_For() {
        return specific_For;
    }

    public void setSpecific_For(String specific_For) {
        this.specific_For = specific_For;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "TrainerDTO{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                ", nic='" + nic + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", regDate='" + regDate + '\'' +
                ", position='" + position + '\'' +
                ", specific_For='" + specific_For + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
