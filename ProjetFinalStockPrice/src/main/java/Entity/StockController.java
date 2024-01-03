package Entity;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
/*
@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping("/consult-by-date")
    public Optional<StockEntity> consultStockByDate (@RequestParam String stockKey, @RequestParam String date) {

        return stockService.consultByDate(stockKey, date);
    }

    @GetMapping("/consult-between-dates")
    public ResponseEntity<List<StockSearch>> consultStockBetweenDates(
            @RequestParam String stockKey,
            @RequestParam String startDate,
            @RequestParam String endDate) {
        LocalDateTime start = LocalDateTime.parse(startDate);
        LocalDateTime end = LocalDateTime.parse(endDate);
        List<StockSearch> result = stockSearchService.consultStockBetweenDates(stockKey, start, end);
        return ResponseEntity.ok(result);
    }
}

    }
*/
