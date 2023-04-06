package main;
import java.util.PriorityQueue;

import models.ComparatePacient;
import models.Patient;

public class emergencyHospital {

	public static void main(String[] args) {
		PriorityQueue<Patient> personas = new PriorityQueue<>(new ComparatePacient());
	
        personas.add(new Patient("Juan", "Fractura", "A"));
        personas.add(new Patient("Pedro", "Dolor", "D"));
        personas.add(new Patient("Maria", "Esguince", "C"));
	
	while (!personas.isEmpty()) {
        Patient persona = personas.poll();
        System.out.println(persona.getName() + " - " + persona.getEmergencyCodeInt());
    }
	
	}
}
