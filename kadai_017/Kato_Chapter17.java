package kadai_017;


// 親クラスは、抽象メソッドを持つので抽象クラスとします。
abstract public class Kato_Chapter17 {

	// 親クラスは、姓と名と住所を表すフィールドを持ちます。
	public String familyName = "加藤";  // 共通
	public String givenName;
	public String address = "東京都中野区〇×"; // 共通
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	// 個別の紹介を出力する
	public abstract  void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}
	
}
