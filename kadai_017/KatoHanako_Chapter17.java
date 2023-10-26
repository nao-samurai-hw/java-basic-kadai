package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	
	// setGivenNameで、各子クラスはgivenNameフィールドに次の値をセットしましょう
	public void setGivenName() {
		givenName = "花子";
	}
	
	// 親クラスの抽象メソッドであるeachIntroduceを次のように実装します
	public void eachIntroduce() {
		System.out.println("趣味は読書です\n");
	}

	
}
