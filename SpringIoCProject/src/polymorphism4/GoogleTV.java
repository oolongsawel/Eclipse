package polymorphism4;

public class GoogleTV implements TV {
	
	private Speaker speaker;
	private int  price;
	private int  bntcnt;
	
	
	public GoogleTV() {
		System.out.println("===> GoogleTV(1) 생성");
	}
	
	public GoogleTV(Speaker speaker) {
		System.out.println("===> GoogleTV(2) 생성");
		this.speaker = speaker;
	}

	
	public GoogleTV(Speaker speaker, int price,  int bntcnt) {
		System.out.println("===> GoogleTV(3) 생성");
		this.speaker = speaker;
		this.price = price;
		this.bntcnt = bntcnt;
		System.out.println("========> price: " + this.price);
		System.out.println("========> bntcnt: " + this.bntcnt);
	}

	public void powerOn() {
		System.out.println("GoogleTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("GoogleTV---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("GoogleTV---소리 올린다.");
	}
	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("GoogleTV---소리 내린다.");
	}
}
