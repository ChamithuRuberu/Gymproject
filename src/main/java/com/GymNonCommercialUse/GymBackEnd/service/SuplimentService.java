package com.GymNonCommercialUse.GymBackEnd.service;

import com.GymNonCommercialUse.GymBackEnd.dto.SuppliemntDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.paginated.PaginatedRespnseSuplimentDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.SupliemnetSaveRequestDTO;

import java.util.List;

public interface SuplimentService {

    String addsupliment(SupliemnetSaveRequestDTO supliemnetSaveRequestDTO);

    List<SuppliemntDTO> getAllSupliments();

    List<SuppliemntDTO> getAllSuplimentsByActiveState(boolean status);

    int countAllItems();

    PaginatedRespnseSuplimentDTO getAllSuplimentsPaginated(int page, int size);
}
