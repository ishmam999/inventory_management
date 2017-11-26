public class Add {
	
	public boolean addinfo(String id, String name,String unitprice, String quantity){
		
		data DB=new data();
		DB.addproduct( id , name, unitprice, quantity) ;
		
		
		return true;
		
	}
}