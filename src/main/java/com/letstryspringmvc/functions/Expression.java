package com.letstryspringmvc.functions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Expression {
    @RequestMapping("/expression")
    public ModelAndView sendDatas(@RequestParam("first") double first, @RequestParam("arthematic") char arthematic, @RequestParam("last") double last) {
        double result=0;
        switch (arthematic){
            case '+':
                result=add(first,last);
                break;
            case '-':
                result=sub(first, last);
                break;
            case '*':
                result=mult(first, last);
                break;
            case '/':
                result=div(first, last);
                break;
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("result",result);
        return modelAndView;
    }

    private double add(double first, double last) {
        return first + last;
    }

    private double sub(double first, double last) {
        return first - last;
    }

    private double mult(double first, double last) {
        return first * last;
    }

    private double div(double first, double last) {
        return first/last;
    }
}
