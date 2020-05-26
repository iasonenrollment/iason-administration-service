package com.iason.administration.services;

import com.iason.administration.web.model.TradingPartnerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: TradingPartnerServiceFeignClientImpl
 * Inside the package - com.iason.administration.services
 * Created Date: 5/24/2020
 * Created Time: 6:21 AM
 **/
@Service
@Slf4j
@RequiredArgsConstructor
public class TradingPartnerServiceFeignImpl implements ITradingPartnerService{

    private final TradingPartnerServiceFeignClient feignClient;

    @Override
    public String getHelloFromTPServer() {
        log.info("Calling Trading Partner Service using Open Feign");
        return feignClient.getHelloFromTPServer();
    }

    @Override
    public List<TradingPartnerDto> getTradingPartners() {
        log.info("Calling Trading Partner Service using Open Feign");
        return feignClient.getTradingPartners();
    }

    @Override
    public TradingPartnerDto createTradingPartner(TradingPartnerDto tradingPartnerDto) {
        ResponseEntity<TradingPartnerDto> responseEntity = feignClient.createTradingPartner(tradingPartnerDto);
        TradingPartnerDto tradingPartner = responseEntity.getBody();
        return tradingPartner;
    }
}
