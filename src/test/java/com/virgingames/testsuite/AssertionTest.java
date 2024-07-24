package com.virgingames.testsuite;

import com.virgingames.jackpotinfo.JackSteps;
import com.virgingames.testbase.TestBase;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.*;


@RunWith(SerenityRunner.class)
public class AssertionTest extends TestBase {

    @Steps
    JackSteps jackSteps;

    @Test
    public void verifyJackpotIsBingoAndAllCurrencyAreGBP(){
        jackSteps.getJackpotInfo().body("data.jackpotId",equalTo("Bingo"));
        jackSteps.getJackpotInfo().body("data.pots.currency",everyItem(equalTo("GBP")));
    }

    @Test
    public void verifyPots1IdAndName(){
        jackSteps.getJackpotInfo().body("data.pots.id[0]",equalTo("194"));
        jackSteps.getJackpotInfo().body("data.pots.name[0]",equalTo("Adventure"));
    }

}
