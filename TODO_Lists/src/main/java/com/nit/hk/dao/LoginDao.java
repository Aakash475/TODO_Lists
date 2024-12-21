package com.nit.hk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nit.hk.model.LoginPojo;
import com.nit.hk.utils.JDBCUtils;

public class LoginDao {
	public boolean validate(LoginPojo loginPojo) throws ClassNotFoundException {
		boolean status = false;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		try (Connection connection = JDBCUtils.getConnection();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = ? and password = ? ")) {
			preparedStatement.setString(1, loginPojo.getUsername());
			preparedStatement.setString(2, loginPojo.getPassword());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			JDBCUtils.printSQLException(e);
		}
		return status;
	}
}
