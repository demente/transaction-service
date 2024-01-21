package de.transaction.controller;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransactionControllerTest {

    @LocalServerPort
    private int port;


    public void shouldBookATransaction() {
        RestAssured.baseURI = "http://localhost:" + port;

        given()
                .when()
                .post("/transactions/book", "{\n" +
                        "\t\"currency\": \"EUR\",\n" +
                        "\"sourceIban\": \"DE1234567890\",\n" +
                        "\t\"destinationIban\": \"DE2233444556\",\n" +
                        "\t\"amount\": 500\n" +
                        "}")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("sourceAccount.iban", equalTo("DE1234567890doc"));
    }

}
