package com.velocity;

import java.util.ArrayList;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		for (Integer i : list) {
			System.out.println(i);
		}

	}

}
