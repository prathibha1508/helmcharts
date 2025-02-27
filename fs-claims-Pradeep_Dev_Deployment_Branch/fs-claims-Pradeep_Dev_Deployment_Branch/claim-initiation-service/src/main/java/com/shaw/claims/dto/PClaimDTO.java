package com.shaw.claims.dto;

import lombok.Data;

import java.util.List;
@Data
public class PClaimDTO {
    private String customerNumber;
    private List<PClaimDocumentDTO> claimDocumentDTO;
    private PEndUserInformationDTO endUserInformationDTO;
}
