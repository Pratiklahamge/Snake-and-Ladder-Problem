package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int dieRoll = 1 + (int) Math.floor(Math.random() * 10) % 6;
		System.out.println("Die Rolled:" + dieRoll);
	}

}