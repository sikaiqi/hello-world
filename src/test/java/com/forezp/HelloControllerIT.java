package com.forezp;

import org.assertj.core.error.ShouldBeEqualToIgnoringFields;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by skq on 2019/1/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

    @LocalServerPort
    private int port;
    private URL base;
    @Autowired
    private TestRestTemplate template;
    @Before
    public void setUp() throws MalformedURLException {
        this.base = new URL("http://localhost:"+port+"/hello");
    }

    @Test
    public void getHello(){
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        Assert.assertEquals(response.getBody(),"Greetings from Spring Boot !");
    }

}
