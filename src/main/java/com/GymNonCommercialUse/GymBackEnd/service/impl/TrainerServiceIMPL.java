package com.GymNonCommercialUse.GymBackEnd.service.impl;
import com.GymNonCommercialUse.GymBackEnd.dto.TrainerDTO;
import com.GymNonCommercialUse.GymBackEnd.entity.Trainer;
import com.GymNonCommercialUse.GymBackEnd.repository.TrainerRepo;
import com.GymNonCommercialUse.GymBackEnd.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceIMPL implements TrainerService {
    @Autowired
    private TrainerRepo trainerRepo;


    @Override
    public String addtrainer(TrainerDTO trainerDTO) {

        Trainer trainer=new Trainer(
              trainerDTO.getTrainerId(),
              trainerDTO.getTrainerName(),
              trainerDTO.getNic(),
              trainerDTO.getAge(),
              trainerDTO.getGender(),
              trainerDTO.getContact(),
              trainerDTO.getAddress(),
              trainerDTO.getEmail(),
              trainerDTO.getWeight(),
              trainerDTO.getHeight(),
              trainerDTO.getRegDate(),
              trainerDTO.getPosition(),
              trainerDTO.getSpecific_For(),
              trainerDTO.getOthers()
        );
        trainerRepo.save(trainer);
        return trainer.getTrainerId()+" saved..!";
    }
}
