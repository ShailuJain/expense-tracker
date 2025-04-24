package com.fintech.cardtx.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TransactionRequest {

    @NotBlank(message = "Card number is required")
    private String cardNumber;

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "1.0", message = "Amount should be minimum 1.0")
    private double amount;

    @NotBlank(message = "Merchant name is required")
    private String merchant;
}
