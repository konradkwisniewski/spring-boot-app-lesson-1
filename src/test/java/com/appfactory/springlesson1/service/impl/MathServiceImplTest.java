package com.appfactory.springlesson1.service.impl;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by Korepetycje on 08.12.2017.
 */
public class MathServiceImplTest {

    @InjectMocks
    private MathServiceImpl mathService;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }


    @Test
    public void checkThatAddMethodReturnSumOfParams(){
        //given
        Integer skladnik1 = Integer.valueOf(5);
        Integer skladnik2 = Integer.valueOf(10);

        //when
        Integer result = mathService.add(skladnik1, skladnik2);

        //then
        Assertions.assertThat(result).isEqualTo(15);
    }

}