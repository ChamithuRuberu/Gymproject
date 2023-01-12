package com.GymNonCommercialUse.GymBackEnd.dto;

public class WorkoutDTO {
    private int workoutId;
    private String t_workout;

    public WorkoutDTO() {
    }

    public WorkoutDTO(int workoutId, String t_workout) {
        this.workoutId = workoutId;
        this.t_workout = t_workout;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public String getT_workout() {
        return t_workout;
    }

    public void setT_workout(String t_workout) {
        this.t_workout = t_workout;
    }


    @Override
    public String toString() {
        return "WorkoutDTO{" +
                "workoutId=" + workoutId +
                ", t_workout='" + t_workout + '\'' +
                '}';
    }
}
