package br.com.exemplo;

import java.util.ArrayList;

public class Teste2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		
		array.forEach(n->System.out.println(n));
		
		array.forEach(n->{ if(n%2==0) System.out.println(n);});
		
	}

}
