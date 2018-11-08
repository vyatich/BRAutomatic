package com.brautomatic.repository;

import com.brautomatic.model.TakenItem;
import com.brautomatic.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TakenItemRepository extends CrudRepository<TakenItem, Long> {
    List<TakenItem> findByUser(User user);
}
