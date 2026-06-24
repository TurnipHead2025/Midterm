// Sheri Evangelene
//JAVA midterm Sprint
//JUne 2026

import java.util.ArrayList;

public class Doctor extends Person {
    private String specialization;
    private ArrayList <Patient> patients = new ArrayList<>();

    public Doctor(int id, String name, int age, String phoneNumber, String specialization){
        super(id,name,age,phoneNumber);
        this.specialization = specialization;
    }

    public String getSpecialization(){
        return this.specialization;
    }

    public  ArrayList <Patient> getPatient(){
        return patients;
    }

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    public String toString(){
        return (super.toString() + "\nSpecializtion: " + specialization + "\nPatients: " + patients +"\n");
    }
}
