package comlzc.testservice01.service.impl;

import comlzc.testservice01.model.User;
import comlzc.testservice01.repository.UserRepository;
import comlzc.testservice01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR HG-captain
 * @Data 2019/6/10
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User selectUserById(Integer uId) {
        return userRepository.selectUserById(uId);
    }
}
