package polymorphism4;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		// TODO Auto-gespeaker.volumeUp();nerated constructor stub
	System.out.println("=====> SonySpeaker ����");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker---�Ҹ� ������.");
	}
	
}
