package com.microsoft.openai.samples.assistant.business.controller;

import com.microsoft.openai.samples.assistant.business.models.Portfolio;
import com.microsoft.openai.samples.assistant.business.models.Asset;
import com.microsoft.openai.samples.assistant.business.service.PortfolioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portfolios")
public class PortfolioController {

    private final PortfolioService portfolioService;
    private static final Logger logger = LoggerFactory.getLogger(PortfolioController.class);

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/{portfolioId}")
    public Portfolio getPortfolioDetail(@PathVariable String portfolioId) {
        logger.info("Received request to get portfolio details for portfolio id: {}", portfolioId);
        return portfolioService.getPortfolioDetails(portfolioId);
    }
}