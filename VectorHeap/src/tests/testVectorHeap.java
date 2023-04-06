package tests;
import java.util.Vector;

import junit.framework.TestCase;
import models.Patient;
import models.VectorHeap;


public class testVectorHeap extends TestCase {

	public void testAddSortRemove() {
		
		//Incersión de datos
		Vector<Patient> patientVector = new Vector<>();
		Vector<Patient> sortedPatientVector = new Vector<>();
		patientVector.add(new Patient("Maria Ramirez", "apendicitis", " A"));
		patientVector.add(new Patient("Juan Perez", "fractura de pierna", " C"));
		patientVector.add(new Patient("Lorenzo Toledo", "chikunguya", " E"));
		patientVector.add(new Patient("Carmen Sarmientos", "dolores de parto", " B"));
        VectorHeap<Patient> patientHeap = new VectorHeap<>(patientVector);

        //Comprobamos que el código de emergencia esté en orden, removiendo un elemento (el más importante).
        assertEquals(" A", patientHeap.remove().getEmergencyCode());
	}
	
}