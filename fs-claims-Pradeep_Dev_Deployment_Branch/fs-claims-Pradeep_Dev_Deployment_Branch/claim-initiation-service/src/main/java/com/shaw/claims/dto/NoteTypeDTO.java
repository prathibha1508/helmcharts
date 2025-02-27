package com.shaw.claims.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class NoteTypeDTO extends BaseEntityDTO {

	private Integer noteTypeId;
	private String noteTypeCode;
	private String noteTypeDescription;
	private NoteGroupDTO noteGroupDTO;
	private Integer lookupId;
	private String lookupCode;
	private String lookupDescription;
	private Integer statusId;
	private Boolean isManual;
}
