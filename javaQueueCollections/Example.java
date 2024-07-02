package com.javaQueueCollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example {

	public static void main(String[] args) {

		Queue<Integer> list = new PriorityQueue<Integer>();// 11

		list.offer(10);
		list.offer(35);
		list.offer(34);
		list.offer(21);
		list.offer(56);
		list.offer(39);
		list.offer(60);

		System.out.println(list);

	}

}
