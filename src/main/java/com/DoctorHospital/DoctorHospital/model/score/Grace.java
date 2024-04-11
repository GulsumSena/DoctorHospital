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
public class Grace extends Score{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer ageG;
	private Integer heartRate;
	private Integer bloodPressure;
	private Integer kreatinin;
	private Integer killip;
	private Integer arrest;
	private Integer cardiacMarkerGrace;
	private Integer STsegment;
	private Integer totalOfGrace;
}
