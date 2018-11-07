package com.brautomatic.repository;

import com.brautomatic.model.Disk;
import com.brautomatic.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiskRepository extends CrudRepository<Disk, Long> {

    List<Disk> findByUser(User user);
}
