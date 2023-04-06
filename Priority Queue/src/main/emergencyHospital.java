package main;
import java.util.PriorityQueue;
import models.ComparatePacient;
import models.Patient;
import java.io.*;

public class emergencyHospital {

    public static void main(String[] args) {

        System.out.println("Bienvenido al hospital de emergencias");
        PriorityQueue<Patient> personas;
        personas = new PriorityQueue<>(new ComparatePacient());
 
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
                personas.offer(new Patient(parts[0], parts[1], parts[2]));
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo de texto");
            System.out.println("Asegúrese de llamarlo hospital.txt en su disco C");
            return;
        }

        System.out.println("***************************");
        System.out.println("PACIENTES A ATENDER: ");

        // Atender pacientes
        int numPacientes = personas.size();
        for (int i = 1; i <= numPacientes; i++) {
            Patient persona = personas.poll();
            System.out.println(" ");
            System.out.println("Turno del paciente " + persona.getName() + " en la camilla número " + i);
            System.out.println("Síntomas presentados: " + persona.getSympton());
            System.out.println("Código de emergencia: " + persona.getEmergencyCode());
        }
    }
}

