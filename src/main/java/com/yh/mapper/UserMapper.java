package com.yh.mapper;
import com.yh.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {

    List<User> getAllUser();

}








