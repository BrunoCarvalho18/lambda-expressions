package br.com.exemplo;

public class Teste {
	
	public static void main(String[] args) {
		
		FuncionalInterface funcaoObjeto = (int x)-> System.out.println(2*x);
		
		funcaoObjeto.funcaoAbstrata(6);
	}

}
