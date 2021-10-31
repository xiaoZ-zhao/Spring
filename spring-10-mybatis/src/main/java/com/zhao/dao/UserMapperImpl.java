package com.zhao.dao;

import com.zhao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    //我们的所有操作，都是使用sqlSession来执行在原来，现在使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    //查询
    @Override
    public List<User> selectUser() {
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

}
