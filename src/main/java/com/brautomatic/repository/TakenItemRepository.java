package com.brautomatic.repository;

import com.brautomatic.model.TakenItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TakenItemRepository extends CrudRepository<TakenItem, Long> {

    @Query("from TakenItem t where t.user=:userId")
    List<TakenItem> findByUser(@Param("userId") Long userId);
}
