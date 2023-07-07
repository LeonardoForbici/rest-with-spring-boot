package br.com.estudo.math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}

	public Double sub(Double numberOne, Double numberTwo) throws Exception {
		return numberOne - numberTwo;
	}

	public Double mul(Double numberOne, Double numberTwo) throws Exception {
		return numberOne * numberTwo;
	}

	public Double div(Double numberOne, Double numberTwo) throws Exception {
		return numberOne / numberTwo;
	}

	public Double mean(Double numberOne, Double numberTwo) {
		return (numberOne) + numberTwo / 2;
	}

	public Double squareRoot(Double numberOne, Double numberTwo) throws Exception {
		return Math.sqrt(numberOne);
	}

}
