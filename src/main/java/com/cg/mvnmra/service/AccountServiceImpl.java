package com.cg.mvnmra.service;

import com.cg.mvnmra.beans.Account;
import com.cg.mvnmra.jdbcdao.AccountDao2;
import com.cg.mvnmra.jdbcdao.AccountDaoImpl2;

public class AccountServiceImpl implements AccountService {
AccountDao2 ad=new AccountDaoImpl2();
Account account=new Account();

public Account getAccountDetails(String mobileNo) {
	
	account=ad.getAccountDetails(mobileNo);
	return account;
}

public int rechargeAccount(String mobileno, double rechargeAmount) {
	
	int bal=ad.rechargeAccount( mobileno, rechargeAmount);
	return bal;
}

}
