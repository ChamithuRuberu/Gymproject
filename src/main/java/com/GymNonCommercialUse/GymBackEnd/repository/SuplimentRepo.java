package com.GymNonCommercialUse.GymBackEnd.repository;

import com.GymNonCommercialUse.GymBackEnd.entity.Supliments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@EnableJpaRepositories
@Repository
@Transactional // use this annotation for implement query methods
public interface SuplimentRepo extends JpaRepository<Supliments,Integer> {

    List<Supliments> findAllByActivestateEquals(boolean status);

    int countAllByActivestateEquals( boolean b);

}
