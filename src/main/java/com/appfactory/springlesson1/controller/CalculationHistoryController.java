package com.appfactory.springlesson1.controller;

import com.appfactory.springlesson1.dto.CalculationHistoryDto;
import com.appfactory.springlesson1.service.CalculationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Korepetycje on 08.12.2017.
 */
@RestController
@RequestMapping("/api/math/history")
public class CalculationHistoryController {

    private CalculationHistoryService calculationHistoryService;

    @Autowired
    public CalculationHistoryController(@Qualifier("calculationHistoryServiceImpl") CalculationHistoryService calculationHistoryService) {
        this.calculationHistoryService = calculationHistoryService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<CalculationHistoryDto> getAll(){
        return calculationHistoryService.findAll();
    }

}
