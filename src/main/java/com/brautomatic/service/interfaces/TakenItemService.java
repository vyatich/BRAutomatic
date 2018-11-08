package com.brautomatic.service.interfaces;

import com.brautomatic.model.TakenItem;
import com.brautomatic.model.User;

import java.util.List;

public interface TakenItemService {

    Iterable<TakenItem> getAllTakenItem();
    List<TakenItem> getMyTakenItem(User user);
    void addTakenItem(TakenItem takenItem);
}
