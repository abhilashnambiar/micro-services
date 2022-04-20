package com.home;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/fraud-check")
public record FraudController(FraudCheckService fraudCheckService) {

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
        return new FraudCheckResponse(
          fraudCheckService.isFraudCustomer(customerId)
        );
    }
}
