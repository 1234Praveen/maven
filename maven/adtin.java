package com.maven;

import java.io.IOException;

public class adtin extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserconfigchrome();
		openurl("http://adactinhotelapp.com/");
		maximizewindow();
		login l= new login();
		inputtext(l.getTxtName(),excelRead("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx", "Sheet2", 1, 0));
		inputtext(l.getTxtPass(), excelRead("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx", "Sheet2", 1, 1));
		click(l.getBtnlogin());
		Searchhotel s = new Searchhotel();
		dropdownByindex(s.getDdlocation(),8);
		dropdownByindex(s.getDdhotels(), 2);
		dropdownByindex(s.getDdrometype(), 4);
		dropdownByindex(s.getDdroomnumber(), 2);
		dropdownByindex(s.getDdadultroom(), 1);
		dropdownByindex(s.getDdchildroom(), 2);
		click(s.getBtnsearch());
		Selecttotal t= new Selecttotal();
		click(t.getBtnradio());
		click(t.getBtncontinue());
		Bookhotel b= new Bookhotel();
		inputtext(b.getFirstname(), excelRead("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx", "Sheet2", 4, 0));
        inputtext(b.getLastname(), excelRead("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx", "Sheet2", 4, 1));
        inputtext(b.getAddress(), excelRead("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx", "Sheet2", 4, 2));
        inputtext(b.getCreditcard(), excelRead("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx", "Sheet2", 4, 3));
        dropdownByindex(b.getCredittype(), 3);
        dropdownByindex(b.getExpirymonth(), 5);
        dropdownByindex(b.getExpiryyear(), 6);
        inputtext(b.getCcnumber(), excelRead("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx", "Sheet2", 4, 4));
        click(b.getBooknow());
        Booking c = new Booking();
        c.click(c.getBooked());
        
        
        
        
        
        
	}

}