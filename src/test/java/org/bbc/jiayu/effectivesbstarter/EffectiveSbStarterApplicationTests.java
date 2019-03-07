package org.bbc.jiayu.effectivesbstarter;

import org.bbc.jiayu.effectivesbstarter.entity.Human;
import org.bbc.jiayu.effectivesbstarter.jackson.JyJson;
import org.bbc.jiayu.effectivesbstarter.service.ExampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EffectiveSbStarterApplicationTests {

    @Autowired
    JyJson jyJson;
    @Autowired
    ExampleService exampleService;
    @Test
    public void contextLoads() {
        System.out.println(exampleService.wrap("lichao"));
    }

    @Test
    public  void testJson(){
        Human human = Human.builder().feedMeWith("yummy").build();
        System.out.println(jyJson.obj2string(human));
    }

}
