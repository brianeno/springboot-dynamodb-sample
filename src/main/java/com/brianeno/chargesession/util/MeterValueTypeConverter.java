package com.brianeno.chargesession.util;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.brianeno.chargesession.model.MeterValueType;

public class MeterValueTypeConverter implements DynamoDBTypeConverter<String, MeterValueType> {
    @Override
    public String convert(MeterValueType object) {
        return object.name();
    }

    @Override
    public MeterValueType unconvert(String object) {
        return MeterValueType.valueOf(object);
    }
}
