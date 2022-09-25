//Spring Data JPA @Query어노테이션 추가 영상 입니다.
package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface ItemRepository extends JpaRepository<Item, Long>{
    @Query(value = "select * from item i where i.item_detail like %:itemDetail% order by i.price desc", nativeQuery = true)
    //JPQL로 작성한 쿼리문을 넣어줍니다. from뒤는 엔티티 클래스로 작성한 item을 정해주었고 item으로 부터 데이터를 select하겠다는 의미입니다.
    //nativeQuery = true를 추가하여 기존 쿼리를 그대로 활용할 수 있도록 하였습니다.
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);
    //파라미터 @Param어노테이션을 이용하여 파라미터로 넘어온 값을 JPQL에 들어갈 변수로 지정해 줄 수 있습니다. itemDetail의 변수를
    //"like % %"사이에 ":itemDetail"로 값이 들어가게 설정합니다.
}
