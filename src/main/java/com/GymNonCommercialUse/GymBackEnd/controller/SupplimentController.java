package com.GymNonCommercialUse.GymBackEnd.controller;
import com.GymNonCommercialUse.GymBackEnd.dto.SuppliemntDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.paginated.PaginatedRespnseSuplimentDTO;
import com.GymNonCommercialUse.GymBackEnd.dto.request.SupliemnetSaveRequestDTO;
import com.GymNonCommercialUse.GymBackEnd.service.SuplimentService;
import com.GymNonCommercialUse.GymBackEnd.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.Max;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v14/Suppliment")
public class SupplimentController {
    @Autowired
    private SuplimentService suplimentService;


    @PostMapping("/saveSupliment")
    public ResponseEntity<StanderdResponse> savesupliment(@RequestBody SupliemnetSaveRequestDTO supliemnetSaveRequestDTO) {
        String id = suplimentService.addsupliment(supliemnetSaveRequestDTO);
        return new ResponseEntity<StanderdResponse>(

                new StanderdResponse(201,id+" saved Successfully",id),
                HttpStatus.CREATED

        );
    }

    @GetMapping(
            path = "get-all-supliments"
    )
    public ResponseEntity<StanderdResponse> allsupliments() {

        List<SuppliemntDTO> suppliemntDTOS = suplimentService.getAllSupliments();
        return new ResponseEntity<StanderdResponse>(

                new StanderdResponse(200," done",suppliemntDTOS),
                HttpStatus.OK
        );
    }

    @GetMapping(
            path = {"get-all-supliments-by-active-state"},
            params={"state"}
    )
    public ResponseEntity<StanderdResponse> getItemsBystate(@RequestParam(value = "state")String state) {

        if (state.equalsIgnoreCase("active") | state.equalsIgnoreCase("inactive")) {
//            boolean status = false;
//            if (state.equalsIgnoreCase("active")){
//                status=true;
//            }
//        }
            boolean status = state.equalsIgnoreCase("active") ? true : false;
            List<SuppliemntDTO> suppliemntDTOS = suplimentService.getAllSuplimentsByActiveState(status);
            return new ResponseEntity<StanderdResponse>(

                    new StanderdResponse(200, " done", suppliemntDTOS),
                    HttpStatus.OK
            );
        } else {
            List<SuppliemntDTO> suppliemntDTOS = suplimentService.getAllSupliments();
            return new ResponseEntity<StanderdResponse>(

                    new StanderdResponse(200, " done",suppliemntDTOS),
                    HttpStatus.OK
            );
        }
    }

    @GetMapping(
            path = "count-all-supliments"
    )
    public ResponseEntity<StanderdResponse>getAllSupplimentCount(){

        int suplimentCount = suplimentService.countAllItems();

        return new ResponseEntity<StanderdResponse>(
                new StanderdResponse(200, " done",suplimentCount),
                HttpStatus.OK
        );
    }

    @GetMapping(
            path = "get-all-supliments-paginated",
            params = {"page","size"}
    )
    public ResponseEntity<StanderdResponse> allsupliments(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "size") @Max(50) int size
    )
    {
        PaginatedRespnseSuplimentDTO paginatedRespnseSuplimentDTO = suplimentService.getAllSuplimentsPaginated(page,size);
        return new ResponseEntity<StanderdResponse>(
                new StanderdResponse(200, " done",paginatedRespnseSuplimentDTO),
                HttpStatus.OK
        );
    }

}
