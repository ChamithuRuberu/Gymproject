package com.GymNonCommercialUse.GymBackEnd.controller;
import com.GymNonCommercialUse.GymBackEnd.dto.WorkoutDTO;
import com.GymNonCommercialUse.GymBackEnd.service.WorkOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v3/workout")
public class WorkoutController {

    @Autowired
    private WorkOutService workOutService;

    @PostMapping("/saveworkout")
    public String saveworkout(@RequestBody WorkoutDTO workoutDTO){
        String id =workOutService.addworkot(workoutDTO);
        return id;
    }
}
