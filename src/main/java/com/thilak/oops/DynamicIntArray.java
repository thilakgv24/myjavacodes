package com.thilak.oops;

import java.util.Arrays;

public class DynamicIntArray {

	private int[] intArray;
	private int nextElementIndex;

	public DynamicIntArray() {
		intArray = new int[2];
		nextElementIndex = 0;
	}

	public DynamicIntArray(int size) {
		intArray = new int[size];
		nextElementIndex = size + 1;
	}

	@Override
	public String toString() {
		System.out.println(intArray.length);
		return "DynamicIntArray [intArray=" + Arrays.toString(intArray) + "]";
	}

	public int getSize() {
		return this.nextElementIndex;
	}

	public boolean isEmpty() {
		return this.nextElementIndex == 0;
	}

	public int getValue(int elmentIndex) {
		if (this.nextElementIndex <= elmentIndex)
			return -1;
		int value = intArray[elmentIndex];
		return value;
	}

	public void addElement(int element) {
		if (nextElementIndex >= intArray.length)
			increaseArraySize();
		this.intArray[nextElementIndex] = element;
		nextElementIndex++;
	}

	public int setElement(int index, int element) {
		if (!(nextElementIndex >= index))
			return -1;
		int oldValue = this.intArray[index];
		this.intArray[index] = element;
		return oldValue;
	}

	private void increaseArraySize() {
		int[] temp = intArray;
		intArray = new int[2 + intArray.length];
		for (int tempArrayIndex = 0; tempArrayIndex < temp.length; tempArrayIndex++) {
			intArray[tempArrayIndex] = temp[tempArrayIndex];
		}
	}

	public int removeLastElement() {
		intArray[nextElementIndex - 1] = 0;
		nextElementIndex--;
		return nextElementIndex;
	}

	public int removeElement(int index) {
		int removedValue = -1;
		if (!(index < nextElementIndex))
			return removedValue;
		removedValue = intArray[index];
		for (int in = index; in < nextElementIndex; in++) {
			intArray[in] = intArray[in + 1];
		}
		return removedValue;
	}

	public void addElement(int index, int element) {
		System.out.println(intArray.length);
		System.out.println(nextElementIndex);
		if (intArray.length == nextElementIndex)
			increaseArraySize();
		for (int i = intArray.length - 1; i >= index; i--) {
			if (i == index)
				intArray[i] = element;
			else
				intArray[i] = intArray[i - 1];
		}
	}
}
