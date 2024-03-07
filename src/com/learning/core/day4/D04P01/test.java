package com.learning.core.day4.D04P01;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter account number:");
			int accountNumber = scanner.nextInt();
			System.out.println("Enter account holder's name:");
			String accountHolder = scanner.next();
			System.out.println("Enter account type:");
			String accountType = scanner.next();
			System.out.println("Enter balance:");
			double balance = scanner.nextDouble();

			BankAccount o = new BankAccount(accountNumber, accountHolder, accountType, (float) balance);
		} catch (LowBalanceException e1) {
			System.out.println("LowBalance");
		} catch (NegativeAmount e2) {
			System.out.println("NegativeAmount");
		}
	}
}
