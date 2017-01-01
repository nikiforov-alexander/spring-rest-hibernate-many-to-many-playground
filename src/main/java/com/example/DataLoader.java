package com.example;

import com.example.dao.RoleDao;
import com.example.dao.UserDao;
import com.example.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{

    private final RoleDao roleDao;
    private final UserDao userDao;

    @Autowired
    public DataLoader(RoleDao roleDao, UserDao userDao) {
        this.roleDao = roleDao;
        this.userDao = userDao;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Role role1 = new Role("ROLE_USER");
        Role role2 = new Role("ROLE_ADMIN");
        roleDao.save(role1);
        roleDao.save(role2);
    }
}
