package com.comanche.DesignMode.behavior.strategy;

import java.util.List;

// ConcreteStrategy
public class QuickSortStrategy implements SortingStrategy {

	@Override
	public void sort(List<Integer> list) {
		System.out.println("Sorting List using quick sort");
	}

}
