package com.appfactory.springlesson1.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
public class CalculationHistoryDs {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate calculationDate;
    @OneToMany
    private List<CalculationHistoryParametersDs> parameters;
    private Integer result;



}
