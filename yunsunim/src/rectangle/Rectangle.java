package rectangle;


public class Rectangle {
	
	// 필드 : 
//  반지름(실수형)	
	private double line = 1.0;
	
//  매개변수 없이 변의 길이를 1.0으로 초기화하는 constructor 	
	public Rectangle() {
		super();
	}
	
//  변의 길이 매개변수로 받아 초기화하는 constructor 
	public Rectangle(double line) {
		super();
		this.line = line;
	}


//  변의길이 getter/setter
	public double getLine() {
		return line;
	}

	public void setLine(double line) {
		this.line = line;
	}

//  면적계산 메소드 - 매개변수 없음	
	public double surface() {
		return line*line;
	}

}
