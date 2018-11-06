package com.brautomatic.service.interfaces;

import com.brautomatic.model.TakenItem;

import java.util.List;

public interface TakenItemService {

    List<TakenItem> getMyTakenItem(Long userId);
    void addTakenItem(TakenItem takenItem);
}
