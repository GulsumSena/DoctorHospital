package com.DoctorHospital.DoctorHospital.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String namePatient;
	private Integer agePatient;
	private String gender;
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;
	private Integer status;
	@OneToMany(mappedBy = "patient")
	private List<ClinicInfo> infos;
	@OneToOne
	private DeathNote note;
	@OneToMany(mappedBy = "patient")
	private List<Score> scores;
}
