package com.GymNonCommercialUse.GymBackEnd.util.mappers;

import com.GymNonCommercialUse.GymBackEnd.dto.MemberDTO;
import com.GymNonCommercialUse.GymBackEnd.entity.Member;
import org.mapstruct.Mapper;

// use mapstruct

@Mapper(componentModel = "spring")
public interface MemberMapper {

    MemberDTO entityToDTO(Member member);
}
