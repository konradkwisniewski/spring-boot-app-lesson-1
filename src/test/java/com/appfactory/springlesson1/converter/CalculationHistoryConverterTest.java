package com.appfactory.springlesson1.converter;

import com.appfactory.springlesson1.dto.CalculationHistoryDto;
import com.appfactory.springlesson1.model.CalculationHistoryDs;
import com.appfactory.springlesson1.model.CalculationHistoryParametersDs;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Created by Korepetycje on 08.12.2017.
 */
public class CalculationHistoryConverterTest {

    @InjectMocks
    private CalculationHistoryConverter calculationHistoryConverter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void chectThatConvertDtoToDsProperlySetProperties(){
        //given
        LocalDate calculationDate = LocalDate.of(1993, 2, 2);
        List<Integer> parameters = Arrays.asList(1, 2, 3);
        Integer result = Integer.valueOf(6);
        CalculationHistoryDs calculationHistoryDs = CalculationHistoryDs.builder()
                .calculationDate(calculationDate)
                .parameters(parameters.stream()
                        .map(param -> CalculationHistoryParametersDs.builder()
                                .value(param)
                                .build())
                        .collect(Collectors.toList()))
                .result(result)
                .build();

        //when
        CalculationHistoryDto calculationHistoryDto = calculationHistoryConverter.convertDsToDto(calculationHistoryDs);

        //then
        Assertions.assertThat(calculationHistoryDto.getCalculationDate()).isEqualsToByComparingFields(calculationHistoryDs.getCalculationDate())
                .describedAs("getCalculationDate");
        Assertions.assertThat(calculationHistoryDto.getParameters()).isEqualTo(calculationHistoryDs.getParameters())
                .describedAs("getParameters");
        Assertions.assertThat(calculationHistoryDto.getResult()).isEqualTo(calculationHistoryDs.getResult())
                .describedAs("getResult");
    }

}