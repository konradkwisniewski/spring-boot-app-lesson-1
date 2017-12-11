package com.appfactory.springlesson1.service.impl;

import com.appfactory.springlesson1.converter.CalculationHistoryConverter;
import com.appfactory.springlesson1.dto.CalculationHistoryDto;
import com.appfactory.springlesson1.model.CalculationHistoryDs;
import com.appfactory.springlesson1.repository.CalculationHistoryRepository;
import com.appfactory.springlesson1.service.CalculationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Korepetycje on 08.12.2017.
 */

@Service("calculationHistoryServiceImpl")
public class CalculationHistoryServiceImpl implements CalculationHistoryService{

    private CalculationHistoryRepository calculationHistoryRepository;
    private CalculationHistoryConverter calculationHistoryConverter;

    @Autowired
    public CalculationHistoryServiceImpl(@Qualifier("calculationHistoryRepository") CalculationHistoryRepository calculationHistoryRepository,
                                         @Qualifier("calculationHistoryConverter") CalculationHistoryConverter calculationHistoryConverter) {
        this.calculationHistoryRepository = calculationHistoryRepository;
        this.calculationHistoryConverter = calculationHistoryConverter;
    }

    @Override
    public List<CalculationHistoryDto> findAll() {
        List<CalculationHistoryDs> calculationHistoryDsList = calculationHistoryRepository.findAll();


        return calculationHistoryDsList.stream()
                .map(calculationHistoryDs -> calculationHistoryConverter.convertDsToDto(calculationHistoryDs))
                .collect(Collectors.toList());
    }
}
