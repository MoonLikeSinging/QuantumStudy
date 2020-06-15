package com.quantum.common;

import com.qmetry.qaf.automation.step.ObjectFactory;
import com.quantum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = H2DBConfig.class)
public class H2DBFactory implements ObjectFactory {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public <T> T getObject(Class<T> cls) throws Exception {
        return null;
    }
}
