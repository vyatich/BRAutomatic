package com.brautomatic.repository;

import com.brautomatic.model.TakenItem;
import com.brautomatic.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TakenItemRepository extends CrudRepository<TakenItem, Long> {

    List<TakenItem> findByUser(User user);
    @Query("select t from TakenItem t where t.disk IN (select d from Disk d where d.user=:user)")
    List<TakenItem> findGivenDiskList(@Param("user") User user);
}
