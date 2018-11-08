package com.brautomatic.repository;

import com.brautomatic.model.Disk;
import com.brautomatic.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DiskRepository extends CrudRepository<Disk, Long> {

    Optional<Disk> findById(Long id);
    List<Disk> findByUser(User user);
    @Query("select d from Disk d left outer join TakenItem t on d.id = t.disk where t.disk is null")
    List<Disk> getAlFreeDisks();
}
