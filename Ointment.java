package com.learning.core.day1;

class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment is for external use only.");
    }
}