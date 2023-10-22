package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {

		// Step2. boolean型の配列(isPrime)を作成し、初期化する

		/*
		 *  配列は0番目の要素から始まるので、
		 * 便宜的に101個の要素を作成します
		 */
		boolean[] isPrime = new boolean[101];

		/* 
		 * 作成したboolean型の配列の要素を、
		 * for文を使って繰り返しtrueで初期化する処理をしましょう
		 * (デフォルトはfalse)
		 */
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}

		// Step3. 100までの整数が素数であるか判定する

		// 割られる数(dividend) (ループ：dividendが2以上、isPrime.length=101未満 )
		for (int dividend = 2; dividend < isPrime.length; dividend++) {

			/*
			 * 割る数 (divisor) (ループ：divisorが2以上、dividend未満、
			 * 割る数を1ずつ加算 (割る数 = 割る数 + 1)
			 */
			for (int divisor = 2; divisor < dividend; divisor++ ) {

				/*
				 * 割る数(divisor)で割り切れる場合、
				 *  割られる数(dividend)は素数でないと判定(falseを代入)し、ループを終了
				 */
				if (dividend % divisor == 0) {
					isPrime[dividend] = false;
					break;
				}
			}

		}
		
		// Step4. 素数を出力する
		for (int i = 2; i < isPrime.length; i++) {
			
			// isPrime[i] = true(素数)の場合、要素番号を素数として出力
			if (isPrime[i]) {
			System.out.println(i);
			}
		}

	}

}
