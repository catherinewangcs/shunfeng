package two.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import two.example.demo.eneity.Menu;

import java.util.List;

@Mapper
public interface MenuDao {
    public List<Menu> findAll();
    public List<Menu> findByType(String type);
    public List<Menu> findByKeywords(String keywords);
    public int insertMenu(Menu menu);
    public int updateMenu(@Param("idMenu")Integer idMenu,@Param("name")String name,@Param("num")Integer num,@Param("price")Float price,@Param("description")String description);
    public int modifyMenu(Integer idMenu,String name,String type,Integer num,Float price,String description);
    public int deleteMenu(String name);
    public List<Menu> findById(Integer id);
}
