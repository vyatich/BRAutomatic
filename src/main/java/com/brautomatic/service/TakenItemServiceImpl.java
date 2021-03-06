package com.brautomatic.service;

import com.brautomatic.model.TakenItem;
import com.brautomatic.model.User;
import com.brautomatic.repository.TakenItemRepository;
import com.brautomatic.service.interfaces.TakenItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakenItemServiceImpl implements TakenItemService {

    @Autowired
    private TakenItemRepository takenItemRepository;

    @Override
    public List<TakenItem> getAllTakenItem() {
        return takenItemRepository.findAll();
    }

    @Override
    public List<TakenItem> getMyTakenItem(User user) {
        return takenItemRepository.findByUser(user);
    }

    @Override
    public List<TakenItem> getMyGivenItem(User user) {
        return takenItemRepository.findGivenDiskList(user);
    }

    @Override
    public void addTakenItem(TakenItem takenItem) {
        takenItemRepository.save(takenItem);
    }

    @Override
    public void deleteTakenItem(Long id) {
        takenItemRepository.deleteById(id);
    }
}
