package television;

//텔레비전을 나타내는 Television 클래스를 정의하고, Television 배열을 이용하는 프로그램을 작성하시오.
//
//두개의 파일, 두개의 클래스로 작성할 것
//
//- Television 클래스: 채널(정수형) 필드를 가짐

public class Television {
	
	private int channel;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(int channel) {
		super();
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	



}
