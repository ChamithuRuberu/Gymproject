package com.GymNonCommercialUse.GymBackEnd.repository;

import com.GymNonCommercialUse.GymBackEnd.entity.OderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@EnableJpaRepositories
@Repository
@Transactional
public interface OderDetailsRepo extends JpaRepository<OderDetails,Integer> {
}
