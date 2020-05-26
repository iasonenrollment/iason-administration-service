package com.iason.administration.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: TradingPartnerDto
 * Inside the package - com.iason.administration.web.model
 * Created Date: 5/24/2020
 * Created Time: 11:34 AM
 **/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TradingPartnerDto implements Serializable {

    static final long serialVersionUID = 6502841827303340828L;

    @Null
    private Long tradingPartnerId;

    @NotNull
    @NotBlank
    private String tradingPartnerDesc;

    @NotNull
    @NotBlank
    @Size(min=3, max=100)
    private String tradingPartner;

    @NotBlank
    @Size(max=2)
    private String stateCode;

    @NotBlank
    @Size(min=3, max=10)
    private String hios;

    @NotEmpty
    private List<TransactionSourceDto> transactionSourceDtos;

    @Null
    //@JsonFormat(pattern = "yyyy-mm-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;

    @Null
    //@JsonFormat(pattern = "yyyy-mm-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedDate;
}
