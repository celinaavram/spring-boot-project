
package com.springbootbooksApp.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amountInMicros",
    "currencyCode"
})
public class ListPrice_ {

    @JsonProperty("amountInMicros")
    private Double amountInMicros;
    @JsonProperty("currencyCode")
    private String currencyCode;

    @JsonProperty("amountInMicros")
    public Double getAmountInMicros() {
        return amountInMicros;
    }

    @JsonProperty("amountInMicros")
    public void setAmountInMicros(Double amountInMicros) {
        this.amountInMicros = amountInMicros;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
