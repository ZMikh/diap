package com.mikh.diap.app.api.outbound;

import com.mikh.diap.domain.HuntingResource;

public interface ResourcePersistence {
    HuntingResource findById(Long id);
}
