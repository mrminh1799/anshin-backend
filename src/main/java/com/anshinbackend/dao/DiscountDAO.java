package com.anshinbackend.dao;

import com.anshinbackend.entity.Discount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface DiscountDAO extends JpaRepository<Discount, Integer> {

    Optional<Discount> findById(Integer id);


//    @Query( nativeQuery = false,value = "SELECT p FROM Discount d \n" +
//            "    inner JOIN  Product p on p.id = d.product.id \n" +
//            "    LEFT JOIN SaleEvent s on s.id = d.saleEvent.id \n" +
//            "    WHERE   s.startTime > ?1 and s.endTime >= CURRENT_DATE \n" +
//            "    GROUP BY p.id")
//    List<Discount> findAllBySaleEvent(Date year);

    @Query(nativeQuery = false, value = "SELECT p.productName, s.startTime, s.endTime FROM Discount d \n" +
            "    inner JOIN Product p on p.id = d.product.id\n" +
            "    LEFT JOIN SaleEvent  s on s.id = d.saleEvent.id \n" +
            "    WHERE   s.startTime = ?1 or s.endTime >= CURRENT_DATE \n" +
            "    GROUP BY p.id" )
        List<Discount> findAllBySaleEvent(Date year);
//    SELECT products.product_name, sale_events.start_time, sale_events.end_time FROM discounts
//    RIGHT JOIN products on products.id = discounts.product_id
//    LEFT JOIN sale_events on sale_events.id = discounts.sale_Event_id
//    WHERE   sale_events.start_time > 2022 and sale_events.end_time >= CURDATE()
//    GROUP BY products.id;
}
