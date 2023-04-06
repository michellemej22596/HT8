package models;

import java.util.Comparator;

public class ComparatePacient implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		return o1.getEmergencyCodeInt() - o2.getEmergencyCodeInt();
		
	}
	
	

}
