package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
	// setGivenNameで、各子クラスはgivenNameフィールドに次の値をセットしましょう
	public void setGivenName() {
		givenName = "太郎";
	}
	
	// 親クラスの抽象メソッドであるeachIntroduceを次のように実装します
	public void eachIntroduce() {
		System.out.println("Javaが得意です\n");
	}

}
