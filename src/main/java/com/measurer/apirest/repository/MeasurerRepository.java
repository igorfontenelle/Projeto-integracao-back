package com.measurer.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.measurer.apirest.models.MeasurerModel;

public interface MeasurerRepository extends JpaRepository<MeasurerModel, Long>{
	
	MeasurerModel findById(long id);
}
