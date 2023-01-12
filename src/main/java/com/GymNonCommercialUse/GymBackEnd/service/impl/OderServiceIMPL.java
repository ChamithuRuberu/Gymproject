package com.GymNonCommercialUse.GymBackEnd.service.impl;

import com.GymNonCommercialUse.GymBackEnd.dto.request.RequestOderSaveDto;
import com.GymNonCommercialUse.GymBackEnd.entity.Oder;
import com.GymNonCommercialUse.GymBackEnd.entity.OderDetails;
import com.GymNonCommercialUse.GymBackEnd.repository.MemberRepo;
import com.GymNonCommercialUse.GymBackEnd.repository.OderDetailsRepo;
import com.GymNonCommercialUse.GymBackEnd.repository.OderRepo;
import com.GymNonCommercialUse.GymBackEnd.repository.SuplimentRepo;
import com.GymNonCommercialUse.GymBackEnd.service.OderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OderServiceIMPL implements OderService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private OderRepo oderRepo;
    @Autowired
    private MemberRepo  memberRepo;
    @Autowired
    private OderDetailsRepo  oderDetailsRepo;
    @Autowired
    private SuplimentRepo suplimentRepo;

    @Override
    @Transactional
    public String addOder(RequestOderSaveDto requestOderSaveDto) {
        Oder oder = new Oder(
                requestOderSaveDto.getDate(),
                requestOderSaveDto.getTotal(),
                memberRepo.getById(requestOderSaveDto.getMember())
        );
        oderRepo.save(oder);

        if (oderRepo.existsById(oder.getOrderid())) {
                    List<OderDetails> oderDetails = modelMapper.
                    map(requestOderSaveDto.getOderDetails(), new TypeToken<List<OderDetails>>() {
                    }.getType());

            for (int i=0;i<oderDetails.size();i++){
                oderDetails.get(i).setOders(oder);
                oderDetails.get(i).setSupliments(suplimentRepo.getById(requestOderSaveDto.getOderDetails().get(i).getSupliments()));
            }

            if (oderDetails.size()>0){
                oderDetailsRepo.saveAll(oderDetails);
            }
        }

        return "Oder saved..!";
    }

}
