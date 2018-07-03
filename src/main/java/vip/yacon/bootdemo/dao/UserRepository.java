package vip.yacon.bootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vip.yacon.bootdemo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);

    User findByUserNameOrEmail(String username, String email);
}
