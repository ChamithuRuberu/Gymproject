package com.GymNonCommercialUse.GymBackEnd.dto.paginated;
import com.GymNonCommercialUse.GymBackEnd.dto.SuppliemntDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PaginatedRespnseSuplimentDTO {
    private List<SuppliemntDTO> list;
    private long dataCount;
}
