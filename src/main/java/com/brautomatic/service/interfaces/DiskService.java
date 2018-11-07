package com.brautomatic.service.interfaces;

import com.brautomatic.model.Disk;
import com.brautomatic.model.User;

import java.util.List;

public interface DiskService {
    List<Disk> getAllFreeDisk();
    List<Disk> getAllUserDiskByUser(User user);
    void addDisk(Disk disk);
}
