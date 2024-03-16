package com.learning.core.day10;

public class UserProfile {
	public boolean validateUsername(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public boolean validatePassword(String password) {
        return password.matches("^(?=.[0-9])(?=.[a-zA-Z]).{8}$");
    }
}
