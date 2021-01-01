package rectangle;


public class Rectangle {
	
	// �ʵ� : 
//  ������(�Ǽ���)	
	private double line = 1.0;
	
//  �Ű����� ���� ���� ���̸� 1.0���� �ʱ�ȭ�ϴ� constructor 	
	public Rectangle() {
		super();
	}
	
//  ���� ���� �Ű������� �޾� �ʱ�ȭ�ϴ� constructor 
	public Rectangle(double line) {
		super();
		this.line = line;
	}


//  ���Ǳ��� getter/setter
	public double getLine() {
		return line;
	}

	public void setLine(double line) {
		this.line = line;
	}

//  ������� �޼ҵ� - �Ű����� ����	
	public double surface() {
		return line*line;
	}

}
