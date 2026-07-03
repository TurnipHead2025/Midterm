# Medical Clinic Prescription Management System

## 1.0 User Documentation

### Application Overview
This application is a console-based management system designed for a medical clinic. It allows clinic staff to manage core data relationships between Doctors, Patients, and Medication inventory.
The system acts as a real-time reporting engine, tracking active prescriptions, flagging expired medications for safety audits, and archiving patient prescription histories to ensure regulatory compliance and efficient clinic operations.

## 1.2 Class Descriptions and Workings
The system is built using Object-Oriented Programming (OOP) principles, utilizing four core classes that interact with one another:
**Doctor:** Represents the clinic's medical staff. It handles the doctor's identification details and manages a collection of their assigned patients.
**Patient:** Represents the individuals receiving care. It holds their personal information and maintains a dedicated list of their unique prescriptions.
**Medication:** Represents the pharmacy inventory, tracking specific drug names, unit quantities, and warehouse expiration dates.
**Prescription:** Acts as the central link connecting a specific Doctor, a Patient, and a Medication together, automatically calculating a pharmacy expiration date upon creation.

### 1.3 User Guide: Accessing and Navigating the System
The application features a fully interactive, text-based console menu. When started, users are presented with a main menu to choose which data sector they want to manage.

#### Navigation Steps:
**Launch the Application:** Run 'java MedicationSystem' is the CLI to display the main system options.
**Select a Category:** 
The application features a fully interactive, text-based console menu. When started, users navigate the system by entering a number from `1` to `9` to execute specific tasks
   **1** - Add a New Patient
   **2** - Add a New Doctor
   **3** - Add a New Medication
   **4** - Restock Medication
   **5** - Edit Patient Details
   **6** - Delete a Patient
   **7** - Search by name
   **8** - Generate System Reports (Opens the Reports Submenu)
   **9** - Exit the Application

### 1.4 System Class Diagram
The diagram below illustrates the UML architecture of the clinic management system, detailing the attributes, methods, and structural associations between the core classes.

![Clinic System Class Diagram](class_diagram.png)


## 2.0 Technical Documentation

### 2.1 Directory Structure
ClinicManagementSystem/
├── src/
│   ├── Doctor.java
│   ├── Patient.java
│   ├── Medication.java
│   ├── Prescription.java
│   └── MedicationSystem.java
├── bin/
│   ├── Doctor.class
│   ├── Patient.class
│   ├── Medication.class
│   ├── Prescription.class
│   └── MedicationSystem.class
└── doc/
    └── (Generated JavaDoc HTML files and stylesheets)

 ### 2.2 Build & Execution Process
To compile and run the application via a standard CLI environment, execute the following commands from the project root directory:
**Compilation: `javac -d bin src/*.java`**
**Execution: `java -cp bin MedicationSystem`**

### 2.3 Development & Clean Code Standards
The codebase strictly adheres to the following structural engineering guidelines:
**Naming Conventions** UpperCamelCase for class names; lowerCamelCase for variables and methods featuring descriptive naming.
**Encapsulation** All class state attributes are isolated using the private keyword and regulated through public getter and setter methods.

 ## 2.3 Theoretical Database Design (PostgreSQL Architecture)
If this application were migrated from transient, in-memory ArrayList storage to a permanent PostgreSQL Relational Database Management System (RDBMS), the architecture would be structured into the following four tables.   

**Doctors Table** Tracks the clinic's medical staff attributes.
doctor_id (SERIAL PRIMARY KEY): An auto-incrementing integer unique to each physician.
name (TEXT): The full name of the doctor.
age (INT): The doctor's age.
phone_number (TEXT): Professional contact number.
specialization (TEXT): The doctor's area of medical expertise.

**Patients Table** Stores patient demographic profiles.
patient_id (SERIAL PRIMARY KEY): An auto-incrementing integer unique to each patient.
name (TEXT): The full name of the patient.
age (INT): The patient's age.
phone_number (TEXT): Patient contact number.

**Medications Table** Manages the active pharmacy warehouse inventory.
medication_id (SERIAL PRIMARY KEY): Auto-incrementing unique identifier for the drug batch.
name (TEXT): The name of the medication.
dose (TEXT): The dosage strength description (e.g., "20mg").
quantity (INT): Current physical stock level in the inventory.
expiry_date (DATE): The regulatory expiration date of the batch.

**Prescriptions Table** The central relational "junction" table mapping the interactions between doctors, patients, and medications.
prescription_id (SERIAL PRIMARY KEY): Auto-incrementing unique identifier for the prescription order.
doctor_id (INT REFERENCES Doctors(doctor_id)): Foreign Key specifying who authorized the script.
patient_id (INT REFERENCES Patients(patient_id)): Foreign Key specifying who receives the medication.
medication_id (INT REFERENCES Medications(medication_id)): Foreign Key specifying which drug is being dispensed.
rx_expiry (DATE): The date the individual script expires.

 ## 2.4 GitHub Roster & Clone Guide
To download, inspect, or collaborate on the ClinicManagementSystem codebase, follow these step-by-step terminal instructions to clone the repository using Git.

**Locate the Repository URL**
Navigate to the hosted project page on GitHub. Click the green Code button on the top right of the repository dashboard and copy the secure URL under the HTTPS tab: https://github.com/TurnipHead2025/Midterm.git

**Clone the Project via Terminal**
Open your local terminal (or Command Prompt) and navigate to the directory where you want to save the project folder (e.g., cd Documents). Execute the git clone command followed by your copied link: git clone https://github.com/TurnipHead2025/Midterm.git


