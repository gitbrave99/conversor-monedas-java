package model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.Map;

public class ApiModel{
    @SerializedName("result")
    String result;
    @SerializedName("conversion_rates")
    private Map<String, BigDecimal> conversionRates;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Map<String, BigDecimal> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, BigDecimal> conversionRates) {
        this.conversionRates = conversionRates;
    }

    public BigDecimal getCurrency(String key){
        return this.conversionRates.get(key);
    }

    @Override
    public String toString() {
        return "ApiModel{" +
                "result='" + result + '\'' +
                ", conversionRates=" + conversionRates +
                '}';
    }
}
