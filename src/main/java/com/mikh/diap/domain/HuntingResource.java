package com.mikh.diap.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * Охотничий ресурс
 */
@Entity
@Getter
@Setter
@Table(name = "resource")
public class HuntingResource {
    /**
     * Идентификатор ресурса
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Район ресурса
     */
    @Column(name = "region", nullable = false)
    private String region;
    /**
     * Название ресурса
     */
    @Column(name = "name", nullable = false)
    private String name;
    /**
     * Статус рассмотрения ресурса
     */
    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private ResourceState resourceState;
    /**
     * Дата начала подачи заявки
     */
    @Column(name = "start_date", nullable = false)
    private LocalDate applicationStartDate;
    /**
     * Дата окончания подачи заявки
     */
    @Column(name = "finish_date", nullable = false)
    private LocalDate applicationFinishDate;
    /**
     * Квота
     */
    @Column(name = "quota", nullable = false)
    private Integer quota;
    /**
     * Заявки на добычу охотничьих ресурсов
     */
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "resource_id")
    private List<HuntingApplication> huntingApplications;
}
