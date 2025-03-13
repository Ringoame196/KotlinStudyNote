package com.github.ringoame196.s5

/*
	型		特徴						重複可否			順序の保証
	List	順序を保持するコレクション	重複を許可		順序を保持
	Set		重複を許さないコレクション	重複を許可しない	順序を保持しない (一部例外あり)
	Map		キーと値のペアのデータ構造	キーは重複不可		順序を保持しない (一部例外あり)

	👉 どれを使うかは用途次第！

	順序が必要なら List
	重複を防ぐなら Set
	キーと値のペアでデータを管理するなら Map
 */


fun main() {
	println("list")
	val list = mutableListOf<Int>(1,2,3,4,5,5)
	println(list)

	println("set")
	val set = mutableSetOf<Int>(1,2,3,4,5,5)
	println(set)

	println("map")
	val map = mutableMapOf<String, Int>("apple" to 1,"apple2" to 2, "apple3" to 3)
	println(map)
}