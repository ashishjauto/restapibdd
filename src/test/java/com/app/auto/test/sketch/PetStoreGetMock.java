package com.app.auto.test.sketch;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import io.restassured.RestAssured;

import java.net.URI;
import java.net.URISyntaxException;

public class PetStoreGetMock {

    private static  final int PORT =443;
    private static final String HOST="https://petstore.swagger.io";
    private static WireMockServer server = new WireMockServer(PORT);


    public static void main(String[] args) throws URISyntaxException {
        server.start();
        ResponseDefinitionBuilder mockResponse = new ResponseDefinitionBuilder();
        mockResponse.withStatus(200);


        WireMock.configureFor(443);
        WireMock.stubFor(WireMock.get("/v2/pet/2").willReturn(mockResponse));

        RestAssured.given()
                .when()
                .get(new URI("https://petstore.swagger.io/v2/pet/2"))
                .then()
                .assertThat()
                .statusCode(200);

        server.shutdownServer();

    }
}
