package com.iason.administration.web.controllers;

import com.iason.administration.services.ITradingPartnerService;
import com.iason.administration.web.apis.TradingPartnerAdminApi;
import com.iason.administration.web.model.TradingPartnerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: TradingPartnerAdminController
 * Inside the package - com.iason.administration.web.controllers
 * Created Date: 5/22/2020
 * Created Time: 7:29 PM
 **/
@RestController
@RequiredArgsConstructor
public class TradingPartnerAdminController implements TradingPartnerAdminApi {

    private final ITradingPartnerService   tradingPartnerService;

    @Override
    public ResponseEntity<TradingPartnerDto> getTradingPartners() {
        List<TradingPartnerDto> tradingPartnerDtos = tradingPartnerService.getTradingPartners();
        return new ResponseEntity(tradingPartnerDtos, HttpStatus.OK);
    }

    @Override
    public ResponseEntity createTradingPartner(@Valid TradingPartnerDto tradingPartnerDto) {
        TradingPartnerDto tp = tradingPartnerService.createTradingPartner(tradingPartnerDto);
        return new ResponseEntity(tp, HttpStatus.CREATED);
    }

    @Override
    public String helloTradingPartnerService() {
        return tradingPartnerService.getHelloFromTPServer();
    }
}
