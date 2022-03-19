package com.anshinbackend.dao;

import com.anshinbackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OrderDAO extends JpaRepository<Order, Integer> {
    public List<Order> findByReturnOrderIsFalseOrderByTimeCreateDesc();
    public List<Order> findByStatusAndReturnOrderIsFalseOrderByTimeCreateDesc(Integer status);

//    @Query(value = "begin; \n" +
//            "set @from = ?1 ; \n" +
//            "set @to = ?2 ; \n" +
//            "set @tmpid = (2000000 + @from % 147483647); \n" +
//            "update orders set id=@tmpid where id = @from; \n" +
//            "update orders set id=@from where id=@to; \n" +
//            "update orders set id=@to where id = @tmpid; \n" +
//            "commit;", nativeQuery = true)
//    public void swat(Integer idOld, Integer idNew);
@Transactional
@Modifying
    @Query("update  Order  o set o.id = ?1 where  o.id =?2")
    public void updateId (Integer idOld, Integer idNew);

}
