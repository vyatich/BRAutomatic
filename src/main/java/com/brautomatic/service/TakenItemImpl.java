package com.brautomatic.service;

import com.brautomatic.model.TakenItem;
import com.brautomatic.repository.TakenItemRepository;
import com.brautomatic.service.interfaces.TakenItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakenItemImpl implements TakenItemService {

    @Autowired
    private TakenItemRepository takenItemRepository;

    @Override
    public List<TakenItem> getMyTakenItem(Long userId) {
        return takenItemRepository.findByUser(userId);
    }

    @Override
    public void addTakenItem(TakenItem takenItem) {
        takenItemRepository.save(takenItem);
    }
}
