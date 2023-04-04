package com.mikh.diap.app.api.inbound;

import lombok.Data;

/**
 * Параметры запроса по обновлению заявки
 */
@Data
public class UpdateApplicationRequest {
    /**
     * Статус заявки
     */
    private String applicationState;
}
