package com.virgingames.jackpotinfo;

import com.virgingames.constant.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class JackSteps {
    @Step
    public ValidatableResponse getJackpotInfo(){
        return SerenityRest.given()
                .queryParam("currency","GBP")
                .when()
                .get(EndPoints.GET_JACKPOT_BINGO).then();
    }
}
