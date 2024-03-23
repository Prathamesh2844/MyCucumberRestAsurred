package com.Get_DatatableStepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/MyDataTable/"},
		glue={"com.Get_DatatableStepDefination"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report22.json",
		}
		)
public class GETSDRunnerFileTest {

}
