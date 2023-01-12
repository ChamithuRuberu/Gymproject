package com.GymNonCommercialUse.GymBackEnd.controller;

import com.GymNonCommercialUse.GymBackEnd.dto.TrainerDTO;
import com.GymNonCommercialUse.GymBackEnd.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v2/trainer")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @PostMapping("/saveTrainer")
    public String saveTrainer(@RequestBody TrainerDTO trainerDTO){
        String id=trainerService.addtrainer(trainerDTO);
        return id;
    }
}
