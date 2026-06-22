// Sheri Evangelene
//JAVA midterm Sprint
//JUne 2026

import java.util.Calendar;
import java.util.Date;

public class Prescription {
    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private Date rxexpiry;


    public Prescription(int id, Doctor doctor, Patient patient, Medication medication){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1);
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.rxexpiry = cal.getTime();        
    }

    public int getId(){
        return this.id;
    }

    public Doctor getDoctor(){
        return this.doctor;
    }

    public Patient getPatient(){
        return this.patient;
    }

    public Medication getMed(){
        return this.medication;
    }

    public Date getRxExpiry(){
        return this.rxexpiry;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void setPatient( Patient patient){
        this.patient = patient;
    }

    public void setMed(Medication medication){
        this.medication = medication;
    }

    public void setRxExpiry(Date rxexpiry){
        this.rxexpiry = rxexpiry;
    }

    public String toString(){
        return ("RX Id: " + id + "\nDoctor: " + doctor + ", Patient: " + patient + "\nMedication: " + medication + "\nRX Expiry Date" + rxexpiry +". " );
    }
}
