// Sheri Evangelene
//JAVA midterm Sprint
//JUne 2026

import java.util.ArrayList;

public class Patient extends Person {
    private ArrayList <Medication> medications = new ArrayList<>();
    private ArrayList <Prescription> rx = new ArrayList<>();

    public Patient(int id, String name, int age, String phoneNumber){
        super(id,name,age,phoneNumber);
    }

    public ArrayList <Medication> getMeds(){
        return medications;
    }

    public ArrayList <Prescription> getRx(){
        return rx;
    }

    public String toString(){
        return (super.toString() + "\nMedications: " + medications + "\nPresciptions: " + rx );
    }
}
