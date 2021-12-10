package com.mindtree.service;

import com.mindtree.exception.ServiceException.ServiceException;

public interface ServiceInterface {
	public void getPerson() throws ServiceException;
	public void getPassport() throws ServiceException;
	public void displayAll() throws ServiceException;
	public void sortByBirthPlace() throws ServiceException;

}
