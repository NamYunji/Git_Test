package pizza_;

//- Pizza Ŭ����: ���� �� ���� �ʵ带 ����
//�귣��(���ڿ�)
//����(�Ǽ���)
//����(������)

public class Pizza {

	private String brand;
	private double diameter;
	private int price;

	public Pizza() {
		super();
	}

	public Pizza(String brand, double diameter, int price) {
		super();
		this.brand = brand;
		this.diameter = diameter;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	public void printPizza() {
//		System.out.println("brand = " + brand + "\ndiameter = " + diameter + "\nprice = " + price);
//	}

	// toString : ��ü�� ���� ������ ���� ���
	@Override // Override : toString�� �������ؼ� ����
	public String toString() {
		return "Pizza [brand=" + brand + ", diameter=" + diameter + ", price=" + price + "]";
	}

//	//object�� toString�� �������ڽ��ϴ�
//	@Override
//	public String toString() {
//		return super.toString();
//	}
//	

}