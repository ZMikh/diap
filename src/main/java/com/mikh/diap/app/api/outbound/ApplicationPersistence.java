package com.mikh.diap.app.api.outbound;

import com.mikh.diap.domain.HuntingApplication;

import java.util.List;

public interface ApplicationPersistence {
    HuntingApplication save(HuntingApplication huntingApplication);

    List<HuntingApplication> findAll();

    void deleteById(Long id);

    HuntingApplication findById(Long id);
}
