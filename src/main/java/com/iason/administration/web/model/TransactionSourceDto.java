package com.iason.administration.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: TransactionSourceDto
 * Inside the package - com.iason.administration.web.model
 * Created Date: 5/24/2020
 * Created Time: 11:34 AM
 **/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionSourceDto implements Serializable {

    static final long serialVersionUID = 5825341236368670884L;

    @Null
    private Long transactionSourceId;

    @NotBlank
    @NotNull
    private String transactionSourceName;

    @NotBlank
    @NotNull
    private String senderId;

    @NotBlank
    @NotNull
    private String receiverId;

    @NotBlank
    @NotNull
    private String marketPlaceType;

    @NotNull
    private Timestamp effectiveDate;

    private Timestamp endDate;

    @Null
    @JsonFormat(pattern = "yyyy-mm-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
    private Timestamp createdDate;

    @Null
    @JsonFormat(pattern = "yyyy-mm-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
    private Timestamp lastModifiedDate;
}
