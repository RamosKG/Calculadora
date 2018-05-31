package br.com.db1.start.classe;

public class Calculadora {

	private Double valor1 = 0d;
	private Double valor2 = 0d;
	
	public Calculadora(double valor222, double valor2333) {
		zerar();
		valor1 = valor222;
		valor2 = valor2333; 
	}

	public Calculadora() {
		zerar(); 
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public double soma() {
		return valor1 + valor2;
	}

	public double divisao() {
		return valor1 / valor2;
	}

	public double multiplicacao() {
		return valor1 * valor2;
	}

	public double subtracao() {
		return valor1 - valor2;
	}

	public void zerar() {
		valor1 = 0d;
		valor2 = 0d;
	}

}
