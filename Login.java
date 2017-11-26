public class Login {
	public static int loginstatus = 0;
	public static String uType;
	
	public boolean verifylogininfo(String userid, String password){
		data DB=new data();
		uType = DB.checklogin( userid , password) ;
		if(uType.equals("Login") ){
			//this.setloginstatus(true);
			loginstatus=1;
			return true ;
		}
		else{
			//this.setloginstatus(false);
			loginstatus=0;
			return false;
		}
	

	}
}
