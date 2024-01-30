package com.brianeno.chargesession.controller;

import com.brianeno.chargesession.model.ChargeSession;
import com.brianeno.chargesession.service.ChargeSessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/chargesession")
public class ChargeSessionController {

    private final ChargeSessionService chargeSessionService;

    @GetMapping("/{id}")
    public ChargeSession getCustomerById(@PathVariable String id) {
        return chargeSessionService.getCustomer(id);
    }

    @PostMapping({"", "/"})
    public String createCustomer(@RequestBody ChargeSession chargeSession) {
        return chargeSessionService.createCustomer(chargeSession);
    }

    @PutMapping("/{id}")
    public ChargeSession updateCustomer(@PathVariable String id, @RequestBody ChargeSession chargeSession) {
        return chargeSessionService.updateCustomer(id, chargeSession);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable String id) {
        return chargeSessionService.deleteCustomer(id);
    }
}
