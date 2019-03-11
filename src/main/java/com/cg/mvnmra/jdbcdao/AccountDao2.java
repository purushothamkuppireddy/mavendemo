package com.cg.mvnmra.jdbcdao;

import com.cg.mvnmra.beans.Account;

public interface AccountDao2 {

	Account getAccountDetails(String mobileNo);
	int rechargeAccount(String mobileno,double rechargeAmount);	

	
}
