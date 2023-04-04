package com.mikh.diap.adapter.rest.dto;

import lombok.Data;

/**
 * Параметры ответа по ресурсу при запросе данных по заявке
 */
@Data
public class ResourceDto {
   /**
    * Регион ресурса
    */
   private String region;
   /**
    * Название ресурса
    */
   private String name;
}
