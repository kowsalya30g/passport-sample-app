package com.mindtree.dao;

import com.mindtree.entity.Passport;
import com.mindtree.entity.Person;
import com.mindtree.exception.DaoException.DaoException;
import com.mindtree.exception.DaoException.NoPersonIdException;

public interface DaoInterface {

	void insertIntoDB(Person details) throws DaoException;

	void insertIntoDB(Passport detail) throws DaoException;

	void displayAll(int personid) throws NoPersonIdException;

	void sortMethod() throws DaoException;


}
