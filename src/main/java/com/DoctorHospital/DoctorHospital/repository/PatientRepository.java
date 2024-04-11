package com.DoctorHospital.DoctorHospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoctorHospital.DoctorHospital.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
