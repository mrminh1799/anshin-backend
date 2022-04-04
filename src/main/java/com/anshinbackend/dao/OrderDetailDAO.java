package com.anshinbackend.dao;

import com.anshinbackend.entity.Order;
import com.anshinbackend.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {
    List<OrderDetail> findByOrder(Order order);
    List<OrderDetail> findByOrderId(Integer id);
    @Modifying
    @Transactional
    @Query("update  OrderDetail  od set od.order.id =?1 where  od.id =?2")
    void updateOrderId(Integer idOrder, Integer idOrderDetail);

    @Modifying
    @Transactional
    @Query("delete from OrderDetail  o where o.order.id=?1")
    void deleteAllByOrderId(Integer id);

    @Query("select od from OrderDetail  od where od.order.id=?1")
    public List<OrderDetail> findByOrderDetailId(Integer id);
    @Transactional
    @Modifying
    @Query(value = "update detail_orders dos join detail_products dp on dp.id=dos.id_product_detail " +
            "set dos.quantity=?3 WHERE dp.id=?1 and order_id=?2",nativeQuery = true)
    public void updateNumberOfProductInOrder(int id_product, int id_order,int quantity);
}
