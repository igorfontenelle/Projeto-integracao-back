package com.measurer.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="measurermodel")
public class MeasurerModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String line;
	private String category;
	private String model;
	
	public MeasurerModel() {
		
	}

	public MeasurerModel(long id, String line, String category, String model) {
		super();
		this.id = id;
		this.line = line;
		this.category = category;
		this.model = model;
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MeasurerModel [id=" + id + ", line=" + line + ", category=" + category + ", model=" + model + "]";
	}
	
	
}
