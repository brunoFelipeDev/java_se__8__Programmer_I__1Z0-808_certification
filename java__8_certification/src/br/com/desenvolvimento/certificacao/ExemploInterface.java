package br.com.desenvolvimento.certificacao;

public interface ExemploInterface {

	final int TAMANHO = 0;
	final boolean VERDADEIRO = true;
	final String TEXTO_RANDOMICO = "texto";

	String usuario();
	void autentica(String nome, String senha);

	/*
	 * Mesmo n�o declarando, ambos s�o public, a vari�vel sempre � static e o m�todo
	 * pe abstract
	 * 
	 */

}
