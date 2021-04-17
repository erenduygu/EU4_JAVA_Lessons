package day44_oop_practice.callCenter;

public class CallCenter {
	
	public static void main(String [] args) {
		
		WhatsApp wa= new WhatsApp();
		wa.launch();
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="WhatsApss";
		wa.call("Ozzy");
		wa.sendMessage("Thank you");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();// static method
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		System.out.println("------------------------");
		
		VoiceCallable obj = new WhatsApp();
		
		((MessagingApp)obj).launch();
		((MessagingApp)obj).allOSCompatible=false;
		
		obj.call("Mr Tom");
		
		((VideoCallable)obj).videoCall();
		((WhatsApp)obj).videoCall();
		
		
		
		
	}

}
