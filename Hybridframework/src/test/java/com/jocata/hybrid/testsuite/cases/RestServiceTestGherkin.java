package com.jocata.hybrid.testsuite.cases;

public class RestServiceTestGherkin {

	public static void main(String args[]) {
		
		get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/").
        then().
            assertThat().body("customer.id", equalTo("12212")).
        and().
            assertThat().body("customer.firstName", equalTo("John")).
        and().
            assertThat().body("customer.lastName", equalTo("Doe")); 	
		
	}
	
}
