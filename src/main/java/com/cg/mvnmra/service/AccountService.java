package com.cg.mvnmra.service;

import com.cg.mvnmra.beans.Account;

public interface AccountService {
 Account getAccountDetails(String mobileNo) ;
int rechargeAccount(String mobileno,double rechargeAmount);	
	
}
