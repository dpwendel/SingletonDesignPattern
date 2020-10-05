/*
 * Author: Douglas Wendel
 * The patient class simply holds the first name, last name
 * and patient id. This creates an array of the information and assigns
 * the variables to themselves. It also adds allergies to the patient
 * and returns the patient id and their first and last name
 */
package singletondesignpattern;
import java.util.ArrayList;
public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies = new ArrayList<>();
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	public String toString() {
		return "Patient " + (id+1) + ": " + firstName + lastName +"\n Allergies: "+allergies;
	}

}
