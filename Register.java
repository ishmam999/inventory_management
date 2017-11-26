public class Register {
	
	public boolean verifyregisterinfo(String userid, String username,String password){
		data DB=new data();
		DB.checkregister( userid , username, password ) ;
		
		return true;
		
	}
}