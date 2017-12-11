package com.appfactory.springlesson1.repository;

import com.appfactory.springlesson1.dto.CalculationHistoryDto;
import com.appfactory.springlesson1.model.CalculationHistoryDs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

/**
 * Created by Korepetycje on 08.12.2017.
 */
public interface CalculationHistoryRepository extends JpaRepository<CalculationHistoryDs, Long> {


}
