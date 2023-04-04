package com.mikh.diap.adapter.persistence;

import com.mikh.diap.adapter.persistence.jpa.ResourceJpaRepository;
import com.mikh.diap.app.api.outbound.ResourcePersistence;
import com.mikh.diap.domain.HuntingResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ResourcePersistenceAdapter implements ResourcePersistence {
    private final ResourceJpaRepository repository;

    @Override
    public HuntingResource findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
