package two.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import two.example.demo.eneity.Order;

import java.util.List;

@Mapper
public interface OrderDao {
    public List<Order> findAll();
    public List<Order> findById(String idCustomer);
    public List<Order> findByName(String nameCustomer);
    public int insertOrder(Order order);
    public List<Order> findByPhone(String phoneCustomer);
    public List<Order> findByIdOrder(Integer idOrder);
    public int modifyOrder(Integer idOrder,Integer idMenu,String name,Integer quantity,String idCustomer,Integer status,String nameCustomer,String addressCustomer,String phoneCustomer,Long time);
}
