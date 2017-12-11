package com.appfactory.springlesson1.controller;

import com.appfactory.springlesson1.service.MathService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by Korepetycje on 08.12.2017.
 */
public class MathControllerTest {

    @Mock
    MathService mathService;

    @InjectMocks
    private MathController mathController;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void checkThatAddInvokeMethodAddFromServiceWithProperParameters() {
        //given
        Integer skladnik1 = Integer.valueOf(4);
        Integer skladnik2 = Integer.valueOf(10);

        //when
        mathController.add(skladnik1, skladnik2);

        //then
        verify(mathService).add(skladnik1, skladnik2);
    }

    @Test
    public void checkThatAddReturnResultOfAdding() {
        //given
        Integer skladnik1 = Integer.valueOf(4);
        Integer skladnik2 = Integer.valueOf(10);
        given(mathService.add(skladnik1, skladnik2)).willReturn(14);

        //when
        Integer result = mathController.add(skladnik1, skladnik2);

        //then
        Assertions.assertThat(result).isEqualTo(14);
    }

}