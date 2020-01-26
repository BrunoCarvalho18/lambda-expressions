package br.com.exemplo;

public interface FuncionalInterface {
	
	void funcaoAbstrata(int x);
	
	default void funcaoNormal() {
		System.out.println("Olá !");
	}

}
