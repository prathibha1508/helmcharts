package com.shaw.claims.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class AuditHistoryDTO extends BaseEntityDTO{
    private String auditHistoryText;
}
