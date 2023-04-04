package com.mikh.diap.adapter.persistence;

import com.mikh.diap.adapter.persistence.jpa.ApplicationJpaRepository;
import com.mikh.diap.app.api.outbound.ApplicationPersistence;
import com.mikh.diap.app.exception.ApplicationNotFoundException;
import com.mikh.diap.domain.HuntingApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ApplicationPersistenceAdapter implements ApplicationPersistence {
    private final ApplicationJpaRepository repository;

    @Override
    public HuntingApplication save(HuntingApplication huntingApplication) {
        return repository.save(huntingApplication);
    }

    @Override
    public List<HuntingApplication> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public HuntingApplication findById(Long id) throws ApplicationNotFoundException {
        return repository.findById(id).orElseThrow(ApplicationNotFoundException::new);
    }
}
