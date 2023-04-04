package com.mikh.diap.app.api.inbound;

import com.mikh.diap.domain.HuntingApplication;

import java.util.List;

public interface ApplicationService {

    List<HuntingApplication> getAll();

    HuntingApplication getApplicationById(Long id);

    HuntingApplication addApplication(Long id, HuntingApplication huntingApplication);

    HuntingApplication updateApplication(Long id, UpdateApplicationRequest updateApplicationRequest);

    void deleteApplicationById(Long id);
}
