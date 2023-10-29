package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {

		String input= "";
		Scanner myChoice = new Scanner(System.in);

		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");


		// "r", "s", "p"のいずれかを入力するまでループ
		while (!input.equals("r") && !input.equals("s") && !input.equals("p") ) {
			input = myChoice.nextLine();

			if (!input.equals("r") && !input.equals("s") && !input.equals("p") ) {
				System.out.println("[Error]再度入力してください");
			}

		} 
		myChoice.close();



		return input;
	}

	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		// 配列にじゃんけんの手をセットする
		String[] randChoice = {"r", "s", "p"};
		// 乱数で対戦相手のじゃんけんの手を選ぶ
		int random = (int)Math.floor(Math.random()*3);
		// 対戦相手のじゃんけんの手を返す
		return randChoice[random];
	}

	public void playGame() {
		HashMap<String, String> Dictionary = new HashMap<String, String>();
		Dictionary.put("r", "グー");
		Dictionary.put("s", "チョキ");
		Dictionary.put("p", "パー");
		String myHand = getMyChoice();
		String opponentHand = getRandom();
		System.out.println("自分の手は"+ Dictionary.get(myHand) +"、対戦相手の手は"+ Dictionary.get(opponentHand));

		// 比較 (勝った場合)
		if ( (myHand.equals("r") && opponentHand.equals("s")) 
				|| (myHand.equals("s") && opponentHand.equals("p"))
				|| (myHand.equals("p") && opponentHand.equals("r")) ) {
			System.out.println("自分の勝ちです");
		}

		// 比較 (負けた場合)
		if ( (myHand.equals("r") && opponentHand.equals("p")) 
				|| ( myHand.equals("s") && opponentHand.equals("r"))
				|| ( myHand.equals("p") && opponentHand.equals("s")) ) {
			System.out.println("自分の負けです");
		}

		// 比較 (あいこの場合)
		if (myHand.equals(opponentHand)) {
			System.out.println("あいこです");
		}
	}

}
