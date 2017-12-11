package com.appfactory.springlesson1.service;

import com.appfactory.springlesson1.dto.CalculationHistoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Korepetycje on 08.12.2017.
 */

@Service("calculationHistoryServiceImpl")
public interface CalculationHistoryService {

    List<CalculationHistoryDto> findAll();
}
