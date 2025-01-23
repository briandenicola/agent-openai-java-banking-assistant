package com.microsoft.openai.samples.assistant.business.models;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Portfolio(
    String id,
    String userName,
    String totalValue,
    List<Asset> assets
) {}
