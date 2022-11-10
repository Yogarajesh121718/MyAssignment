package week1.day1;

public class Mobile {
	
	
  public void makeCall() {
	
	  System.out.println("Dialing a Call");

}
  
  public void sendMsg() {
	
	  System.out.println("Sending a message");
}
  
  

	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		
		myMobile.makeCall();
		myMobile.sendMsg();
		

	}

}
