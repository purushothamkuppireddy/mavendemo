package com.cg.mvnmra.ui;

import java.util.Scanner;

import com.cg.mnvmra.userexception.InvalidMobileNoException;
import com.cg.mnvmra.userexception.NumberDoesNotExist;
import com.cg.mnvmra.userexception.unsuccessfulexception;
import com.cg.mvnmra.beans.Account;
import com.cg.mvnmra.service.AccountService;
import com.cg.mvnmra.service.AccountServiceImpl;

public class MainUi {

	public static void main(String[] args) {
		Account account = new Account();
		AccountService as = new AccountServiceImpl();

		Scanner sc = new Scanner(System.in);
		int j = 1;
		while (j == 1) {
			System.out.println(" \nenter your choice\n 1.Check Balance\n 2.Recharge\n 3.exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter the mobilenumber");
				String mobile = sc.next();
				if (mobile.length() != 10) 
				{
					try {
						throw new InvalidMobileNoException();
					} catch (Exception e) {
					}

					break;
				}
				account = as.getAccountDetails(mobile);
				if (account != null) {
					System.out.println("Your Current Balance is:" + account.getAccountBalance());

				} else {
					try {
						throw new NumberDoesNotExist();
					} catch (Exception e) {
					}
					//break;
				}
				break;

			case 2:
				System.out.println("enter the mobile number ");
				String mobile2 = sc.next();
				account = as.getAccountDetails(mobile2);

				if (account != null)
				{
					System.out.println("enter amount");
					int bal = as.rechargeAccount(mobile2, sc.nextDouble());
						if(bal>0) {
							System.out.println("Your Account Recharged Successfully");
							System.out.println("Hello " + account.getCustomerName() + ",Available Balance is " + bal);
						}
						else
						{
						try {
							throw new unsuccessfulexception();
						} catch (Exception e) {
						}	
						}
				} 
				else 
				{
					try {
						throw new NumberDoesNotExist();
						} catch (Exception e) {
						}
					//break;
				}
				break;
			case 3:
				System.err.println("Thank You, visit again..");
				System.exit(0);

			}
		}
		
	}
}
