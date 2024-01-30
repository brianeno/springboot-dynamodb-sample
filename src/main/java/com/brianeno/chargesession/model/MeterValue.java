package com.brianeno.chargesession.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.brianeno.chargesession.util.MeterValueTypeConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class MeterValue {
    @DynamoDBTypeConverted(converter = MeterValueTypeConverter.class)
    private MeterValueType meterValueType;
    private String key;
    private String value;
}
