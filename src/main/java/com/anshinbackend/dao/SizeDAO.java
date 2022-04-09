package com.anshinbackend.dao;

import com.anshinbackend.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface SizeDAO extends JpaRepository<Size, Integer> {
    @Query(value = "select DISTINCT  sizes.id, sizes.size_name, sizes.is_Delete" +
            " from detail_products inner join sizes " +
            "on detail_products.id_size = sizes.id" +
            " where id_product =?1" ,nativeQuery = true)
    List<Size> findListForProudct(Integer idProdcut);

    @Query("SELECT s FROM Size s WHERE s.isDelete = false")
    List<Size> findByIsdeleteSize();

    @Transactional
    @Modifying
    @Query("update Size s set s.isDelete = true where s.id = ?1")
    void deleteSize(Integer id);

}
