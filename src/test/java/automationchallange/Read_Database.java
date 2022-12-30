package automationchallange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Read_Database {
	
public static void main(String[] args) throws Throwable {
	Class.forName(""); //JDBC path for using forName method
	//Help of getConnection we have to pass url,host,schema, userName and Password
	Connection connection=DriverManager.getConnection("");
	//To omit the case sensitive issue
Statement stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	
	ResultSet rs=stmt.executeQuery("select * from employees");
	//For bunch of data we declare List which is come from java util
	List<String> columnvalue=new ArrayList<String>();
	//To omit header and go the next
	while(rs.next()) {
		columnvalue.add(rs.getString("salary"));
		System.out.println(columnvalue);
	}
	
}
//Practice
/*public static void readDataBase() throws Throwable {
	Class.forName("");
	Connection connection=DriverManager.getConnection("");
	Statement stmt= connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=stmt.executeQuery("select * from employees");
	List<String> columnvalue=new ArrayList<String>();
	while(rs.next()) {
		columnvalue.add(rs.getString("salary"));
		System.out.println(columnvalue);
		
	}
	
}*/
/*public static void dataBase() throws Throwable {
	Class.forName("");//JDBC connection
	Connection connection=DriverManager.getConnection("");//URL, Schema,User Name ,Password
	Statement stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=stmt.executeQuery("select * from employees");
	List<String> columnvalue=new ArrayList<String>();
	while(rs.next()) {
		columnvalue.add(rs.getString("salary"));
		System.out.println(columnvalue);
		
	}
	
	
}*/
/*public static void dataBase() throws Throwable {
	Class.forName("");
	Connection connection=DriverManager.getConnection("");
	Statement smt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=smt.executeQuery("select * from employees");
	List<String> columnvalue=new ArrayList<String>();
	while(rs.next()) {
		columnvalue.add(rs.getString("salary"));
	}
	
}*/
/*public static void readDatabase() throws Throwable {
	Class.forName("");//JDBC path
	Connection connection=DriverManager.getConnection("");//host,Schema,url,username,password
	//To omit case sensitive issue
	Statement stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=stmt.executeQuery("Select * from employees");
	List<String> columnvalue=new ArrayList<String>();
	while(rs.next()) {
		columnvalue.add(rs.getString("Salary"));
		
	}
}*/
/*public static void readDatabase() throws Throwable {
	Class.forName("");
	Connection connection=DriverManager.getConnection("");
	Statement stmt= connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=stmt.executeQuery("select * from employees");
	List<String> columnvalue= new ArrayList<String>();
	while(rs.next()) {
		columnvalue.add(rs.getString("Salary"));
	}
}*/
/*public static void readDataBase() throws Throwable {
	Class.forName("");
	Connection connection=DriverManager.getConnection("");
	Statement stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs= stmt.executeQuery("select * from employees");
	List<String> columnvalue=new ArrayList<>();
	while(rs.next()) {
		columnvalue.add(rs.getString("salary"));
		
	}
}*/
/*public static void readDatabase() throws Throwable {
	Class.forName("");
	Connection connection=DriverManager.getConnection("");
	Statement stmt= connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=stmt.executeQuery("select * from employees");
	List<String> coloumnvalue= new ArrayList<>();
	while(rs.next()) {
		coloumnvalue.add(rs.getString("Salary"));
		
	}
}*/
}
