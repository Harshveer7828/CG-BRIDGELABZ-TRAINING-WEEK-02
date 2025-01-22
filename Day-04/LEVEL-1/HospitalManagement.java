import java.util.ArrayList;
import java.util.List;

// Class Patient
class Patient {
    private String name;
    private List<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // add doctor to the consultedDoctors list and vice versa
    public void consultDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
            doctor.addPatient(this);
        }
    }

    public void showConsultedDoctors() {
        System.out.println(name + " has consulted to the following doctors:-");
        for (Doctor doctor : consultedDoctors) {
            System.out.println(doctor.getName());
        }
    }
}

// Class Doctor 
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    //Add patient in the list
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.consultDoctor(this);
        }
    }

    //Consult with doctor patient in the list
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            addPatient(patient);
        }
        System.out.println("Doctor " + name + " is consulting patient " + patient.getName() + ".");
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has the following patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

// Class to represent a Hospital
class Hospital {
    private List<Doctor> doctors;

    public Hospital() {
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }
}


public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Creating doctors
        Doctor doctor1 = new Doctor("Dr. Harsh");

        // Adding doctors to the hospital
        hospital.addDoctor(doctor1);

        // Creating patients
        Patient patient1 = new Patient("Om Ch");

        doctor1.consult(patient1);

        hospital.showDoctors();

        doctor1.showPatients();

        patient1.showConsultedDoctors();
    }
}
