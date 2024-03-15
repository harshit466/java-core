package com.learning.core.day5;
import java.util.Random;

class Register<T> {
    private String registerId;

    public Register(String registerId) {
        this.registerId = registerId;
    }

    public String generateRegisterId(int n) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < n; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public void display(T user) {
        if (user instanceof Employee) {
            Employee employee = (Employee) user;
            System.out.println(registerId + " " + employee.getName() + " " + employee.getPhoneNo() + " " +
                    (employee.getPassportNo() != null ? employee.getPassportNo() : employee.getLicenseNo() + " " +
                            employee.getPanCardNo()) + " " + employee.getEmployeeId());
        } else if (user instanceof Student) {
            Student student = (Student) user;
            System.out.println(registerId + " " + student.getName() + " " + student.getPhoneNo() + " " +
                    (student.getPassportNo() != null ? student.getPassportNo() : student.getLicenseNo() + " " +
                            student.getPanCardNo()) + " " + student.getVoterId());
        }
    }
}
