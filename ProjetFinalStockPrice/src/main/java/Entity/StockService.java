package Entity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;

public class StockService {
/*
    private final String apiKey = "O6ZHUL1I8YXR5XZT";

    public Optional<StockEntity> consultByDate(String stockKey, String date) {
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY_ADJUSTED&symbol="
                + stockKey + "&apikey=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);

        // Check if the response is successful
        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            Map<String, Map<String, Map<String, String>>> timeSeries = response.getBody().get("Time Series (Daily)");

            if (timeSeries != null) {
                Map<String, String> dataForDate = timeSeries.get(date);

                if (dataForDate != null) {
                    // Use Jackson to map the data to a StockData object (you need to create StockData class)
                    return mapToStockData(dataForDate);
                }
            }
        }

        // Handle the case where data for the given date is not found
        return null;
    }

    private StockData mapToStockData(Map<String, String> data) {
        // Implement this method to create a StockData object from the map
        // You need to create a StockData class with appropriate fields
        // For simplicity, assuming StockData has fields like open, high, low, close, volume
        StockData stockData = new StockData();
        stockData.setOpen(data.get("1. open"));
        stockData.setHigh(data.get("2. high"));
        stockData.setLow(data.get("3. low"));
        stockData.setClose(data.get("4. close"));
        stockData.setVolume(data.get("5. volume"));
        return stockData;
    }
*/
}
