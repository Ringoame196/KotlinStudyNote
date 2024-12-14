package com.github.ringoame196.s1

fun main() {
	val test = Test()
	test.print()
}

class Test {
	private val test1 = "test1"
	/*
		メリット
			シンプル: 初期値が決まっている場合、コードが簡潔になります。
			読みやすい: 初期値がプロパティ宣言と同時に見えるため、読み手が初期値をすぐ理解できます。
			スレッドセーフ: valの場合、初期化は一度しか実行されないため、マルチスレッド環境でも安全です。
		デメリット
			初期化処理にロジックが必要な場合には対応できない（例: コンストラクタ引数を使う場合）。
			初期値が固定ではない場合や外部依存がある場合には不向き。
		用途
			初期値が固定で、計算や条件分岐を必要としない場合に適しています。
	 */

	private val test2:String
	init {
		test2 = "test2"
	}
	/*
		メリット
			柔軟性: 初期化時にロジック（条件分岐や計算）を挟むことができる。
			複数プロパティの相互依存: 初期化の順番が重要な場合や、他のプロパティを使って初期化したい場合に便利。
			コンストラクタ引数との連携: コンストラクタの引数を使った初期化が可能。
		デメリット
			冗長: 単純な初期化にはやや冗長に見える。
			読みやすさの低下: プロパティ宣言時には初期値が見えないため、初期値を探す手間がかかる。
		用途
			初期化にロジックが必要な場合、または初期化の順番が重要な場合に適しています。
	 */

	fun print() {
		println(test1)
		println(test2)
	}
}