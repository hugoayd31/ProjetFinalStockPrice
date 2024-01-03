package Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Setter
@Getter
@Entity
@Table(name = "stock")
@Data

public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "open_price")
    private String openPrice;

    @Column(name = "low_price")
    private String lowPrice;

    @Column(name = "high_price")
    private String highPrice;

    @Column(name = "volume")
    private String stockVolume;

    @JsonProperty("Meta Data")
    private static MetaData metaData;

    @JsonProperty("Time Series (Daily)")
    private static TimeSeriesDaily timeSeries;

    public StockEntity(String stockName, String openPrice, String lowPrice, String highPrice, String stockVolume) {
        this.stockName = metaData.getSymbol();
        this.openPrice = timeSeries.getOpen();
        this.lowPrice = timeSeries.getLow();
        this.highPrice = timeSeries.getHigh();
        this.stockVolume = timeSeries.getVolume();
    }

    public StockEntity() {

    }
}

