package com.microsoft.openai.samples.assistant.business.service;

import com.microsoft.openai.samples.assistant.business.models.Portfolio;

import com.microsoft.openai.samples.assistant.business.models.Asset;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PortfolioService {

    private final Map<String, Portfolio> portfolios;

    public PortfolioService() {
        this.portfolios = new HashMap<>();
        // Fill the map with dummy data
        this.portfolios.put("1000", new Portfolio(
                "1000",
                "alice.user@contoso.com",
                "100000.00",
                Arrays.asList(new Asset("1", "stock", "Tech Corp", 1000, 50000.0),
                              new Asset("2", "bond", "US Treasury", 2000, 60000.0))));

        
        this.portfolios.put("2000", new Portfolio(
        "2000",
        "bob.user@contoso.com",
        "100000.00",
        Arrays.asList(new Asset("1", "stock", "APPL", 1000, 50000.0),
                        new Asset("2", "crypto", "BitCoin", 20, 207000.0))));
        this.portfolios.put("3000", new Portfolio(
            "3000",
            "john.user@contoso.com",
            "100000.00",
            Arrays.asList(new Asset("1", "stock", "Microsoft", 10000, 4500000.0),
                            new Asset("2", "stock", "Nvidia", 10000, 1500000.0))));
        }

    public Portfolio getPortfolioDetails(String portfolioId) {
        if (portfolioId == null || portfolioId.isEmpty())
            portfolioId = "1000";
            //throw new IllegalArgumentException("PortfolioId is empty or null");
        try {
            Integer.parseInt(portfolioId);
        } catch (NumberFormatException e) {
            portfolioId = "1000";
            //throw new IllegalArgumentException("PortfolioId is not a valid number");
        }
        // Return account data from the map
        return this.portfolios.get(portfolioId);
    }
}