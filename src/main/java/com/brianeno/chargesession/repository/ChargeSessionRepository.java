package com.brianeno.chargesession.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.brianeno.chargesession.model.ChargeSession;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ChargeSessionRepository {
    private final DynamoDBMapper dynamoDBMapper;

    public String createChargeSession(ChargeSession chargeSession) {
        dynamoDBMapper.save(chargeSession);
        return chargeSession.getId();
    }

    public ChargeSession getChargeSessionById(String id) {
        return dynamoDBMapper.load(ChargeSession.class, id);
    }

    public ChargeSession updateCustomer(String id, ChargeSession chargeSession) {
        ChargeSession load = dynamoDBMapper.load(ChargeSession.class, id);
        // map these two entity
        load.setVin(chargeSession.getVin());
        load.setTransactionId(chargeSession.getTransactionId());
        load.setSessionDate(chargeSession.getSessionDate());
        load.setMeterValueList(chargeSession.getMeterValueList());
        load.setCompleted(chargeSession.getCompleted());
        dynamoDBMapper.save(load);

        return dynamoDBMapper.load(ChargeSession.class, id);
    }

    public String deleteChargeSession(String id) {
        ChargeSession load = dynamoDBMapper.load(ChargeSession.class, id);
        dynamoDBMapper.delete(load);
        return load.getId() + " was deleted !";
    }
}
