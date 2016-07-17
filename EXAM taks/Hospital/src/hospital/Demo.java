package hospital;

import patient.Drug;
import patient.Patient;
import wardSection.Cardiology;
import wardSection.Orthopaedy;
import wardSection.Virology;
import wardSection.Ward;

public class Demo {

public static void main(String[] args) {

	 	Hospital mbal = new Hospital();
	
		Doctor docheva = new Doctor("Gospodinka Docheva",50, "0898341243", Gender.Female);
		mbal.addDoctor(docheva);
		
		Nurse donka = new Nurse("Donka Georgieva", 70, "0876424212", Gender.Female, 45, mbal.cardiology);
		Nurse katka = new Nurse("Katka Grozdova", 70, "0876989310", Gender.Female, 32, mbal.cardiology);
		mbal.addNurse(donka);
		mbal.addNurse(katka);
		mbal.cardiology.nurses.add(katka);
		mbal.virology.nurses.add(donka);
		
	
		
		mbal.addPatient(new Patient("Todor Georgiev", 15, "0898871007", Gender.Male, docheva,new Cardiology()),"Visoko kruvno",donka,(byte)4);
		mbal.addPatient(new Patient("Boyan Penchev", 15, "0898432123", Gender.Male, docheva,new Virology()),"Visoko kruvno",donka,(byte)4);
		mbal.addPatient(new Patient("Pesho Peshov", 15, "0898871007", Gender.Male, docheva,new Cardiology()),"Visoko kruvno",donka,(byte)4);
		
		

		mbal.cardiology.patients.get(0).getMedicalPlan().addDrug(new Drug("Aspirin"));
		mbal.cardiology.patients.get(0).getMedicalPlan().addDrug(new Drug("Benalgin"));
		mbal.cardiology.patients.get(1).getMedicalPlan().addDrug(new Drug("Vitamin C"));
		mbal.cardiology.patients.get(1).getMedicalPlan().addDrug(new Drug("Vitamin D"));
		
		mbal.dayWork();
	}
}
