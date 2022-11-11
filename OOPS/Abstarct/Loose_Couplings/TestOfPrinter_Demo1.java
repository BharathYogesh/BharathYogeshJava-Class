package com.Abstraction.LooseCuplings;

public class TestOfPrinter_Demo1 {

	public static void main(String args[]) {
		
		Sony sony = new Sony();
		Epson epson =new Epson();
		Computer computer= new Computer();
		
		
		
		computer.slot(sony);
		computer.slot(sony);
	}
}
