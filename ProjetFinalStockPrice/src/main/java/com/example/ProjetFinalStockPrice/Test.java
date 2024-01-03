package com.example.stockprice;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class Test {
    static class StockData {
        @JsonProperty("Meta Data")
        private MetaData metaData;

        @JsonProperty("Time Series (Daily)")
        private Map<String, DailyStockInfo> timeSeries;

        // Getter and setter methods

        public MetaData getMetaData() {
            return metaData;
        }

        public void setMetaData(MetaData metaData) {
            this.metaData = metaData;
        }

        public Map<String, DailyStockInfo> getTimeSeries() {
            return timeSeries;
        }

        public void setTimeSeries(Map<String, DailyStockInfo> timeSeries) {
            this.timeSeries = timeSeries;
        }
    }

    static class MetaData {
        @JsonProperty("1. Information")
        private String information;

        @JsonProperty("2. Symbol")
        private String symbol;

        @JsonProperty("3. Last Refreshed")
        private String lastRefreshed;

        @JsonProperty("4. Output Size")
        private String outputSize;

        @JsonProperty("5. Time Zone")
        private String timeZone;

        public String getInformation() {
            return information;
        }

        public void setInformation(String information) {
            this.information = information;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getLastRefreshed() {
            return lastRefreshed;
        }

        public void setLastRefreshed(String lastRefreshed) {
            this.lastRefreshed = lastRefreshed;
        }

        public String getOutputSize() {
            return outputSize;
        }

        public void setOutputSize(String outputSize) {
            this.outputSize = outputSize;
        }

        public String getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(String timeZone) {
            this.timeZone = timeZone;
        }
    }

    static class DailyStockInfo {
        @JsonProperty("1. open")
        private String open;

        @JsonProperty("2. high")
        private String high;

        @JsonProperty("3. low")
        private String low;

        @JsonProperty("4. close")
        private String close;

        @JsonProperty("5. volume")
        private String volume;


        public String getOpen() {
            return open;
        }

        public void setOpen(String open) {
            this.open = open;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getClose() {
            return close;
        }

        public void setClose(String close) {
            this.close = close;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }
    }

    public static void main(String[] args) {
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_daily&symbol=IBM&apikey=O6ZHUL1I8YXR5XZT"; // Remplacez ceci par l'URL de votre API

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<StockData> response =
                restTemplate.getForEntity(url, StockData.class);


        StockData stockData = response.getBody();
        if (stockData != null && stockData.getTimeSeries() != null) {
            String targetDate = "2023-12-29"; // Remplacez ceci par la date spécifique que vous recherchez
            DailyStockInfo dailyStockInfo = stockData.getTimeSeries().get(targetDate);

            if (dailyStockInfo != null) {
                // Vous pouvez accéder aux informations spécifiques pour la date donnée ici
                System.out.println("Date: " + targetDate);
                System.out.println("Open: " + dailyStockInfo.getOpen());
                System.out.println("High: " + dailyStockInfo.getHigh());
                System.out.println("Low: " + dailyStockInfo.getLow());
                System.out.println("Close: " + dailyStockInfo.getClose());
                System.out.println("Volume: " + dailyStockInfo.getVolume());
            } else {
                System.out.println("Pas d'informations pour la date spécifiée.");
            }
        } else {
            System.out.println("Aucune donnée valide dans la réponse.");
        }

    }
}




