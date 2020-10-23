package polymorphism4;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int  price;
	
	
	public SamsungTV() {
		System.out.println("===> SamsungTV ����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice ȣ��");
		this.price = price;
	}




	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�." + price );
	}
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.volumeUp();
	}
	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.volumeDown();
	}
}
