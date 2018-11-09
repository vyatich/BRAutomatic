package com.brautomatic.service.interfaces;

import com.brautomatic.model.TakenItem;
import com.brautomatic.model.User;

import java.util.List;

public interface TakenItemService {

    List<TakenItem> getAllTakenItem();
    List<TakenItem> getMyTakenItem(User user);
    List<TakenItem> getMyGivenItem(User user);
    void addTakenItem(TakenItem takenItem);
    void deleteTakenItem(Long id);
}
