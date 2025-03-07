package com.github.ringoame196.s3

/*
	Kotlin の enum（列挙型）は 「特定の値の集合を定義するためのクラス」 です。
	例えば、曜日・方角・状態など、限られた選択肢しか取らない値を管理するのに適しています。

	enum を使うべきケース
	✔ 限られた選択肢を持つデータを扱うとき（例: 曜日、状態、色）
	✔ if や switch で分岐処理を簡潔にしたいとき
	✔ 定数をグループ化したいとき

💡 enum は 定数値を管理するのに最適な仕組み なので、適切な場面で活用すると 可読性と安全性が向上 します！ 🚀

 	📌 object const と enum class の違い
	項目			object const						enum class
	値の種類		文字列や数値などの 定数					複数の固定値の選択肢（列挙型）
	型安全性		型安全ではない（文字列の間違いが起こる）	型安全（コンパイル時にチェックされる）
	拡張性		シンプルだが、値が増えると管理が面倒		各要素に プロパティやメソッドを持たせられる
	適した用途	設定値や定数の管理						状態・種類 を定義する場合
	比較の方法	"make" == "make"（文字列比較）			CommandType.MAKE == CommandType.MAKE（型比較）
 */

enum class Color {
	RED, GREEN, BLUE
}

fun main() {
	val myColor = Color.RED

	when (myColor) {
		Color.RED -> println("赤です")
		Color.GREEN -> println("緑です")
		Color.BLUE -> println("青です")
	}
}