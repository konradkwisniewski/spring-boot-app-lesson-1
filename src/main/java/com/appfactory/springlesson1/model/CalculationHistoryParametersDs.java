package com.appfactory.springlesson1.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
public class CalculationHistoryParametersDs {

    @Id
    @GeneratedValue
    private Long id;
    private Integer value;
}
