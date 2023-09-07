package co.com.company.certification.soap.stepdefinitions.settings;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.company.certification.soap.utils.constants.Constants.ACTOR_NAME;

public class SettingsStepDefinitions {
    @Before
    public void setUpStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME);
    }
}
