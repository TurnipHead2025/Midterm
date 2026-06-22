// Sheri Evangelene
//JAVA midterm Sprint
//JUne 2026

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;



public class MedicationSystem {
    public static void main(String[] args) {

        //initalize empty arrayLists
        ArrayList <Doctor> doctors = new ArrayList<>();
        ArrayList <Patient> patients = new ArrayList<>();
        ArrayList <Medication> medications = new ArrayList<>();
        ArrayList <Prescription> prescriptions = new ArrayList<>();

        //Add doctors to doctors ArrayList
        doctors.add(new Doctor(1, "Julian Bashir", 30, "709-638-1212", "Gen. Practitioner"));
        doctors.add(new Doctor(2, "Ben Phlox", 92, "709-223-7898", "Humanoid Bio"));
        doctors.add(new Doctor(3, "Beverly Crusher", 45, "709-243-7098", "Genetic Medicine"));

        //Add patients to patients ArrayList
        patients.add(new Patient (12, "William Riker", 38, "709-638-9876"));
        patients.add(new Patient(14, "John Archer", 42, "709-243-0987"));
        patients.add(new Patient(67, "Miles O'Brien", 36, "709-638-9765"));

        //Create a random and calendar variable
        Random rand = new Random();
        Calendar cal = Calendar.getInstance();

        //Add medications to the medication ArrayList. Using a random date between 2024-2028. Used 28 days to simplify for feburary
        cal.set(rand.nextInt(5) + 2024, rand.nextInt(12), rand.nextInt(28) + 1);
        Date date1 = cal.getTime();
        medications.add(new Medication(88, "Hypo Spray", "20mg", 4, date1));

        cal.set(rand.nextInt(5) + 2024, rand.nextInt(12), rand.nextInt(28) + 1);
        Date date2 = cal.getTime();
        medications.add(new Medication(89, "Inaprovaline", "50mg", 10, date2));

        cal.set(rand.nextInt(5) + 2024, rand.nextInt(12), rand.nextInt(28) + 1);
        Date date3 = cal.getTime();
        medications.add(new Medication(92, "Hyronalin", "30cc", 16, date3));

        //Add new Prescription
        prescriptions.add(new Prescription(66, doctors.get(1), patients.get(1),medications.get(2) ));
        prescriptions.add(new Prescription(68, doctors.get(2), patients.get(2),medications.get(0) ));

        //Link a patient to a doctor. for Doctors at index 0 use the addPatient method to add patient index 3
        doctors.get(0).addPatient(patients.get(2));


        //Keyboard Scanner
        Scanner input = new Scanner(System.in);
        boolean running = true;

        //The Menu
        while(running){
            System.out.println("\n ===Clinic Mangement System===");
            System.out.println("1. Add a New Patient");
            System.out.println("2. Add a New Doctor");
            System.out.println("3. Add a New Medication");
            System.out.println("4. Restock Medication");
            System.out.println("5. Edit Patient Details");
            System.out.println("6. Delete a Patient");
            System.out.println("7. Search by name");
            System.out.println("8. Generate System Reports");
            System.out.println("9. Exit");
            System.out.println("Choose an Option: ");
        
            int choice = input.nextInt();
            input.nextLine(); //Clear the Enter from memory

            switch (choice){
                case 1:
                    System.out.println("\n --- Add New Patient---");
                    System.out.println("Enter ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Name: ");
                    String name = input.nextLine();

                    System.out.println("Enter age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Phone number");
                    String phone = input.nextLine();

                //build patient and add them to the ArrayList
                    patients.add(new Patient(id,name,age,phone));
                    System.out.println("Patient " + name + " added successfully!");
                break;
                
                case 2:
                    System.out.println("\n --- Add New doctor---");
                    System.out.println("Enter ID: ");
                    int docId = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Name: ");
                    String docName = input.nextLine();

                    System.out.println("Enter age: ");
                    int docAge = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Phone number");
                    String docPhone = input.nextLine();

                    System.out.println("Enter the Doctor's specialization: ");
                    String specialty = input.nextLine();

                    //Build the Doctor and add to doctors ArrayList
                    doctors.add(new Doctor(docId,docName,docAge,docPhone,specialty));
                    System.out.println("Doctor " + docName + " Added successfully!");
                break;
           
                case 3:
                    System.out.println("\n --- Add New Medication---");

                    System.out.println("Enter Drug ID: ");
                    int medId = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Drug Name: ");
                    String medName = input.nextLine();

                    System.out.println("Enter Dose (e.g., 20mg): ");
                    String dose = input.nextLine();

                    System.out.println("Enter Quantity: ");
                    int qty = input.nextInt();
                    input.nextLine();

                    // Roll the dice for a random date between 2024 and 2028
                    cal.set(rand.nextInt(5) + 2024, rand.nextInt(12), rand.nextInt(28) + 1);
                    Date randomDate = cal.getTime();

                    //Build the Medication object and add it to the list!
                    medications.add(new Medication(medId, medName, dose, qty, randomDate));
                    System.out.println("Medication " + medName + " added successfully with random expiry date!");
                break;
                
                case 4:
                    System.out.println("\n --- Restock Medication---");
                    System.out.println("Enter the name of the drug to restock: ");
                    String searchMed = input.nextLine();
                    boolean medFound = false;

                    //loop through the medication arrayList.Compare user input to drug name (ignoring cases). If true the user inputs the amount to add. add that amt to current amount by using the getQuantity method.  Print updated record
                    for (int i = 0; i < medications.size(); i++){
                        Medication currentMed = medications.get(i);
                        if (currentMed.getName().equalsIgnoreCase(searchMed)){
                            medFound = true;
                            System.out.println("Enter the number of units to add: ");
                            int amtToAdd = input.nextInt();
                            input.nextLine();
                            int newQty = currentMed.getQuantity() + amtToAdd;
                            currentMed.setQuantity(newQty);
                            System.out.println("Stock updated for: \n " + currentMed + " Total is stock= " + newQty );
                        break;     
                        }
                    }                        
                    if (!medFound){
                        System.out.println("Medication " + searchMed + " not found ");
                    }
                    break;

                    //Loop though the Patient ArrayList. if user input (searchPatient) and patient name (currentPatient) = true, then ask user which field they want to update. 
                case 5:
                    System.out.println("\n ---Edit Patient Details---");
                    System.out.println("Enter the name of the patient: ");
                    String searchPatient = input.nextLine();
                    boolean patFound = false;

                    //loop through patient ArrayList. If searchPatient matches a currentPatient patFound=true. The user inputs which field to change. Uses Swicth to change that field using Person setters. Prints changed record
                    for (int i = 0; i < patients.size(); i++){
                        Patient currentPatient = patients.get(i);
                        if (currentPatient.getName().equalsIgnoreCase(searchPatient)){
                        patFound = true;
                        System.out.println("\nPatient found:\n"  + currentPatient + "\n");
                        System.out.println("Enter the field you would like to change. Name, Age, or Phone Number? ");
                        String subChoice = input.nextLine().toLowerCase().trim();

                        switch (subChoice) {
                                case "name":
                                    System.out.print("Enter new name: ");
                                    String newName = input.nextLine();
                                    currentPatient.setName(newName);
                                    break;                                    
                                case "age":
                                    System.out.print("Enter new age: ");
                                    int newAge = input.nextInt();
                                    input.nextLine(); 
                                    currentPatient.setAge(newAge);
                                    break;                                    
                                case "phone number":
                                    System.out.print("Enter new phone number: ");
                                    String newPhone = input.nextLine();
                                    currentPatient.setPhoneNumber(newPhone);
                                    break;                                    
                                default:
                                    System.out.println("Invalid selection. No changes made.");
                                    break;
                            }
                            System.out.println("\nSuccess! Record updated:\n" + currentPatient);
                            break;
                        }
                    }break;    
                       


                case 6:
                    System.out.println("\n --- Delete Patient Record---");
                    System.out.println("Enter patient name: ");
                    String deletePatient = input.nextLine();
                    boolean deleteFound = false;

                    // Loops through patients ArrayList. if currentPatient matches user input (deletePatient) deleteFound = true. Print currentPatient for user. Erase obj from array using its index from the loop.
                    for (int i = 0; i < patients.size(); i++){
                        Patient currentPatient = patients.get(i);
                        if (currentPatient.getName().equalsIgnoreCase(deletePatient)){
                        deleteFound = true;
                        System.out.println("\nRemoving record for:\n"  + currentPatient + "\n");
                        patients.remove(i);
                        System.out.println("Success! Patient record has been permanently deleted.");
                        break;
                        }        
                    }
                    if (!deleteFound){
                        System.out.println("Error: Patient " + deletePatient + " not found in the system.\n");
                    }
                    break;



                case 7:
                    System.out.println("\n ---Search By Name---");
                    System.out.println("Enter name: ");
                    String searchName = input.nextLine();
                    boolean findName = false;

                    for (int i = 0; i < patients.size(); i++){
                        Patient p = patients.get(i);
                        if (p.getName().equalsIgnoreCase(searchName)){
                            System.out.println("\nMatch Found in Patients:");
                            System.out.println(p);
                            findName = true;
                        }
                    }       
                    for (int i = 0; i < medications.size(); i++){
                        Medication m= medications.get(i);
                        if (m.getName().equalsIgnoreCase(searchName)){
                            System.out.println("\n Match found in Medications:");
                            System.out.println(m);
                            findName = true;
                        }
                    } 
                    if (!findName){
                        System.out.println("Patient or Medication not found");
                    }
                    break;
                    
                case 9:
                    System.out.println("Exiting system. Goodbye.");
                    running = false;
                break;
                default:
                    System.out.println("Invalid choice. Try again.");  
                }
        }
    }
}

