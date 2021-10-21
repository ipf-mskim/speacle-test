package com.iportfolio.speacle.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@DisplayName("Account 모듈의 E2E 테스트 : ")
public class SpeacleAccountE2ETest {

    private final RestTemplate restTemplate = new RestTemplate();

    @DisplayName("POST /account/test 는")
    @Nested
    class Describes_Post_Test_Api {

        @DisplayName("name을 request body로 제공하면")
        @Nested
        class Context_Name_As_Request_Body {

            private final String name = "test";

            @DisplayName("test 테이블에 데이터가 입력된다.")
            @Test
            void it_Insert_Test_Data() {

                final Map<String, Object> requestBody = new HashMap<>();

                requestBody.put("name", name);

                final String response = restTemplate.postForObject("http://localhost:8080/account/test", requestBody, String.class);

                assertThat(response, is("{\"name\":\"test\"}"));

            }
        }
    }

    @DisplayName("GET /account/test/{id} 는")
    @Nested
    class Describes_Get_Test_Api {

        @DisplayName("id를 uri parameter로 제공하면")
        @Nested
        class Context_Name_As_Uri_Path {

            private final Long id = 1L;

            @DisplayName("제공한 id에 해당하는 Test 데이터를 반환한다.")
            @Test
            void it_Returns_Test_Data() {

                final String response = restTemplate.getForObject("http://localhost:8080/account/test/" + id, String.class);

                System.out.println(response);

                assertThat(response, is("{\"name\":\"test\"}"));

            }
        }
    }
}
