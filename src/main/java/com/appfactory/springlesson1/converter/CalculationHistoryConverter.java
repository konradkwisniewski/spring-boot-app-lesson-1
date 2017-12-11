package com.appfactory.springlesson1.converter;

import com.appfactory.springlesson1.dto.CalculationHistoryDto;
import com.appfactory.springlesson1.model.CalculationHistoryDs;
import com.appfactory.springlesson1.model.CalculationHistoryParametersDs;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Korepetycje on 08.12.2017.
 */
@Component("calculationHistoryConverter")
public class CalculationHistoryConverter {

    public CalculationHistoryDto convertDsToDto(CalculationHistoryDs calculationHistoryDs){
        return CalculationHistoryDto.builder()
                .calculationDate(calculationHistoryDs.getCalculationDate())
                .parameters(calculationHistoryDs.getParameters().stream()
                    .map(CalculationHistoryParametersDs::getValue)
                    .collect(Collectors.toList()))
                .result(calculationHistoryDs.getResult())
                .build();

    }

    public CalculationHistoryDs convertDtoToDs(CalculationHistoryDto calculationHistoryDto) {
        return CalculationHistoryDs.builder()
                .calculationDate(calculationHistoryDto.getCalculationDate())
                .parameters(calculationHistoryDto.getParameters().stream()
                        .map(param -> CalculationHistoryParametersDs.builder()
                            .value(param)
                            .build())
                        .collect(Collectors.toList()))
                .result(calculationHistoryDto.getResult())
                .build();
    }
}
