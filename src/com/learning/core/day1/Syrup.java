package com.learning.core.day1;

class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}