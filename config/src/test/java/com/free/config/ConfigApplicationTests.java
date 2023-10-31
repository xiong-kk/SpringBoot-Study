package com.free.config;

import com.free.config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author free
 * @create 2023-10-31-21:31
 *
 * springboot单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigApplicationTests {
    @Autowired
    Person person;
    @Test
    public void contextLoads(){
        System.out.println(person);
    }
}
