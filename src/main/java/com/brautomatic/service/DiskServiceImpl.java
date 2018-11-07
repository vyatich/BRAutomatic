package com.brautomatic.service;

import com.brautomatic.model.Disk;
import com.brautomatic.model.User;
import com.brautomatic.repository.DiskRepository;
import com.brautomatic.service.interfaces.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiskServiceImpl implements DiskService {

    @Autowired
    private DiskRepository diskRepository;

    @Override
    public List<Disk> getAllFreeDisk() {
        return null;
    }

    @Override
    public List<Disk> getAllUserDiskByUser(User user) {
        return diskRepository.findByUser(user);
    }

    @Override
    public void addDisk(Disk disk) {
        diskRepository.save(disk);
    }
}
