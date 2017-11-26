public class Update {
	
	public boolean updateinfo(String id, String name,String unitprice, String quantity){
		
		data DB=new data();
		DB.updateproduct( id , name, unitprice, quantity) ;
		
		
		return true;
		
	}
}