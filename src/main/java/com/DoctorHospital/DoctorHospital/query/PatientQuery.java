package com.DoctorHospital.DoctorHospital.query;

public class PatientQuery {
	public String listAccordingToGender(Integer gender) {
		if(gender==0) {
			return basalSql()+ " patient.gender='Kadın'";
		}else if(gender==1) {
			return basalSql()+ " patient.gender='Erkek'";
		}else {
			return null;
		}	
	}
	
	public String listAccordingToAge(Integer minAge, Integer maxAge) {
		return basalSql()+" patient.age_patient between "+minAge+" and "+maxAge;
	}
	
	public String listAccordingToStatus(Integer status) {
		return basalSql()+" patient.status="+status;
	}
	
	public String listAccordingToDoctor(Long drID) {
		return basalSql()+" doctor.id="+drID;
	}
	
	public String basalSql() {
		return "select patient.name_patient as namePatient, patient.age_patient as agePatient,"
				+" patient.gender, patient.status, patient.doctor_id, patient.id as patient_id, "
				+" doctor.name_doctor as nameDoctor from patient, doctor"
				+" where patient.doctor_id=doctor.id and ";
	}
	
	public String patientScores(Long id) {
		return "select patient.name_patient as namePatient, patient.age_patient as agePatient,"
				+ " patient.gender, patient.id as patientID, score.name_score as nameScore,"
				+ " doctor.name_doctor as nameDoctor, doctor.id as doctorID"
				+ " from patient, doctor, score"
				+ " where patient.id=score.patient_id and doctor.id=score.doctor_id and patient.id="+id;
	}
}
