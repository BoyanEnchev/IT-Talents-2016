package wardSection;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

import hospital.Nurse;
import patient.Patient;

public abstract class Ward {

	final static byte numRooms = 10;
	final static byte numBeds = 3;

	boolean[][] beds = new boolean[numRooms][numBeds];

	public ArrayList<Patient> patients = new ArrayList<Patient>();
	public ArrayList<Nurse> nurses = new ArrayList<Nurse>();

	public void getBed(Patient patient) {
		if (patient != null) {
			boolean nastanen = false;

			for (int index = 0; index < this.beds.length; index++) {

				for (int index2 = 0; index2 < this.beds[numRooms - 1].length; index2++) {
					if (this.beds[index][index2] == false) {
						this.beds[index][index2] = true;
						nastanen = true;
						patient.setBedNumber(index * 10 + index2 + 1);
						break;
					}
				}
				if (nastanen)
					break;
			}
			if (!nastanen)
				System.out.println("NO free beds in medical Ward");
		}
	}

	public void removeBed(Patient patient) {
		if (patient != null) {
			int room = patient.getBedNumber() / 10;
			int bedInRoom = patient.getBedNumber() % 10;

			this.beds[room][bedInRoom] = false;
			patient.setBedNumber(-1);
		}
	}
}
