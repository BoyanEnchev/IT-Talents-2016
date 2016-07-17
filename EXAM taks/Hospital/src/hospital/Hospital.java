package hospital;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import patient.MedicalPlan;
import patient.Patient;
import patient.PatientFile;
import wardSection.Cardiology;
import wardSection.Orthopaedy;
import wardSection.Virology;
import wardSection.Ward;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Nurse> nurses = new ArrayList<Nurse>();

	Map patientFiles = new HashMap<Patient, PatientFile>();

	Ward orthopaedy;
	Ward cardiology;
	Ward virology;

	Hospital() {
		orthopaedy = new Orthopaedy();
		cardiology = new Cardiology();
		virology = new Virology();
	}

	public void addPatient(Patient patient, String diagnose, Nurse nurse, byte medicalDays) {
		if (patient != null) {
			PatientFile file = new PatientFile(patient);
			this.patientFiles.put(patient, file);

			if (patient.getWard().getClass().equals(this.orthopaedy.getClass())) {
				patient.setWard(this.orthopaedy);
			}
			if (patient.getWard().getClass().equals(this.cardiology.getClass())) {
				patient.setWard(this.cardiology);
			}
			if (patient.getWard().getClass().equals(this.virology.getClass())) {
				patient.setWard(this.virology);
			}
			patient.getWard().patients.add(patient);

			patient.setMedicalPlan(new MedicalPlan(diagnose, nurse, medicalDays));

		}
	}

	public void addDoctor(Doctor doctor) {
		this.doctors.add(doctor);
	}

	public void addNurse(Nurse nurse) {
		if (nurse.getWard().getClass().equals(this.orthopaedy.getClass())) {
			nurse.setWard(this.orthopaedy);
		}
		if (nurse.getWard().getClass().equals(this.cardiology.getClass())) {
			nurse.setWard(this.cardiology);
		}
		if (nurse.getWard().getClass().equals(this.virology.getClass())) {
			nurse.setWard(this.virology);
		}
		nurse.getWard().nurses.add(nurse);
	}
}
