package optional;

import java.util.Optional;

class Patient {
    private String emergencyContact;

    public Patient(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Optional<String> getEmergencyContact() {
        return Optional.ofNullable(emergencyContact);
    }
}

public class EmergencyContact {
    public static void main(String[] args) {

        Patient p1 = new Patient("9876543210");
        Patient p2 = new Patient(null);

        String contact1 = p1.getEmergencyContact().orElse("No emergency contact");
        String contact2 = p2.getEmergencyContact().orElse("No emergency contact");

        System.out.println(contact1);
        System.out.println(contact2);
    }
}
