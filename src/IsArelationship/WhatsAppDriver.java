package IsArelationship;

public class WhatsAppDriver {

	public static void main(String[] args) 
	{
       WhatsApp4 w = new WhatsApp4();
       WhatsApp3 w1 = new WhatsApp3();
       WhatsApp2 w2 = new WhatsApp2();
       w2.send();
       w2.audioCall();
      // w2.videoCall();//can't access child class member
       w1.audioCall();
       w1.send();
       w1.videoCall();
       //w1.payment();//cant access child class member
       w.payment();
       w.send();
       w.audioCall();
       w.videoCall();
       
       
       

	}

}
