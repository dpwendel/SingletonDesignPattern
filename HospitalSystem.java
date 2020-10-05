/*
 * Author: Douglas Wendel
 * 
 * The hospital system class holds an arraylist of patients. 
 * Allows the driver to add patients and access records aswell
 * as add allergies. The get all patients data returns the patients
 * data by calling the toString(). 
 */
package singletondesignpattern;
import java.util.ArrayList;
public class HospitalSystem {
	private ArrayList<Patient> patients = new ArrayList<>();
	private static HospitalSystem hospitalSystem;	
	private HospitalSystem() {}
	public static HospitalSystem getInstance() {
		hospitalSystem = new HospitalSystem();
		return hospitalSystem;
	}
	public int addPatient(String firstName, String LastName) {
		int id = patients.size();
		Patient patient = new Patient(id,firstName,LastName);
		patients.add(patient);
		return id;
	}
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	public void addAllergy(int id, String allergy) {
		Patient patient= patients.get(id);
		patient.addAllergy(allergy);
	}
	public String getAllPatientsData() {
	      return toString();
	}
}

