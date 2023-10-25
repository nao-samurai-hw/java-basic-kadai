package kadai_014;

//Step3. 車クラスを実行するクラスを作成する
public class CarExec_Chapter14 {
	public static void main(String[] args) {

		// start
		
		// 車クラスのインスタンスを作成する
		Car_Chapter14 car = new Car_Chapter14();
		
		/* 
		 * 	car.run();
		 *  → 速度は時速10kmです
		 *  
		 */
		
		// 車クラスのgearChangeメソッドを実行する
		car.gearChange(3);
		
		// 車クラスのrunメソッドを実行する
		car.run();
		
		// end
		
		
	}

}
