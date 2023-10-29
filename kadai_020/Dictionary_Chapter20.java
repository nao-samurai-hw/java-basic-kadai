package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {

	// 辞書として機能するHashMapを宣言しましょう。
	HashMap<String, String> dictionary = new HashMap<String, String>();

	// コンストラクタ (辞書に、次の10通りの英単語と意味を追加します。)
	public Dictionary_Chapter20() {
		dictionary.put("apple","りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	
	
	public void checkDictionary(String word) {
		

		// 単語が登録されていない場合
		if (dictionary.get(word) == null) {
			System.out.println(word + "は辞書に存在しません");
		}
		// そうでない場合 (単語が登録されている場合)
		else {
			System.out.println(word + "の意味は" + dictionary.get(word));
		}

	}
	
	// 繰り返し処理を使い、調べる英単語が辞書に追加されているか判定する
	public void loopProcess(String[] words) {
		for (int i = 0; i < words.length; i++) {
			checkDictionary(words[i]);
		}
	}

}
