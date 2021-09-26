package com.app.currencyconversion.config;

import com.app.currencyconversion.models.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author t0k02w6 on 26/09/21
 * @project currency-conversion
 */
@FeignClient(name = "currency-exchange", url = "localhost:8083")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
