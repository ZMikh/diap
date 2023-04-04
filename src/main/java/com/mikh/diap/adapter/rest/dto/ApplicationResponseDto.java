package com.mikh.diap.adapter.rest.dto;

import java.time.LocalDate;

/**
 * Параметры ответа при запросе данных по заявке
 *
 * @param id                        Идентификатор заявки
 * @param lastname                  Фамилия заявителя
 * @param firstname                 Имя заявителя
 * @param middlename                Отчество заявителя
 * @param applicationType           Тип заявки
 * @param huntingLicenseDateOfIssue Дата выдачи охотбилета
 * @param huntingLicenseSeries      Серия охотбилета
 * @param huntingLicenseNumber      Номер охотбилета
 * @param applicationState          Статус рассмотрения заявки
 * @param count                     Количество запрашиваемого ресурса
 * @param resource                  Ресурс
 */
public record ApplicationResponseDto(
        Long id,
        String lastname,
        String firstname,
        String middlename,
        String applicationType,
        LocalDate huntingLicenseDateOfIssue,
        String huntingLicenseSeries,
        Long huntingLicenseNumber,
        String applicationState,
        Integer count,
        ResourceDto resource
) {
}
