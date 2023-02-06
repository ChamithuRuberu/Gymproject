package com.GymNonCommercialUse.GymBackEnd.service.impl;

import com.GymNonCommercialUse.GymBackEnd.dto.request.RequestOderSaveDto;
import com.GymNonCommercialUse.GymBackEnd.repository.MemberRepo;
import com.GymNonCommercialUse.GymBackEnd.repository.OderDetailsRepo;
import com.GymNonCommercialUse.GymBackEnd.repository.OderRepo;
import com.GymNonCommercialUse.GymBackEnd.repository.SuplimentRepo;
import com.GymNonCommercialUse.GymBackEnd.service.OderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
        return "Oder saved..!";
    }

}
