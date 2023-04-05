package oop;

import java.util.Arrays;

//배열요소값을 오름차순 정렬되도록 저장하고 출력하는 프로그램 작성
public class ArraySortApp {
	public static void main(String[] args) {
		/*
		 //절차지향 => 제어문을 많이 써서 작성해야함.(게임은 절차지향으로 개발)
		int[] array= {30,50,10,40,20};
		
		System.out.println("정렬 전 >> ");
		for(int num : array) {
			System.out.print(num+"");
		}
		System.out.println();
		
		
		//배열 요소값을 선택 정렬 알고리즘을 이용해 오름차순 정렬하여 저장
		//이 방법은 절차지향 프로그래밍 방법(!=객체지향)(자바는 객체지향)
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.hashCode();i++) {
				if(array[i]>arry[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		 
		System.out.println("정렬 후 >>");
		
		*/
		
		
		//알고리즘 이용X. 메소드를 호출해 프로그래밍 (메소드는 클래스가 가지고있음)
		
		int[] array = {30,50,10,40,20};
		
		//Arrays 클래스 : 배열의 요소를 제어하는 기능의 메소드를 제공하는 클래스
		//Arrays.toString(Object[] array) : 배열을 전달받아 배열의 모든 요소들을 문자열로 변환하여 반환하는 메소드
		
		System.out.println("정렬 전 >> "+Arrays.toString(array));
		
		//Arrays.sort(Object[] array) : 배열을 전달받아 배열의 모든 요소값들을 오름차순 정렬하는 메소드
		Arrays.sort(array);
		
		System.out.println("정렬 후 >>"+Arrays.toString(array));
		
		
		
		
		
		
		//OOP(Object Oriented Programing) : 객체 지향 프로그래밍
		
		
		
		
		
		
		
		
	}
	

}
