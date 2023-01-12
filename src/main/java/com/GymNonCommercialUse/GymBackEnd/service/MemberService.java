package com.GymNonCommercialUse.GymBackEnd.service;

import com.GymNonCommercialUse.GymBackEnd.dto.MemberDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberSaveRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateQueryReqDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateRequestFilterDTO;
import javassist.NotFoundException;

import java.util.List;

public interface MemberService {

    String addmember(MemberSaveRequestDTO memberSaveRequestDTO);

    String updateMember(MemberUpdateRequestDTO memberUpdateRequestDTO);

    MemberDTO getMemberByID(int id);

    List<MemberDTO> getAllMembers();

    boolean deleteMember(int id) throws NotFoundException;

    List<MemberDTO> getByName(String memberName) throws NotFoundException;

    List<MemberDTO> getAllActiveState() throws NotFoundException;

    String updateMemberByQuery(MemberUpdateQueryReqDTO memberUpdateQueryReqDTO, int id);

    MemberDTO getMemberByNIC(String nic);

    String updateMember(MemberUpdateRequestFilterDTO memberUpdateRequestFilter, int id);

    MemberDTO getMemberByIDIsActive(int id);
}
