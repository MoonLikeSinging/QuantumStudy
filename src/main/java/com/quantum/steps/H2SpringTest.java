package com.quantum.steps;

import com.quantum.common.H2DBConfig;
import com.quantum.entity.User;
import com.quantum.repository.UserRepository;
import cucumber.api.java.en.When;
import org.apache.velocity.test.BaseTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration(classes = H2DBConfig.class)
public class H2SpringTest {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @When("^I control with H(\\d+) DB by Spring$")
    public void iControlWithHDBBySpring(int arg0) {

//        User u = new User();
//        u.setAddress("成都");
//        u.setAge(12);
//        u.setCity("成都");
//        u.setName("德莱文");
//
//        userRepository.save(u);
//
//        List<User> users = userRepository.findAll();
//        for (User user : users) {
//            System.out.println(user.toString());
//        }
        User user = userRepository.getOne(1);
        System.out.println(user.toString());
    }
}
