package com.iason.administration.services;

import com.iason.administration.web.model.TradingPartnerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: TradingPartnerServiceFeignClient
 * Inside the package - com.iason.administration.services
 * Created Date: 5/24/2020
 * Created Time: 5:38 AM
 **/
@FeignClient(name = "iason-trading-partner")
public interface TradingPartnerServiceFeignClient {

    String HELLO_TRADING_SERVICE = "/hello-trading-partner";

    String TRADING_PARTNERS = "/trading-partners";

    @RequestMapping(method = RequestMethod.GET, value = HELLO_TRADING_SERVICE, consumes = "application/json")
    //String getHelloFromTPServer(@PathVariable String hello);
    String getHelloFromTPServer();

    @RequestMapping(method = RequestMethod.GET, value = TRADING_PARTNERS, consumes = "application/json")
    List<TradingPartnerDto> getTradingPartners();

    @RequestMapping(method = RequestMethod.POST, value = TRADING_PARTNERS, consumes = "application/json")
    ResponseEntity<TradingPartnerDto> createTradingPartner(@RequestBody TradingPartnerDto tradingPartnerDto);
}
