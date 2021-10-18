package com.mapper;


import com.MsbDongbaoUmsApplication;
import com.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


//@RunWith(SpringRunner.class)
@SpringBootTest(classes = MsbDongbaoUmsApplication.class)
public class UserMemberTest {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Test
    public void testInsert(){
        UmsMember umsMember =  new UmsMember();
        umsMember.setId(new Long("5"));
        umsMember.setEmail("sunying794@email.com");
        umsMember.setIcon("1111圖片");
        umsMember.setUsername("孫穎");
        umsMember.setPassword("123456");
//
        umsMemberMapper.insert(umsMember);
        System.out.println("成功");
    }
}
