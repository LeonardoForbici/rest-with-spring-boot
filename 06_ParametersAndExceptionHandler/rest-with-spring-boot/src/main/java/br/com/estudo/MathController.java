package br.com.estudo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.exceptions.UnsupportedMathOperationException;
import br.com.estudo.math.SimpleMath;
import br.com.estudo.util.Utils;

@RestController
public class MathController {

	SimpleMath math = new SimpleMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		return math.sum(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return math.sub(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mul(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return math.mul(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return math.div(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return math.mean(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/squareRoot/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!Utils.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value!");
		}
		return math.squareRoot(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}

}
