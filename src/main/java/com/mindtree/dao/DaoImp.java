package com.mindtree.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindtree.entity.Passport;
import com.mindtree.entity.Person;
import com.mindtree.exception.DaoException.DaoException;
import com.mindtree.exception.DaoException.NoPersonIdException;
import com.mindtree.utility.JdbcConnection;

public class DaoImp implements DaoInterface {
	public void  insertIntoDB(Person details) throws DaoException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con=JdbcConnection.connect();
			String query = "insert into person values(?,?,?,?);";
			pst = con.prepareStatement(query);
			pst.setInt(1, details.getPersonid());
			pst.setString(2, details.getPersonName());
			pst.setString(3, details.getBirthPlace());
			pst.setInt(4, details.getAge());
			pst.execute();
			System.out.println("Details added");
		}catch(SQLException e) {
			System.out.println("connection failure "+e);
		}
		
	}

	public void insertIntoDB(Passport detail) throws DaoException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con=JdbcConnection.connect();
			String query = "insert into passport values(?,?);";
			pst = con.prepareStatement(query);
			pst.setInt(1, detail.getPersonid());
			pst.setString(2, detail.getPassportNo());
			pst.execute();
			System.out.println("Details added");
		}catch(SQLException e) {
			System.out.println("connection failure "+e);
		}
		
	}

	public void displayAll(int personid) throws NoPersonIdException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con=JdbcConnection.connect();
			String query = "select * from person join passport on person.Personid=passport.Personid where person.Personid=?;";
			pst = con.prepareStatement(query);
			pst.setInt(1, personid);
			rs=pst.executeQuery();
			if(rs.next()==false) 
				throw new NoPersonIdException("Person id not found ");
			else {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			
		}catch(SQLException e) {
			throw new NoPersonIdException("Person id not found ");
		}
	
	}
	public void sortMethod() throws DaoException{
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con=JdbcConnection.connect();
			String query = "select * from person order by birthplace";
			pst = con.prepareStatement(query);
			rs=pst.executeQuery();
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
		}catch(SQLException e) {
			System.out.println("connection failure "+e);
			e.printStackTrace();

		}
	
		
	}

}
