//From below link you can download jdbc mysql driver

//https://www.dropbox.com/sh/qn1cr5c6hnwdknq/AADvFhItnEgJqFQpZ49lRuVca?dl=0

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class data{
	public String checklogin(String id, String password){
		
		String tmp = "";

		try{  

			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/inventorymanagement","root","" );  
  
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select password from login where ID='"+id+"'");
			
			rs.next();
			if (password.equals(rs.getString(1))){
				tmp = "Login";	
			}
			else {
				tmp="Error";
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return tmp;
	}

	public void checkregister(String userid, String username, String password){

		try{  

			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/inventorymanagement","root","" );  
  
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("insert into login(ID,Username,Password) values('"+userid+"','"+username+"','"+password+"')");  
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void addproduct(String id, String name, String unitprice,String quantity){
		//String tmp = "";

		try{  

			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/inventorymanagement","root","" );  
  
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("insert into data(ID,Name,UnitPrice, Quantity) values('"+id+"' , '"+name+"' , '"+unitprice+"' , '"+quantity+"')");  
			//
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void updateproduct(String id, String name, String unitprice,String quantity){
		//String tmp = "";

		try{  

			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/inventorymanagement","root","" );  
  
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("update data set Name='"+ name +"',UnitPrice='"+ unitprice +"',Quantity='"+ quantity +"' where ID='"+id+"'");  
			//
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void deleteproduct( String id ){
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/inventorymanagement","root","" ); 
  
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("delete from data where id='" + id + "'");
		}
		catch(Exception e){ System.out.println(e);}
	
	}
	
	public String details(){
		String tmp = "";
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/inventorymanagement","root","" ); 
  
			Statement stmt=con.createStatement();
			
			ResultSet pro=stmt.executeQuery("select * from data");
			
			while(pro.next()){
				tmp = tmp + pro.getString(1) + "  " + pro.getString(2) + "  " + pro.getString(3) + "  " + pro.getString(4) + "  . ";
			}
			return tmp;
		}
		catch(Exception e){ System.out.println(e);return "ERROR";}
	
	}
	
	
}  