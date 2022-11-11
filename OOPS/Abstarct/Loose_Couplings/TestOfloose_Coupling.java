package com.Abstraction.LooseCuplings;

public class TestOfloose_Coupling {
public static void main(String args[])
{
	Visa visa= new Visa();
	Rupay rupay = new Rupay();
	ATM_Machine obj= new ATM_Machine();
	
	obj.slot(visa);
	obj.slot(rupay);
}
}