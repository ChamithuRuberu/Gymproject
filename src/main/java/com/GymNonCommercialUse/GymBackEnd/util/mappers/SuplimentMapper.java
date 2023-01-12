package com.GymNonCommercialUse.GymBackEnd.util.mappers;
import com.GymNonCommercialUse.GymBackEnd.dto.SuppliemntDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.paginated.PaginatedRespnseSuplimentDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.SupliemnetSaveRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.entity.Supliments;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SuplimentMapper {
   Supliments RequestDTOToEntity(SupliemnetSaveRequestDTO supliemnetSaveRequestDTO);
   List<SuppliemntDTO>PageToLst(Page<Supliments> page);
}
