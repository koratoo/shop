//Spring Data JPA @Query어노테이션 추가 영상 입니다.
package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface ItemRepository extends JpaRepository<Item, Long>{
    @Query(value = "select * from item i where i.item_detail like %:itemDetail% order by i.price desc", nativeQuery = true)

    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);

}
