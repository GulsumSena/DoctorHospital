package com.DoctorHospital.DoctorHospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoctorHospital.DoctorHospital.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
