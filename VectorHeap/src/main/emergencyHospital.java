package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import models.Patient;
import models.VectorHeap;

public class emergencyHospital {

	/**
	 * Método principal que lee un archivo de pacientes y los atiende en orden de urgencia.
	 * @param
	 */
	
	public static void main(String[] args) {
		
		Vector<Patient> patientVector = new Vector<>();
		System.out.println("Bienvenido al hospital de emergencias");
		
		// Leer archivo de pacientes
        try {
            File archivo = new File("C:\\hospital.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("La base de datos de los pacientes ha sido encontrada con éxito.");
            System.out.println("***********************************************************************");
            System.out.println("Contenido encontrado: ");

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String[] parts = linea.split(",");
                patientVector.add(new Patient(parts[0], parts[1], parts[2].trim()));
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo de texto");
            System.out.println("Asegúrese de llamarlo hospital.txt en su disco C");
            return;
        }
        
     // Atender pacientes
        System.out.println("***************************");
        System.out.println("PACIENTES A ATENDER: ");

        VectorHeap<Patient> patientHeap = new VectorHeap<>(patientVector);
        Vector<Patient> sortedPatientVector = new Vector<>();
        while (!patientHeap.isEmpty()) {
            sortedPatientVector.add(patientHeap.remove());
        }

        if (sortedPatientVector.isEmpty()) {
        	   System.out.println("No hay pacientes para atender.");
        	} else {
        	   for (Patient patient : sortedPatientVector) {
        		   System.out.println(" ");
                   System.out.println("Turno del paciente " + patient.getName());
                   System.out.println("Síntomas presentados: " + patient.getSympton());
                   System.out.println("Código de emergencia: " + patient.getEmergencyCode());
        	   }
        	}
        
	}

}
