package com.microsoft.openai.samples.assistant.business.models;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public record Asset(
    String id,
    String type,
    String name,
    Integer quantity,
    Double currentValue
) {}
