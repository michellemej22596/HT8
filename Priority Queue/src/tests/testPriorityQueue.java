package tests;
import java.util.PriorityQueue;

import junit.framework.TestCase;
import models.ComparatePacient;
import models.Patient;


public class testPriorityQueue  extends TestCase {

	public void testAddSortPoll() {
		
		//Incersión de datos
		PriorityQueue<Patient> queue = new PriorityQueue<>(new ComparatePacient());
        queue.add(new Patient("Juan Perez", "fractura de pierna", " C"));
        queue.add(new Patient("Maria Ramirez", "apendicitis", " A"));
        queue.add(new Patient("Lorenzo Toledo", "chikunguya", " E"));
        queue.add(new Patient("Carmen Sarmientos", "dolores de parto", " B"));

        //Comprobamos que el código de emergencia esté en orden y
        //corresponda a su respectivo paciente.
        
        assertEquals(" A", queue.peek().getEmergencyCode());
        assertEquals("Maria Ramirez", queue.poll().getName());
        
        assertEquals(" B", queue.peek().getEmergencyCode());
        assertEquals("Carmen Sarmientos", queue.poll().getName());
        
        assertEquals(" C", queue.peek().getEmergencyCode());
        assertEquals("Juan Perez", queue.poll().getName());
        
        assertEquals(" E", queue.peek().getEmergencyCode());
        assertEquals("Lorenzo Toledo", queue.poll().getName());
	}
	
}
