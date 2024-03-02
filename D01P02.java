// Interface to represent a drug
interface MedicineInfo {
    void displayLabel();
}

// Tablet class implementing MedicineInfo interface
class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Store Tablets in a cool dry place.");
    }
}

// Syrup class implementing MedicineInfo interface
class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}

// Ointment class implementing MedicineInfo interface
class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment is for external use only.");
    }
}

// Test class to demonstrate polymorphic behavior
public class TestClass {
    public static void main(String[] args) {
        // Declare Medicine instances
        MedicineInfo tablet = new Tablet();
        MedicineInfo syrup = new Syrup();
        MedicineInfo ointment = new Ointment();
        
        // Check the polymorphic behavior of the displayLabel()
        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();
    }
}