package lab6_1;

//- Student 클래스
//속성 : 다음과 같은 3가지 private 필드
//  학번(정수형)
//  이름(문자열)
//  성적(실수형)
// 
//기능 : 다음과 같은 7가지 public 메소드
//  학번 getter/setter
//  이름 getter/setter
//  성적 getter/setter

//
//  ** 위의 7가지 메소드에는 출력문을 두지 말 것

public class Student {

	private int stdtIDnum;
	private String name;
	private double score;

	public Student() {
		super();
	}

	public Student(int stdtIDnum, String name, double score) {
		super();
		this.stdtIDnum = stdtIDnum;
		this.name = name;
		this.score = score;
	}

	public int getStdtIDnum() {
		return stdtIDnum;
	}

	public void setStdtIDnum(int stdtIDnum) {
		this.stdtIDnum = stdtIDnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	// 합격여부 조회 - 기준성적을 매개변수로 받아 성적이 그 이상이면 true,
	// 아니면 false 리턴
	public boolean pNp(double score) {
		if (score > 1.5)
			return true;
		else
			return false;
	}

}
