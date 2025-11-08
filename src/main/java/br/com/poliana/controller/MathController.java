package br.com.poliana.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poliana.converters.NumberConverter;
import br.com.poliana.math.SimpleMath;


@RestController
@RequestMapping("/math") // Define o path base para o controlador
public class MathController {
	
	private SimpleMath math = new SimpleMath();
    
    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.sum(NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));
    }    
    
    
    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.subtraction(NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));
    }   
    
    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.multiplication( NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));
    }   
    
    @GetMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.division( NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo));
    } 
    
    @GetMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new Exception();
        }
        return math.mean(NumberConverter.covertToDouble(numberOne) , NumberConverter.covertToDouble(numberTwo)) / 2;
        
    } 
    
    
   

}

