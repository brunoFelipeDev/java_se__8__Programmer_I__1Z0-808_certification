package br.com.desenvolvimento.certificacao;

public interface ExemploInterface {

	final int TAMANHO = 0;
	final boolean VERDADEIRO = true;
	final String TEXTO_RANDOMICO = "texto";

	String usuario();
	void autentica(String nome, String senha);

	/*
	 * Mesmo não declarando, ambos são public, a variável sempre é static e o método
	 * pe abstract
	 * 
	 */

}
