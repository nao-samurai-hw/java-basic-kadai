package kadai_014;

// Step2. 車クラスを作成する
public class Car_Chapter14 {
	
	// 車クラスは、次のフィールドを持ちます
	private int gear;
	private int speed;
	

	// コンストラクタ (ギア：1、速度：10km/h)
	public Car_Chapter14() {
		this.gear = 1;
		this.speed = 10 ;
	}
	
	// 車クラスのメソッド (gearChange)
	public void gearChange(int afterGear) {
		
		//ギアの値により速度を変える
		switch (afterGear) {
			 case 1 -> this.speed = 10;
			 case 2 -> this.speed = 20;
			 case 3 -> this.speed = 30;
			 case 4 -> this.speed = 40;
			 case 5 -> this.speed = 50;
			 default -> this.speed = 10;
			 }
		
		// ギアの切り替えメッセージを表示する
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		// ギアを切り替える
		this.gear = afterGear;
	}
	
	// 車クラスのメソッド (run)
	public void run() {
		
		// ギアチェンジ後の速度を表示する
		System.out.println("速度は時速"+ this.speed +"kmです");
	}
}
