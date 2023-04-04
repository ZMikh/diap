package com.mikh.diap.adapter.rest.dto;

import lombok.Builder;

import java.time.LocalDate;

/**
 * Параметры запроса на создание заявки
 *
 * @param lastname                  Фамилия заявителя
 * @param firstname                 Имя заявителя
 * @param middlename                Отчество заявителя
 * @param applicationType           Тип заявки
 * @param huntingLicenseDateOfIssue Дата выдачи охотбилета
 * @param huntingLicenseSeries      Серия охотбилета
 * @param huntingLicenseNumber      Номер охотбилета
 * @param count                     Количество запрашиваемого ресурса
 */
@Builder
public record CreateApplicationRequestDto(
        String lastname,
        String firstname,
        String middlename,
        String applicationType,
        LocalDate huntingLicenseDateOfIssue,
        String huntingLicenseSeries,
        Long huntingLicenseNumber,
        Integer count
){}
