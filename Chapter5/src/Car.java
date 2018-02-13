
public class Car {
	String company = "hyundai";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Car() {
	}
	Car(String model) {
		this.model = model;
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	Car(String model, String color, int maxSpeed, int speed) {
		this(model, color); //이런것도 가능하고 생성자 안에서 this로 다른 생성자 부른경우 맨 위에 선언해야된다.
		this.speed = speed;
		this.maxSpeed = maxSpeed;
	}
}
