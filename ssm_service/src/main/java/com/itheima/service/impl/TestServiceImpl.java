package com.itheima.service.impl;

import com.itheima.Account;
import com.itheima.dao.TestDao;
import com.itheima.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao dao;

    @Override
    public List<Account> testFindAll() {
        List<Account> accounts = dao.testFindAll();
        return accounts;
    }
}
