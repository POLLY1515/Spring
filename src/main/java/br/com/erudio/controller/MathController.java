package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")// Todas as operacoes comecaram com math
public class MathController {

	@RequestMapping("/sum/{numberOne}/ {numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne,
			@PathVariable("numberOne") String numberTwo) 
		throws Exception {
		if(!isNumeric(numberOne) || isNumeric(numberTwo)) throw new IllegalArgumentException();
		return convertToDouble( numberOne) + convertToDouble(numberTwo);
	}

	private Double convertToDouble(String numberTwo) {
		// TODO Auto-generated method stub
		return 1D;
	}

	private boolean isNumeric(String numberOne) {
		return true;
	}
}
