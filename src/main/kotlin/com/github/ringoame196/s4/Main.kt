package com.github.ringoame196.s4

/*
	companion object は Kotlin のクラス内で定義できる特別なオブジェクト で、以下のような役割を持ちます。

	✅ クラスに関連する定数や関数を定義できる
	✅ Java の static のように使える（ただし、Kotlin では static は使わない）
	✅ クラスのインスタンスを作らなくてもアクセス可能

	✅ companion object は クラスに紐づく関数やプロパティを定義するための特別なオブジェクト
	✅ クラスのインスタンスを作らなくても 使える
	✅ 定数の管理やファクトリメソッドに便利
	✅ enum class との相性も良い

💡 Kotlin では static の代わりに companion object を使おう！ 🚀
 */

class Config {
	companion object {
		const val MAX_USERS = 100
		const val APP_NAME = "MyApp"
	}
}

class User(val name: String) {
	companion object {
		fun createGuest(): User {
			return User("Guest")
		}
	}
}

enum class CommandType(val command: String) {
	MAKE("make"),
	DELETE("delete"),
	CHECK("check"),
	SHUFFLE("shuffle");

	companion object {
		fun fromCommand(input: String): CommandType? {
			return values().find { it.command == input }
		}
	}
}

/*
	クラスに紐づく定数を管理できる
	const val は コンパイル時に決まる定数 なので、パフォーマンスが良い
 */

fun main() {
	// ① 定数の定義
	println("定数の定義")
	println(Config.MAX_USERS)  // 100
	println(Config.APP_NAME)   // "MyApp"

	// ② ファクトリメソッド（インスタンス生成）
	println("ファクトリメソッド")
	val guest = User.createGuest()
	println(guest.name)  // "Guest"

	// ③ enum class での利用
	println("enum class")
	val command = CommandType.fromCommand("make")
	println(command)  // MAKE
}

/*
	val との違い

	✅ val（通常の変数）
	インスタンスごとに値を持つ（クラスのインスタンスごとに val の値が異なる）
	インスタンス化しないと使えない
	コンパニオンオブジェクトや object の val はシングルトンのように使える
	✅ companion object（クラスに紐づくオブジェクト）
	クラスに属する「静的なメンバ」を持てる
	インスタンス化しなくてもアクセス可能
	Java の static に近い

 	✅ インスタンスごとに異なる値 → val
	✅ クラス全体で共通の値や関数 → companion object

	💡 「個々のデータ」なのか「全体に共通」なのかを意識すると選びやすい！ 🚀
 */