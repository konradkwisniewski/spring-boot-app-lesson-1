package com.appfactory.springlesson1.controller;

import com.appfactory.springlesson1.params.MathParameter;
import com.appfactory.springlesson1.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/math")
public class MathController {

    private MathService mathService;

    @Autowired
    public MathController(@Qualifier("mathServiceImpl") MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping(value = "/add/{skladnik1}/{skladnik2}", method = RequestMethod.GET)
    Integer add(@PathVariable("skladnik1") Integer skladnik1, @PathVariable("skladnik2") Integer skladnik2){
        return mathService.add(skladnik1, skladnik2);
    }

}
