package pizza_;

//- Pizza 클래스: 다음 세 개의 필드를 지님
//브랜드(문자열)
//지름(실수형)
//가격(정수형)

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

	// toString : 객체에 대한 정보를 찍어내는 기능
	@Override // Override : toString을 재정의해서 쓴다
	public String toString() {
		return "Pizza [brand=" + brand + ", diameter=" + diameter + ", price=" + price + "]";
	}

//	//object의 toString을 가져오겠습니다
//	@Override
//	public String toString() {
//		return super.toString();
//	}
//	

}
