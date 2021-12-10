package com.mindtree.service;

import java.util.Scanner;

import com.mindtree.dao.DaoImp;
import com.mindtree.dao.DaoInterface;
import com.mindtree.entity.Passport;
import com.mindtree.entity.Person;
import com.mindtree.exception.DaoException.DaoException;
import com.mindtree.exception.ServiceException.ServiceException;

public class ServiceImp implements ServiceInterface{
	DaoInterface obj = new DaoImp();
	static Scanner sc = new Scanner(System.in);

	public void getPerson() throws ServiceException{
		
		System.out.println("Enter the person name");
		String name = sc.next();
		System.out.println("Enter the person birthplace ");
		String place = sc.next();
		System.out.println("Enter person age: ");
		int age = sc.nextInt();
		System.out.println("Enter the person id:");
		int personid = sc.nextInt();
		Person details = new Person(name,place,age,personid);
		try {
			obj.insertIntoDB(details);
		} catch (DaoException e) {
			throw new ServiceException("Insertion failure"+e);

		}
	}

	public void getPassport() throws ServiceException {
		System.out.println("Enter the person id ");
		int personid = sc.nextInt();
		System.out.println("Enter the passport number");
		String number = sc.next();
		Passport detail = new Passport(personid,number);
		try {
		obj.insertIntoDB(detail);
		}catch (DaoException e) {
			throw new ServiceException("Insertion failure"+e);
			
		}
	}

	public void displayAll() throws ServiceException{
		System.out.println("Enter person id: ");
		int personid = sc.nextInt();
		try {
		obj.displayAll(personid);
		}catch (DaoException e) {
			throw new ServiceException("Insertion failure"+e);
		}
	}

	public void sortByBirthPlace() throws ServiceException{
		try {
			obj.sortMethod();
		}catch(DaoException e) {
			throw new ServiceException("Insertion failure "+e);
		}

		
	}

}
