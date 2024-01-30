package com.brianeno.chargesession.service;

import com.brianeno.chargesession.model.ChargeSession;
import com.brianeno.chargesession.repository.ChargeSessionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChargeSessionService {
    private final ChargeSessionRepository chargeSessionRepository;

    public String createCustomer(ChargeSession chargeSession) {
        return chargeSessionRepository.createChargeSession(chargeSession);
    }

    public ChargeSession updateCustomer(String id, ChargeSession chargeSession) {
        return chargeSessionRepository.updateCustomer(id, chargeSession);
    }

    public ChargeSession getCustomer(String id) {
        return chargeSessionRepository.getChargeSessionById(id);
    }

    public String deleteCustomer(String id) {
        return chargeSessionRepository.deleteChargeSession(id);
    }
}
