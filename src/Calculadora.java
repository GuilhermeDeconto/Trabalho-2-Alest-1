
/*
 * Autores : Guilherme Deconto e Gustavo Possebon
 */

public class Calculadora {

	private double operando1, operando2;
	private char operador;

	public void setOperando(char valor) {
		switch (valor) {
			case '+':
				operador = '+';
				break;
			case '-':
				operador = '-';
				break;
			case '*':
				operador = '*';
				break;
			case '/':
				operador = '/';
				break;
			case '^':
				operador = '^';
				break;
		}
	}
	
	public double calcula() throws Exception {
		switch (operador) {
			case '+':
				return soma();
			case '-':
				return subtracao();
			case '*':
				return produto();
			case '/':
				return divisao();
			case '^':
				return potencia();
			default:
				throw new Exception("Operando invalido");
		}
	}
	
	public void setOperador1(double valor1) {
		this.operando1 = valor1;
	}

	public void setOperador2(double valor2) {
		this.operando2 = valor2;
	}

	public double soma() {
		return (operando1 + operando2);
	}

	public double subtracao() {
		return (operando1 - operando2);
	}

	public double produto() {
		return (operando1 * operando2);
	}

	public double divisao() {
		return (operando1 / operando2);
	}

	public double potencia() {
		return Math.pow(operando1, operando2);
	}
}
