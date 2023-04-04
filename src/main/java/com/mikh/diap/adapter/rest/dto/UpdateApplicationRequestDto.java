package com.mikh.diap.adapter.rest.dto;

/**
 * Параметры запроса по обновлению заявки
 *
 * @param applicationState Статус рассмотрения заявки
 */
public record UpdateApplicationRequestDto(
        String applicationState
) {
}
