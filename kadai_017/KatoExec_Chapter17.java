package kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		
		// 各子クラスのインスタンスを作成する
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		
		// setGivenNameメソッドを実行する
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		
		// execIntroduceメソッドを実行する
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	}
}
