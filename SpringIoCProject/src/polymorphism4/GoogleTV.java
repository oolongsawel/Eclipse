package polymorphism4;

public class GoogleTV implements TV {
	
	private Speaker speaker;
	private int  price;
	private int  bntcnt;
	
	
	public GoogleTV() {
		System.out.println("===> GoogleTV(1) ����");
	}
	
	public GoogleTV(Speaker speaker) {
		System.out.println("===> GoogleTV(2) ����");
		this.speaker = speaker;
	}

	
	public GoogleTV(Speaker speaker, int price,  int bntcnt) {
		System.out.println("===> GoogleTV(3) ����");
		this.speaker = speaker;
		this.price = price;
		this.bntcnt = bntcnt;
		System.out.println("========> price: " + this.price);
		System.out.println("========> bntcnt: " + this.bntcnt);
	}

	public void powerOn() {
		System.out.println("GoogleTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("GoogleTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("GoogleTV---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("GoogleTV---�Ҹ� ������.");
	}
}
