package com.hpe.hpdev.cucumber.stepdefs;

import com.hpe.hpdev.ApiTestDemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ApiTestDemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
