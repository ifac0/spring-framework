package com.stdy.springwebmvc.controller;

import com.stdy.springwebmvc.model.Jedi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class JediController {

    @GetMapping("/jedi")
    public ModelAndView jedi(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

        final Jedi luke = new Jedi("Luke", "Skywlker");
        modelAndView.addObject("allJedi", Arrays.asList(luke));

        return modelAndView;
    }
}