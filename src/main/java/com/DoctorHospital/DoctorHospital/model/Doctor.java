package com.DoctorHospital.DoctorHospital.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameDoctor;
	private String username;
	private String password;
	@ManyToOne
	@JoinColumn(name="branch_id")
	private Branch branch;
	@OneToMany(mappedBy = "doctor")
	private List<Patient> patients;
	@OneToMany(mappedBy = "doctor")
	private List<DeathNote> notes;
	@OneToMany(mappedBy = "doctor")
	private List<Score> scores;
}
