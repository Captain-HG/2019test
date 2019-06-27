package comlzc.testservice01.service;

import comlzc.testservice01.model.User;

public interface UserService {
    User selectUserById(Integer uId);
}
