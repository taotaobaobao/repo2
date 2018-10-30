package com.itheima.dao;

import com.itheima.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestDao {

    @Select("select * from account")
    public List<Account> testFindAll();

}
