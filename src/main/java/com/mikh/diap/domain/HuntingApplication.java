package com.mikh.diap.domain;

import com.mikh.diap.app.exception.ApplicationInformationException;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

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
    /**
     * Дата подачи заявки
     */
    @Column(name = "creation_date", nullable = false)
    private LocalDate creationDate;

    public void setCreationDate() {
        this.creationDate = LocalDate.now();
    }

    public void setLastname(String lastname) throws ApplicationInformationException {
        if (StringUtils.isBlank(lastname)) {
            throw new ApplicationInformationException();
        }
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) throws ApplicationInformationException {
        if (StringUtils.isBlank(firstname)) {
            throw new ApplicationInformationException();
        }
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) throws ApplicationInformationException {
        if (StringUtils.isBlank(middlename)) {
            throw new ApplicationInformationException();
        }
        this.middlename = middlename;
    }

    public void setHuntingLicenseDateOfIssue(LocalDate huntingLicenseDateOfIssue) throws ApplicationInformationException {
        if (Objects.isNull(huntingLicenseDateOfIssue)) {
            throw new ApplicationInformationException();
        }
        this.huntingLicenseDateOfIssue = huntingLicenseDateOfIssue;
    }

    public void setHuntingLicenseSeries(String huntingLicenseSeries) throws ApplicationInformationException {
        if (StringUtils.isBlank(huntingLicenseSeries)) {
            throw new ApplicationInformationException();
        }
        this.huntingLicenseSeries = huntingLicenseSeries;
    }

    public void setHuntingLicenseNumber(Long huntingLicenseNumber) throws ApplicationInformationException {
        if (Objects.isNull(huntingLicenseNumber)) {
            throw new ApplicationInformationException();
        }
        this.huntingLicenseNumber = huntingLicenseNumber;
    }

    public void setCount(Integer count) throws ApplicationInformationException {
        if (Objects.isNull(count)) {
            throw new ApplicationInformationException();
        }
        this.count = count;
    }
}
