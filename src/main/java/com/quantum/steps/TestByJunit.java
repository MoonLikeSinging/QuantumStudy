package com.quantum.steps;

import com.quantum.common.H2DBConfig;
import com.quantum.entity.User;
import com.quantum.repository.UserRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = H2DBConfig.class)
public class TestByJunit {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @org.junit.Test
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
