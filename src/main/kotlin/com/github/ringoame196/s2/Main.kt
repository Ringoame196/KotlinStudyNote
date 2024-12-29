package com.github.ringoame196.s2

/*
	lateinit は、Kotlin で 遅延初期化 を行うためのキーワードです。主に、var に対して使われ、変数を 非 null であることが確定しているが、コンストラクタや初期化時にすぐには値を設定しない場合に使用されます。

	lateinit の特徴：
	nullを許さない型 に使用できる。(のちのち値を設定することが確定している)
	変数の初期化は遅延させることができ、lateinit を使用した変数はコンストラクタで初期化しなくても構いませんが、アクセスする前に必ず初期化しなければなりません。
	初期化されていない状態でアクセスしようとすると UninitializedPropertyAccessException がスローされます。
 */

class MyClass {
	// lateinitを使って遅延初期化
	lateinit var name: String

	fun initName() {
		// 必要なタイミングで初期化
		name = "John Doe"
	}

	fun printName() {
		// 初期化後に使用する
		println(name)
	}
}

fun main() {
	val m = MyClass()
	m.initName()
	m.printName()
}