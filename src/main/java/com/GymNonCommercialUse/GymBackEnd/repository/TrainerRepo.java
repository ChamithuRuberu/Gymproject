package com.GymNonCommercialUse.GymBackEnd.repository;

import com.GymNonCommercialUse.GymBackEnd.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface TrainerRepo extends JpaRepository<Trainer,Integer> {
}
