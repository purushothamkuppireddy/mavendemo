package com.cg.mvnmra.jdbcdao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

 class AccountDaoImpl2Test extends TestCase {

	
	
static AccountDaoImpl2 dao=new AccountDaoImpl2();
//@BeforeAll

@Test
	public void testGetAccountDetails() {
		assertEquals(null,dao.getAccountDetails("949470902"));
	}
@Test
	public void testRechargeAccount() {
	assertEquals(209,dao.rechargeAccount("9494709021",2) );
	}

}
