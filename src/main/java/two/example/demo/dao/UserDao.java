package two.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import two.example.demo.eneity.User;

import java.util.List;
@Mapper
public interface UserDao {
    public List<User> findAll();
    public List<User> findById(String id);
    public int insertUser (User user);
    public int deleteUser(String id);
    public int updateUser(@Param("id") String id, @Param("password") String password,@Param("isorder") String isorder,@Param("name")String name, @Param("address") String address);
}