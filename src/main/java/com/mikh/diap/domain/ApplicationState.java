package com.mikh.diap.domain;

/**
 * Статус рассмотрения заявки
 */
public enum ApplicationState {
    /**
     * Создана
     */
    CREATED,
    /**
     * Одобрена
     */
    APPROVED,
    /**
     * Отклонена
     */
    REJECTED
}
