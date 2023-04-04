package com.mikh.diap.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Заявка на добычу охотничьих ресурсов
 */
@Entity
@Getter
@Setter
@Table(name = "application")
@NamedEntityGraph(name = "Application.resource", attributeNodes = @NamedAttributeNode("resource"))
public class HuntingApplication {
    /**
     * Идентификатор заявки
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Фамилия заявителя
     */
    @Column(name = "lastname", nullable = false)
    private String lastname;
    /**
     * Имя заявителя
     */
    @Column(name = "firstname", nullable = false)
    private String firstname;
    /**
     * Отчество заявителя
     */
    @Column(name = "middlename", nullable = false)
    private String middlename;
    /**
     * Тип заявки
     */
    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ApplicationType applicationType;
    /**
     * Дата выдачи охотбилета
     */
    @Column(name = "license_date_of_issue", nullable = false)
    private LocalDate huntingLicenseDateOfIssue;
    /**
     * Серия охотбилета
     */
    @Column(name = "license_series", nullable = false)
    private String huntingLicenseSeries;
    /**
     * Номер охотбилета
     */
    @Column(name = "license_number", nullable = false)
    private Long huntingLicenseNumber;
    /**
     * Количество запрашиваемого ресурса
     */
    @Column(name = "resource_count", nullable = false)
    private Integer count;
    /**
     * Статус рассмотрения заявки
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "state")
    private ApplicationState applicationState;
    /**
     * Охотничий ресурс
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private HuntingResource resource;
}
