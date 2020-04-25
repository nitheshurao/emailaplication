package email;

import java.util.Random;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Email {

	private String name;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String Department;
	private int defaultpasswordlength =10;
	private int mailboxcapacityEmail;
	private String companySuffix ="anycompany.com";
	private String alternateEmail;
	//Constrtor to recve 1st name &lst name
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email Creater: "+ this.firstName +" "+this.lastName);
		//Call method asking for the deprtmt returnn the deparmt
		this.Department=setDeppartment();
		//System.out.println("Depsartment : "+ this.Department);
		//call a methoe that returna random password
		
		
		this.password=randompassword(defaultpasswordlength);
	System.out.println("u r password="+ this.password);
		//comine elemnt to genete email
		email=firstName.toLowerCase()+" "+ lastName.toLowerCase()+"@"+ Department +"."+companySuffix ;
		System.out.println("u r email is "+ email);
	}
	//ask for deprmt
	private String setDeppartment() {
		System.out.println("new worker " +firstName+" enter department code "+"\n 1 for Sales \n 2 for Department \n 3 for Accounting for none \n Enter department ");
		Scanner in=new Scanner(System.in);
		int depchoice=in.nextInt();
		if(depchoice==1) {
			return "sales";
		}else if(depchoice==2) {return "dev";}
		else if(depchoice ==3) {return "acc";}
		else {
			return "non";
		}
		}
	private String randompassword(int length){
		String passwordSet="abcdefgh123";
		char[]password = new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random() * passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	
	
	//set mailbox capaity 
	public void setMailboxcapacity(int capacity) {
		this.mailboxcapacityEmail=capacity;}
	
	//set altrnt email
	public void setAlterEmail(String altEmail) {
		this.alternateEmail =altEmail;}
	//change password
	
	public void changpass(String password) {
		this.password=password;}
	public int  getMailboxCapacity (){return mailboxcapacityEmail;}
	public String  getAlternateEmail() {return alternateEmail;}
	public String getpassword() {return password;}
	
	public String showinfo() {
		return "Display name :" + firstName+" "+ lastName +
				", company_email : "+ email+
				",mailbox capacity : "+ mailboxcapacityEmail +"mb"; 
		
	}
	

}
