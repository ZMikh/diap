package com.mikh.diap.app.api.inbound;

import com.mikh.diap.domain.HuntingApplication;

public interface ApplicationCheckService {
    void approveApplication(HuntingApplication huntingApplication);
}
