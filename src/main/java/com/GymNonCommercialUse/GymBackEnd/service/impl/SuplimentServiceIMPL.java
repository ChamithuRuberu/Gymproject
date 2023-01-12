package com.GymNonCommercialUse.GymBackEnd.service.impl;

import com.GymNonCommercialUse.GymBackEnd.dto.SuppliemntDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.paginated.PaginatedRespnseSuplimentDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.SupliemnetSaveRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.entity.Supliments;
import com.GymNonCommercialUse.GymBackEnd.exception.EntryDuplicateException;
import com.GymNonCommercialUse.GymBackEnd.repository.SuplimentRepo;
import com.GymNonCommercialUse.GymBackEnd.service.SuplimentService;
import com.GymNonCommercialUse.GymBackEnd.util.mappers.SuplimentMapper;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuplimentServiceIMPL implements SuplimentService {

    @Autowired
    private SuplimentRepo suplimentRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    private SuplimentMapper suplimentMapper;


    @Override
    public String addsupliment(SupliemnetSaveRequestDTO supliemnetSaveRequestDTO) {
        Supliments supliments  = modelMapper.map(supliemnetSaveRequestDTO,Supliments.class);
        if (! suplimentRepo.existsById(supliments.getSuplimntId())){
            return suplimentRepo.save(supliments).getSuplimentName();
        }
        else {
            throw new EntryDuplicateException("already saved");
        }
    }

    @Override
    public List<SuppliemntDTO> getAllSupliments() {
        List<Supliments> getsupliments = suplimentRepo.findAll();
        List<SuppliemntDTO> suppliemntDTOS = new ArrayList<>();

        List<SuppliemntDTO> suppliemntDTO = modelMapper.
                map(getsupliments, new TypeToken<List<SuppliemntDTO>>() {}.getType());
        return suppliemntDTO;
    }

    @Override
    public List<SuppliemntDTO> getAllSuplimentsByActiveState(boolean status) {
        List<Supliments> getsupliments = suplimentRepo.findAllByActivestateEquals(status);
               List<SuppliemntDTO> suppliemntDTO = modelMapper.
                map(getsupliments, new TypeToken<List<SuppliemntDTO>>() {}.getType());
        return suppliemntDTO;
    }

    @Override
    public int countAllItems() {
        int count =suplimentRepo.countAllByActivestateEquals(true);
        return count;
    }

    @Override
    public PaginatedRespnseSuplimentDTO getAllSuplimentsPaginated(int page, int size) {
        Page<Supliments>getAllitemByPaginated=suplimentRepo.findAll(PageRequest.of(page,size));
        return new PaginatedRespnseSuplimentDTO(
                suplimentMapper.PageToLst(getAllitemByPaginated),
                suplimentRepo.count()
        );
    }
}
