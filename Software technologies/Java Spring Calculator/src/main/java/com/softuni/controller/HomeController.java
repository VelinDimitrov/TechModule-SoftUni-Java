package com.softuni.controller;

import com.softuni.entities.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("operator", "+");
		model.addAttribute("view","views/calculatorForm");
		return "base-layout";
	}
	@PostMapping("/")
    public String indexPost(@RequestParam(name="leftOperand") String num1,
                            @RequestParam(name="rightOperand") String num2,
                            @RequestParam(name="operator") String operator,
                            Model model) {
	    double leftOperand;
        double rightOperand;
        try {
            leftOperand = Double.parseDouble(num1);
            rightOperand = Double.parseDouble(num2);
        } catch (NumberFormatException e) {

            model.addAttribute("leftOperand","NaN");
            model.addAttribute("rightOperand","Nan");
            model.addAttribute("operator",operator);

            model.addAttribute("view","views/calculatorForm");
            return "base-layout";
        }
        Calculator calculator=new Calculator(leftOperand,rightOperand,operator);
        double result=calculator.calculateResult();

        model.addAttribute("leftOperand",calculator.getLeftOperand());
        model.addAttribute("rightOperand",calculator.getRightOperand());
        model.addAttribute("operator",calculator.getOperator());
        model.addAttribute("result",result);

        model.addAttribute("view","views/calculatorForm");



	    return "base-layout";
    }

}
