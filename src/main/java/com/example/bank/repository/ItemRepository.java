package com.example.bank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bank.model.Item;

public interface ItemRepository extends JpaRepository<Item, String>{
	
	@Query(value="select * from item where icode like %:icode% order by itemprice desc",nativeQuery=true)
	List<Item> findByItemList(@Param("icode") String icode);
}
