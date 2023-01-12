package com.GymNonCommercialUse.GymBackEnd.controller;

import com.GymNonCommercialUse.GymBackEnd.dto.MemberDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberSaveRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateQueryReqDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateRequestFilterDTO;
import com.GymNonCommercialUse.GymBackEnd.service.MemberService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/saveMember")
    public String saveMember(@RequestBody MemberSaveRequestDTO memberSaveRequestDTO) {
        String id = memberService.addmember(memberSaveRequestDTO);
        return id;
    }

    @PutMapping("/updateMember")
    public String updateMameber(@RequestBody MemberUpdateRequestDTO memberUpdateRequestDTO) {
        String updated = memberService.updateMember(memberUpdateRequestDTO);
        return updated + "updated";
    }

    @GetMapping(
            path = "/get-by-id",
            params = "id"
    )
    public MemberDTO getCustomerById(@RequestParam(value = "id") int id) {
        MemberDTO memberDTO = memberService.getMemberByID(id);
        return memberDTO;
    }

    @GetMapping(
            path = "get-all-customer"
    )
    public List<MemberDTO> allMembers() {

        List<MemberDTO> allMembers = memberService.getAllMembers();
        return allMembers;
    }

    @DeleteMapping(
            path = {"/delete-member/{id}"}
    )
    public String deletemember(@PathVariable(value = "id") int id) throws NotFoundException {
        boolean deleteMember = memberService.deleteMember(id);
        return " deleted";
    }

    @GetMapping(
            path = {"/get-by-name"},
            params={"name"}
    )
    public List<MemberDTO> getmemberbyname(@RequestParam(value = "name")String memberName) throws NotFoundException {
        List<MemberDTO>getMember=memberService.getByName(memberName);
        return getMember;
    }

    @GetMapping(
            path = {"/get-by-active=State"}
    )
    public List<MemberDTO>GetByActiveState() throws NotFoundException {
        List<MemberDTO>getmember=memberService.getAllActiveState();
        return getmember;
    }

    @PutMapping("/update-query/{id}")
    public String updateMemberByQuery(
            @RequestBody MemberUpdateQueryReqDTO memberUpdateQueryReqDTO,
            @PathVariable(value = "id")int id) {
        String updated = memberService.updateMemberByQuery(memberUpdateQueryReqDTO,id);
       return updated;
    }

    @GetMapping(
            path = "/get-by-Nic",
            params = "Nic"
    )
    public MemberDTO GetMemberByNIC(@RequestParam(value = "Nic") String nic) {
        MemberDTO memberDTO = memberService.getMemberByNIC(nic);
        return memberDTO;
    }

    @PutMapping(
            path = {"/updateMember_request/{id}"}
    )
    public String MemberUpdateRequestFilter(
            @RequestBody MemberUpdateRequestFilterDTO memberUpdateRequestFilter,
            @PathVariable(value = "id")int id) {
        String updated = memberService.updateMember(memberUpdateRequestFilter, id);
        return updated + "updated";
    }

    @GetMapping(
            path = "/get-by-id-is-active",
            params = "id"
    )
    public MemberDTO getCustomerByIdIsActive(@RequestParam(value = "id") int id) {
        MemberDTO memberDTO = memberService.getMemberByIDIsActive(id);
        return memberDTO;
    }
}
