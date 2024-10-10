package model;

import java.util.Map;

public record ApiJSON(String base_code, String result,  Map<String, Double> conversion_rates) {
}
