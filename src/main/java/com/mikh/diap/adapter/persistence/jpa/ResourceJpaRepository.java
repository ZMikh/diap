package com.mikh.diap.adapter.persistence.jpa;

import com.mikh.diap.domain.HuntingResource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceJpaRepository extends JpaRepository<HuntingResource, Long> {
}
