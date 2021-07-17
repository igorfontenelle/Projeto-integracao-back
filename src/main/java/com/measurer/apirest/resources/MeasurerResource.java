package com.measurer.apirest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.measurer.apirest.models.MeasurerModel;
import com.measurer.apirest.repository.MeasurerRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Medidores")
@CrossOrigin(origins="*")
public class MeasurerResource {

	@Autowired
	MeasurerRepository measurerRepository;
	
	@ApiOperation(value="Retorna uma lista de medidores")
	@GetMapping(value="/measurers")
	public List<MeasurerModel> listMeasurers(){
		return measurerRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um modelo de medidor")
	@GetMapping(value="/measurer/{id}")
	public MeasurerModel listSingleMeasurer(@PathVariable(value="id") long id) {
		return measurerRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um medidor")
	@PostMapping(value="/measurer")
	public MeasurerModel saveMeasurer(@RequestBody MeasurerModel measurer) {
		return measurerRepository.save(measurer);
	}
	
	@ApiOperation(value="Deleta um medidor")
	@DeleteMapping(value="/measurer")
	public void deleteMeasurer(@RequestBody MeasurerModel measurer) {
		measurerRepository.delete(measurer);
	}
	
	@ApiOperation(value="Atualiza um medidor")
	@PutMapping(value="/measurer")
	public MeasurerModel updateMeasurer(@RequestBody MeasurerModel measurer) {
		return measurerRepository.save(measurer);
	}
}
