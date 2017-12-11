package com.appfactory.springlesson1.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Korepetycje on 08.12.2017.
 */

@Getter
@Setter
@Builder
public class CalculationHistoryDto {
    private LocalDate calculationDate;
    private List<Integer> parameters;
    private Integer result;



}
