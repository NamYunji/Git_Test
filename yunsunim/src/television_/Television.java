package television_;

//�ڷ������� ��Ÿ���� Television Ŭ������ �����ϰ�, Television �迭�� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�ΰ��� ����, �ΰ��� Ŭ������ �ۼ��� ��
//- Television Ŭ����: ä��(������) �ʵ带 ����

public class Television {
	private int channel;

	public Television() {
		super();
		channel = 666;
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