package com.sist.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public UpdateTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection makeConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.199:1521:xe", "hr", "hr");
			System.out.println("DB Connection Success!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public int update(String id, int age) {
		int cnt = 0;
		Connection conn = null;
		Statement stmt = null;
		
		conn = makeConnection();
		
		String sql = "update userdto set age = " + age + " \n";
		sql += "where id = '" + id + "'";
		System.out.println("sql : " + sql);
		
		try{
			stmt = conn.createStatement();
			
			cnt = stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
		return cnt;
	}
}
















