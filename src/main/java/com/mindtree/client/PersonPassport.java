package com.mindtree.client;

import java.util.Scanner;

import com.mindtree.exception.ServiceException.ServiceException;
import com.mindtree.service.ServiceImp;

public class PersonPassport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		boolean cond = true;
		ServiceImp ob = new ServiceImp();
		while(cond) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.get person details\n2.get passport and assign to person\n 3.displayall\n4.sort birthplace\n5.exit");
			System.out.println("---------------------------------------------------");
			System.out.println("Hello");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				try {
					ob.getPerson();
				} catch (ServiceException e) {
		
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					ob.getPassport();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					ob.displayAll();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				try {
				ob.sortByBirthPlace();
				}catch(ServiceException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Thanku for passport ");
				cond = false;
				break;
			default:
				System.out.println("invalid choice");
				
			}
			
		}
	}

}
