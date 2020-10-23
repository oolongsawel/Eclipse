package polymorphism4;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		// TODO Auto-gespeaker.volumeUp();nerated constructor stub
	System.out.println("=====> AppleSpeaker 积己");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker---家府 棵赴促.");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker---家府 郴赴促.");
	}
	
}
