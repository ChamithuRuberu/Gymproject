package com.GymNonCommercialUse.GymBackEnd.controller;

import com.GymNonCommercialUse.GymBackEnd.dto.request.RequestOderSaveDto;
import com.GymNonCommercialUse.GymBackEnd.service.OderService;
import com.GymNonCommercialUse.GymBackEnd.util.StanderdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v5/oder")
public class OderController {

    @Autowired
    private OderService oderService;

    @PostMapping(path = "save")
    public ResponseEntity<StanderdResponse>saveItem(@RequestBody RequestOderSaveDto requestOderSaveDto){

        String id = oderService.addOder(requestOderSaveDto);
        return new ResponseEntity<StanderdResponse>(
                new StanderdResponse(201,2+"saved",2),
                HttpStatus.CREATED
        );
    }

}
