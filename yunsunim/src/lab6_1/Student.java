package lab6_1;

//- Student Ŭ����
//�Ӽ� : ������ ���� 3���� private �ʵ�
//  �й�(������)
//  �̸�(���ڿ�)
//  ����(�Ǽ���)
// 
//��� : ������ ���� 7���� public �޼ҵ�
//  �й� getter/setter
//  �̸� getter/setter
//  ���� getter/setter

//
//  ** ���� 7���� �޼ҵ忡�� ��¹��� ���� �� ��

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

	// �հݿ��� ��ȸ - ���ؼ����� �Ű������� �޾� ������ �� �̻��̸� true,
	// �ƴϸ� false ����
	public boolean pNp(double score) {
		if (score > 1.5)
			return true;
		else
			return false;
	}

}
