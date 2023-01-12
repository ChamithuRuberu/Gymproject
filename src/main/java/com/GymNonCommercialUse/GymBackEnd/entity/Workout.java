package com.GymNonCommercialUse.GymBackEnd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workout")
public class Workout {

    @Id
    @Column(name = "workout_id",length = 10)
    private int workoutId;

    @Column(name = "workout",length = 100)
    private String t_workout;

    public Workout() {
    }

    public Workout(int workoutId, String t_workout) {
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
        return "Workout{" +
                "workoutId=" + workoutId +
                ", t_workout='" + t_workout + '\'' +
                '}';
    }
}
