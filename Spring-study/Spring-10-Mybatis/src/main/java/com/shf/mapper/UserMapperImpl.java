package com.shf.mapper;

import com.shf.pojo.User;
import lombok.Data;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

@Data
public class UserMapperImpl implements UserMapper{
//    我们所有的操作,都使用sqlsession来执行(原来),现在都使用SqlsessionTemplate,
    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
