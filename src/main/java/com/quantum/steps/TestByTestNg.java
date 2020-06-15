package com.quantum.steps;

import com.quantum.common.H2DBConfig;
import com.quantum.entity.User;
import com.quantum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

@ContextConfiguration(classes = H2DBConfig.class)
public class TestByTestNg extends AbstractTestNGSpringContextTests {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void test() {

//        User u = new User();
//        u.setAddress("成都");
//        u.setAge(12);
//        u.setCity("成都");
//        u.setName("德莱文");
//
//        userRepository.save(u);

        List<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println(user.toString());
        }

    }

}
