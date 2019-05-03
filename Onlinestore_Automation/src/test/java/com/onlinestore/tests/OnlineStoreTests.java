package com.onlinestore.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.onlinestore.library.Base;
import com.onlinestore.pages.AddressConfirm;
import com.onlinestore.pages.Authentication;
import com.onlinestore.pages.CreateAnAccount;
import com.onlinestore.pages.HomePage;
import com.onlinestore.pages.OrderConfirm;
import com.onlinestore.pages.OrderSummary;
import com.onlinestore.pages.Payment;
import com.onlinestore.pages.PrintedSummerDress;
import com.onlinestore.pages.SearchForCasualDress;
import com.onlinestore.pages.Shipping;
import com.onlinestore.pages.ShoppingCartSummary;

public class OnlineStoreTests extends Base {
	final static Logger logger = Logger.getLogger(OnlineStoreTests.class);
	HomePage myHomePage = new HomePage();
	SearchForCasualDress myDress = new SearchForCasualDress();
	PrintedSummerDress summerDress = new PrintedSummerDress();
	ShoppingCartSummary myCart = new ShoppingCartSummary();
	Authentication auth = new Authentication();
	CreateAnAccount myAccount = new CreateAnAccount();
	AddressConfirm myaddress = new AddressConfirm();
	Shipping shipping = new Shipping();
	Payment payoption = new Payment();
	OrderSummary orderconfirm = new OrderSummary();
	OrderConfirm confirmation = new OrderConfirm();
	
	@Test(description= "This testcase is for select casualdress", priority=1, enabled = true)//This for selecting casual dress
	public void buyCasualDress() {

		myHomePage.gotoMyStorewebsite();
		myHomePage.selectingCasualdress();
		myDress.waitUntilPageLoad();
		myDress.selectCausalDress();
		summerDress.waitUntilPageLoad();
		summerDress.dressQuantity();
		myCart.waitUntilPageLoad();
		myCart.proceedToCheckOutBTN();
		auth.waitUntilPageLoad();
		String tempEmail="test"+myLibrary.getCurrentTime() + "@test.com";
		//System.out.println("Email ["+ tempEmail + "]");
		auth.createAnAccount(tempEmail);
		myAccount.waitUntilPageLoad();
		myAccount.signIn();
		myaddress.waitUntilPageLoad();
		myaddress.confirmAddress();
		shipping.waitUntilPageLoad();
		shipping.shippingInfo();
		payoption.waitUntilPageLoad();
		payoption.paymentTypeCheck();
		orderconfirm.waitUntilPageLoad();
		orderconfirm.confirmOrder();
		confirmation.waitUntilPageLoad();
		confirmation.confarmation();
	
	}

	@Test(description= "This testcase is for select T-shirt",priority=2, enabled = false)
	public void buyTshirts() {
		myHomePage.gotoMyStorewebsite();
		myHomePage.selectingT_shirts();
		myDress.waitUntilPageLoad();
		myDress.selectT_shirt();
		summerDress.waitUntilPageLoad();
		summerDress.dressQuantity_tShirt();
		myCart.waitUntilPageLoad();
		myCart.proceedToCheckOutBTN();
		auth.waitUntilPageLoad();
		String tempEmail="test"+myLibrary.getCurrentTime() + "@test.com";
		//System.out.println("Email ["+ tempEmail + "]");
		auth.createAnAccount(tempEmail);
		myAccount.waitUntilPageLoad();
		myAccount.signIn();
		myaddress.waitUntilPageLoad();
		myaddress.confirmAddress();
		shipping.waitUntilPageLoad();
		shipping.shippingInfo();
		payoption.waitUntilPageLoad();
		payoption. paymentTypeWire();
		orderconfirm.waitUntilPageLoad();
		orderconfirm.confirmOrder();
		confirmation.confarmation_Tshirt();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
