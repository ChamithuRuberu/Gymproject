package com.GymNonCommercialUse.GymBackEnd.repository;
import com.GymNonCommercialUse.GymBackEnd.dto.MemberDTO;
import com.GymNonCommercialUse.GymBackEnd.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
@Transactional
public interface MemberRepo extends JpaRepository<Member,Integer> {
    List<Member> findAllByMemberNameEquals(String memberName); // Also can be use "findAllByMemberNameIs"/ "readAllByMemberNameIs"......

    List<MemberDTO> findAllByActivestateEquals(boolean b);


    @Modifying
    @Query(value = "update member set age=?1,contact=?2,address=?3,email=?4,weight=?5,height=?6,health_issue=?7,medicines=?8,instructor=?9 where member_id=?10",nativeQuery = true)
    void updateMemberByQuery(int memberAge, int memberContact, String memberAddress, String memberEmail, int memberWeight, int memberHeight, String memberHealthIssue, String memberMedicines, String memberInstructor, int id);

    Optional<Member> findByMemberNicEquals(String nic);
}