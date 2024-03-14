package com.learning.core.day4;
import java.util.*;

public class BankAccount {
		int accNo;
		String custName,acctype;
		float balance;
BankAccount(int an,String cn,String at,float b) throws LowBalanceException,NegativeAmount
{     
	accNo=an;
	custName=cn;
	acctype=at;
	balance=b;
	if(at=="Saving")
	{
		if(b<1000)
		{
		     if(b>=0)
		    	 throw new LowBalanceException();
		     else
		    	 throw new NegativeAmount();
		}
	}
	else
	{
		if(b<5000)
		{
			if(b>=0)
		    	 throw new LowBalanceException();
		     else
		    	 throw new NegativeAmount();
		}
		
		
	}
}
public void deposit(float amt)throws NegativeAmount
{
	if(amt<0)
		throw new NegativeAmount();
	else
		balance=balance+amt;	
}
public float getBalance() throws LowBalanceException
{
	if((balance<1000 && acctype=="Saving")||(balance<5000 && acctype=="Current"))
         throw new LowBalanceException();
	else
		return balance;
}
}