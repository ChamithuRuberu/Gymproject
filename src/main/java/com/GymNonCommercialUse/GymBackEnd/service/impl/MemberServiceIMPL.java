package com.GymNonCommercialUse.GymBackEnd.service.impl;
import com.GymNonCommercialUse.GymBackEnd.dto.MemberDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberSaveRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateQueryReqDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.MemberUpdateRequestFilterDTO;
import com.GymNonCommercialUse.GymBackEnd.entity.Member;
//import com.GymNonCommercialUse.GymBackEnd.entity.Supliments;
import com.GymNonCommercialUse.GymBackEnd.exception.EntryDuplicateException;
import com.GymNonCommercialUse.GymBackEnd.repository.MemberRepo;
import com.GymNonCommercialUse.GymBackEnd.service.MemberService;
import com.GymNonCommercialUse.GymBackEnd.util.mappers.MemberMapper;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceIMPL implements MemberService {

    @Autowired
    private MemberRepo memberRepo;

    @Autowired
    private ModelMapper modelMapper;

    //  for maspstruct.................

    private MemberMapper memberMapper;


    //save member................................!
    @Override
    public String addmember(MemberSaveRequestDTO memberSaveRequestDTO) {

//        Member member = new Member(
//
//                memberSaveRequestDTO.getMemberName(),
//                memberSaveRequestDTO.getMemberNic(),
//                memberSaveRequestDTO.getMemberAge(),
//                memberSaveRequestDTO.getMemberGender(),
//                memberSaveRequestDTO.getMemberContact(),
//                memberSaveRequestDTO.getMemberAddress(),
//                memberSaveRequestDTO.getMemberEmail(),
//                memberSaveRequestDTO.getMemberWeight(),
//                memberSaveRequestDTO.getMemberHeight(),
//                memberSaveRequestDTO.getMemberHealthIssue(),
//                memberSaveRequestDTO.getMemberMedicines(),
//                memberSaveRequestDTO.getMemberJobPosition(),
//                memberSaveRequestDTO.getRegisterd_date(),
//                memberSaveRequestDTO.getOthers(),
//                memberSaveRequestDTO.getMemberInstructor(),
//                false
//
//        );
//        memberRepo.save(member);
//        return member.getMemberId() + " saved..!";
//

        Member member  = modelMapper.map(memberSaveRequestDTO,Member.class);
        if (! memberRepo.existsById(member.getMemberId())){
            return memberRepo.save(member).getMemberName();
        }
        else {
            throw new EntryDuplicateException("already saved");
        }

    }

    //update member ................................................!
    @Override
    public String updateMember(MemberUpdateRequestDTO memberUpdateRequestDTO) {
        if (memberRepo.existsById(memberUpdateRequestDTO.getMemberId())) {
            Member member = memberRepo.getById(memberUpdateRequestDTO.getMemberId());
            member.setMemberName(memberUpdateRequestDTO.getMemberName());
            member.setMemberNic(memberUpdateRequestDTO.getMemberNic());
            member.setMemberAge(memberUpdateRequestDTO.getMemberAge());
            member.setMemberGender(memberUpdateRequestDTO.getMemberGender());
            member.setMemberContact(memberUpdateRequestDTO.getMemberContact());
            member.setMemberAddress(memberUpdateRequestDTO.getMemberAddress());
            member.setMemberEmail(memberUpdateRequestDTO.getMemberEmail());
            member.setMemberWeight(memberUpdateRequestDTO.getMemberWeight());
            member.setMemberHeight(memberUpdateRequestDTO.getMemberHeight());
            member.setMemberHealthIssue(memberUpdateRequestDTO.getMemberHealthIssue());
            member.setMemberMedicines(memberUpdateRequestDTO.getMemberMedicines());
            member.setMemberJobPosition(memberUpdateRequestDTO.getMemberJobPosition());
            member.setRegisterd_date(memberUpdateRequestDTO.getRegisterd_date());
            member.setOthers(memberUpdateRequestDTO.getOthers());
            member.setMemberInstructor(memberUpdateRequestDTO.getMemberInstructor());
            member.setActivestate(memberUpdateRequestDTO.isActivestate());

            return memberRepo.save(member).getMemberName();

        } else {
           throw new EntryDuplicateException("Not in database");
        }
    }


    //Sarch member by id ....................................................!

    @Override
    public MemberDTO getMemberByID(int id) {
        Optional<Member> member = memberRepo.findById(id);
        if (member.isPresent()) {
//            MemberDTO memberDTO = new MemberDTO(
//                    member.get().getMemberId(),
//                    member.get().getMemberName(),
//                    member.get().getMemberNic(),
//                    member.get().getMemberAge(),
//                    member.get().getMemberGender(),
//                    member.get().getMemberContact(),
//                    member.get().getMemberAddress(),
//                    member.get().getMemberEmail(),
//                    member.get().getMemberWeight(),
//                    member.get().getMemberHeight(),
//                    member.get().getMemberHealthIssue(),
//                    member.get().getMemberMedicines(),
//                    member.get().getMemberJobPosition(),
//                    member.get().getRegisterd_date(),
//                    member.get().getOthers(),
//                    member.get().getMemberInstructor(),
//                    member.get().isActivestate()
//            );

            //using modelMapper............................
            MemberDTO memberDTO = modelMapper.map(member.get(), MemberDTO.class);
            return memberDTO;

        } else {
            return null;
        }

    }

    @Override
    public List<MemberDTO> getAllMembers() {
        List<Member> getMembers = memberRepo.findAll();
        List<MemberDTO> memberDTOList = new ArrayList<>();

//        for (Member m:getMembers){
//            MemberDTO memberDTO =new MemberDTO(
//              m.getMemberId(),
//              m.getMemberName(),
//                    m.getMemberNic(),
//                    m.getMemberAge(),
//                    m.getMemberGender(),
//                    m.getMemberContact(),
//                    m.getMemberAddress(),
//                    m.getMemberEmail(),
//                    m.getMemberWeight(),
//                    m.getMemberHeight(),
//                    m.getMemberHealthIssue(),
//                    m.getMemberMedicines(),
//                    m.getMemberJobPosition(),
//                    m.getRegisterd_date(),
//                    m.getOthers(),
//                    m.getMemberInstructor(),
//                    m.isActivestate()
//            );
//            memberDTOList.add(memberDTO);
//        }


        // use model mapper instead of using for each loop...

        List<MemberDTO> memberDTO = modelMapper.map(getMembers, new TypeToken<List<MemberDTO>>() {
        }.getType());
        return memberDTO;
    }

    @Override
    public boolean deleteMember(int id) throws NotFoundException {
        if (memberRepo.existsById(id)) {
            memberRepo.deleteById(id);
        } else {
            throw new NotFoundException("not found member for this id");
        }
        return true;
    }

    @Override
    public List<MemberDTO> getByName(String memberName) throws NotFoundException {
        List<Member> members = memberRepo.findAllByMemberNameEquals(memberName);
        if (members.size() != 0) {
            // modelMapper........................................
            List<MemberDTO> memberDTO = modelMapper.map(members, new TypeToken<List<MemberDTO>>() {
            }.getType());
            return memberDTO;
        } else {
            throw new NotFoundException("not found that type of name");
        }
    }

    @Override
    public List<MemberDTO> getAllActiveState() {

        List<MemberDTO> member = memberRepo.findAllByActivestateEquals(true);

        if (member.size() == 1) {
            List<MemberDTO> memberDTOS = modelMapper.map(member, new TypeToken<List<MemberDTO>>() {
            }.getType());
            return memberDTOS;
        } else {
            return null;
        }
    }

    @Override
    public String updateMemberByQuery(MemberUpdateQueryReqDTO memberUpdateQueryReqDTO, int id) {
        if (memberRepo.existsById(id)){
            memberRepo.updateMemberByQuery(memberUpdateQueryReqDTO.getMemberAge(),memberUpdateQueryReqDTO.getMemberContact(),memberUpdateQueryReqDTO.getMemberAddress(),memberUpdateQueryReqDTO.getMemberEmail(),memberUpdateQueryReqDTO.getMemberWeight(),memberUpdateQueryReqDTO.getMemberHeight(),memberUpdateQueryReqDTO.getMemberHealthIssue(),memberUpdateQueryReqDTO.getMemberMedicines(),memberUpdateQueryReqDTO.getMemberInstructor(),id);
            return "Id "+id+" Is updated";
        }
        else {
            return "No member found ,Id Incorrect";
        }
    }

    @Override
    public MemberDTO getMemberByNIC(String nic) {
        Optional<Member>member=memberRepo.findByMemberNicEquals(nic);
        if (member.isPresent()){
            MemberDTO memberDTO = modelMapper.map(member.get(),MemberDTO.class);
            return memberDTO;
        }
        else {
            throw new  com.GymNonCommercialUse.GymBackEnd.exception.NotFoundException("not found");
        }
    }

    @Override
    public String updateMember(MemberUpdateRequestFilterDTO memberUpdateRequestFilterDTO, int id) {
        if (memberRepo.existsById(id)) {

            Member member = memberRepo.getById(id);
            member.setMemberAge(memberUpdateRequestFilterDTO.getMemberAge());
            member.setMemberContact(memberUpdateRequestFilterDTO.getMemberContact());
            member.setMemberAddress(memberUpdateRequestFilterDTO.getMemberAddress());
            member.setMemberEmail(memberUpdateRequestFilterDTO.getMemberEmail());
            member.setMemberWeight(memberUpdateRequestFilterDTO.getMemberWeight());
            member.setMemberHeight(memberUpdateRequestFilterDTO.getMemberHeight());
            member.setMemberHealthIssue(memberUpdateRequestFilterDTO.getMemberHealthIssue());
            member.setMemberMedicines(memberUpdateRequestFilterDTO.getMemberMedicines());
            member.setMemberJobPosition(memberUpdateRequestFilterDTO.getMemberJobPosition());
            member.setMemberInstructor(memberUpdateRequestFilterDTO.getMemberInstructor());
            System.out.println("come");
            return memberRepo.save(member).getMemberName();

        } else {
            throw new EntryDuplicateException("Not in database");
        }
    }

    @Override
    public MemberDTO getMemberByIDIsActive(int id) {
        Optional<Member> member= memberRepo.findById(id);
        if (member.get().isActivestate()){
            MemberDTO memberDTO =modelMapper.map(member.get(),MemberDTO.class);
            return memberDTO;
        }
        else {
            System.out.println("this member not active yet");
        }
        return null;
    }

    public void setMemberMapper(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public MemberMapper getMemberMapper() {
        return memberMapper;
    }
}