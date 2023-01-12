package com.GymNonCommercialUse.GymBackEnd.service.impl;
import com.GymNonCommercialUse.GymBackEnd.dto.WorkoutDTO;
import com.GymNonCommercialUse.GymBackEnd.entity.Workout;
import com.GymNonCommercialUse.GymBackEnd.repository.WorkoutRepo;
import com.GymNonCommercialUse.GymBackEnd.service.WorkOutService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorkOutServiceIMPL implements WorkOutService {

    @Autowired
    private WorkoutRepo workoutRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public String addworkot(WorkoutDTO workoutDTO) {

        Workout workout = new Workout(
                workoutDTO.getWorkoutId(),
                workoutDTO.getT_workout()
        );
        workoutRepo.save(workout);
        return workout.getWorkoutId()+"saved..!";
    }
}
