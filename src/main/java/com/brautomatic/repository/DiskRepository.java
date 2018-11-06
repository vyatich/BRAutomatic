package com.brautomatic.repository;

import com.brautomatic.model.Disk;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiskRepository extends CrudRepository<Disk, Long> {

    @Query("from Disk d where d.userOwn=:userId")
    List<Disk> findByUserOwn(@Param("userId") long userId);
}
