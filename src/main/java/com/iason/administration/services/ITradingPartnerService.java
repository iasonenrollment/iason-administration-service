package com.iason.administration.services;

import com.iason.administration.web.model.TradingPartnerDto;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ITradingPartnerService
 * Inside the package - com.iason.administration.services
 * Created Date: 5/24/2020
 * Created Time: 6:18 AM
 **/
public interface ITradingPartnerService {
    String getHelloFromTPServer();

    List<TradingPartnerDto> getTradingPartners();

    TradingPartnerDto createTradingPartner(TradingPartnerDto tradingPartnerDto);
}
