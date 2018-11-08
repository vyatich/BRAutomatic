package com.brautomatic.service.interfaces;

import com.brautomatic.model.Disk;
import com.brautomatic.model.User;

import java.util.List;
import java.util.Optional;

public interface DiskService {

    Optional<Disk> getDiskById(Long id);
    List<Disk> getAllFreeDiskList();
    List<Disk> getAllUserDiskByUser(User user);
    void addDisk(Disk disk);
}
