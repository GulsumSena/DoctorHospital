package com.DoctorHospital.DoctorHospital.query;

public class ScoreQuery {
	
	public String listMascc() {
		return "select score.total_of_mascc as total,"+basalSql()+"'MASCC'";
	}
	public String listHeart() {
		return "select score.total_of_heart as total,"+basalSql()+"'HEART'";
	}
	public String listTimi() {
		return "select score.total_of_timi as total,"+basalSql()+"'TIMI'";
	}
	public String listGrace() {
		return "select score.total_of_grace as total,"+basalSql()+"'GRACE'";
	}
	public String listMehran() {
		return "select score.total_of_mehran as total,"+basalSql()+"'MEHRAN'";
	}
	public String listAlvarado() {
		return "select score.total_of_alvarado as total,"+basalSql()+"'ALVARADO'";
	}
	
	public String basalSql() {
		return " score.name_score as nameScore, score.patient_id as patientID,"
				+ " patient.name_patient as namePatient, patient.id as patientID,"
				+ " patient.age_patient as agePatient, patient.gender,"
				+ " doctor.name_doctor as nameDoctor, doctor.id as doctorID"
				+ " from score, patient, doctor"
				+ " where score.patient_id=patient.id and score.doctor_id=doctor.id and score.name_score=";
	}
}
