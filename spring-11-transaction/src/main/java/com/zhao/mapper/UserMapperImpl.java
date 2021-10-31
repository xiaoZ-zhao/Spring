package com.zhao.mapper;

import com.zhao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    //我们的所有操作，都是使用sqlSession来执行在原来，现在使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    //查询
    @Override
    public List<User> selectUser() {

        User user=new User(6,"小李","4123");

        UserMapper mapper=getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(5);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

}
