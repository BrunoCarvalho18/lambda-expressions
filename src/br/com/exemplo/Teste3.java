package br.com.exemplo;

public class Teste3 {

	private int operacao(int a, int b, FuncionalInterface1 fobjeto) {
		return fobjeto.operacao(a, b);
	}

	public static void main(String[] args) {
		FuncionalInterface1 mais = (int a, int b) -> a + b;
		FuncionalInterface1 mult = (int a, int b) -> a * b;
		FuncionalInterface1 subt = (int a, int b) -> a - b;
		
		Teste3 testeObjeto = new Teste3();
		
		System.out.println("A Adi��o �: " + testeObjeto.operacao(6, 4, mais));
		System.out.println("A Mult �: " + testeObjeto.operacao(6, 4, mult));
		System.out.println("A Subtracao �: " + testeObjeto.operacao(6, 4, subt));
		
		FuncionalInterface2 funcaoObjeto = mensagem->System.out.println("Ol� " + mensagem);
		funcaoObjeto.recebeMensagem("Bruno !");
	}

}
