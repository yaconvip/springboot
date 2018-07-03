package vip.yacon.bootdemo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vip.yacon.bootdemo.BootdemoApplication;
import vip.yacon.bootdemo.dao.UserRepository;
import vip.yacon.bootdemo.entity.User;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BootdemoApplication.class)
@EnableAutoConfiguration
public class TestUserRepository {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formatedDate = dateFormat.format(date);
        User user = new User();
        user.setUserName("1");
        user.setPassword("2");
        user.setEmail("33");
        user.setRegTime(formatedDate);
        user.setNickName("5");
        userRepository.save(user);

        //Assert.assertEquals(9, userRepository.findAll().size());
        //Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
        //userRepository.delete(userRepository.findByUserName("12"));
    }
}
