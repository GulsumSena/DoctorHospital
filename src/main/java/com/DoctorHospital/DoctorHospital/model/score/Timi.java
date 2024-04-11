package com.DoctorHospital.DoctorHospital.model.score;

import com.DoctorHospital.DoctorHospital.model.Score;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Timi extends Score{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer ageT;
	private Integer	STchanges;
	private Integer kah;
	private Integer stenosis;
	private Integer angina;
	private Integer ASA;
	private Integer cardiacMarkerTimi;
	private Integer totalOfTimi;
}
