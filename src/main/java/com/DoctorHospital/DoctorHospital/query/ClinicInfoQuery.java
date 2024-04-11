package com.DoctorHospital.DoctorHospital.query;

public class ClinicInfoQuery {

	public String listAccordingToPatient(Long id) {
		return "select clinic_info.body, patient.name_patient as namePatient, doctor.name_doctor as nameDoctor,"
				+ " clinic_info.time, doctor.id as doctor_id, patient.id as patient_id"
				+ " from clinic_info, doctor, patient"
				+ " where clinic_info.patient_id=patient.id and clinic_info.doctor_id=doctor.id "
				+ " and patient.id="+id;
	}
	
	public String listAccordingToDoctor(Long id) {
		return "select doctor.name_doctor as nameDoctor, clinic_info.body, patient.name_patient as namePatient,"
				+ " clinic_info.time, doctor.id as doctor_id, patient.id as patient_id"
				+ " from doctor, patient, clinic_info"
				+ " where doctor.id=clinic_info.doctor_id and patient.id=clinic_info.patient_id and doctor.id="+id;
	}
	
	public String showDeathNote(Long id) {
		return "select death_note.note as body, doctor.name_doctor as nameDoctor, patient.name_patient as namePatient,"
				+ " death_note.time, doctor.id as doctor_id, patient.id as patient_id"
				+ " from death_note, doctor, patient"
				+ " where death_note.doctor_id=doctor.id and death_note.patient_id=patient.id and patient.id="+id;
	}
}
