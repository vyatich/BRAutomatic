package com.brautomatic.service.interfaces;

import com.brautomatic.model.Disk;

import java.util.List;

public interface DiskService {
    List<Disk> getAllFreeDisk();
    List<Disk> getAllUserDiskByUser(Long userId);
    void addDisk(Disk disk);
}
