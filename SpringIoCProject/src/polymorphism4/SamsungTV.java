package polymorphism4;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int  price;
	
	
	public SamsungTV() {
		System.out.println("===> SamsungTV 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출");
		this.price = price;
	}




	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다." + price );
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
		speaker.volumeUp();
	}
	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
		speaker.volumeDown();
	}
}
