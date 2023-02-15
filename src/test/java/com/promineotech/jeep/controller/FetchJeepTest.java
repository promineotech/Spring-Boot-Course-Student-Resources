package com.promineotech.jeep.controller;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.promineotech.jeep.controller.support.FetchJeepTestSuupport;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;


@SpringBootTest(webEnvironment= WebEnvironment.RANDOM_PORT) 
class FetchJeepTest extends FetchJeepTestSuupport {

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void testTThatJEepsAreReturendWhenAValidJeepModelAndTrimAreSupplied() {
    //Given: a valid model, trim and URI 
    JeepModel model = JeepModel.WRANGLER;
    String trim="Sport";
    String uri = String.format("%s?model?=%s&trim=%s", getBaseUri(),model,trim);
    
    //When: a connections is made to the URI
    ResponseEntity<Jeep> response = getRestTemplate().getForEntity(uri, Jeep.class);  
    
    //Then: a success (OK - 200) status code is returned
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
  }

}
