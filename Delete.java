public class Delete {
	
	public boolean deleteinfo(String id){
		
		data DB=new data();
		DB.deleteproduct(id) ;
		
		
		return true;
		
	}
}