package polymorphism4;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		// TODO Auto-gespeaker.volumeUp();nerated constructor stub
	System.out.println("=====> AppleSpeaker ����");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker---�Ҹ� ������.");
	}
	
}
