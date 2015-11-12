/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.hib.mod250.stocks;

import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author Anders
 */
public class StockTestGenerator {
    
    /*
        1. All changed
        2. 2 changes
        3. No change
        4. No change
        5. 2 changes
        6. No change
        7. No change
        8. No change
        9. All changed
        10. No change
        11. No change
        12. 1 change
        13. No change
        14. No change
        15. All changed
        16. 2 changes
        17. No change
        18. 2 changes
        19. No change
        20. All changed
    */
    private final List<Stock> data;
    
    public StockTestGenerator() {
        data = new ArrayList<>();
        Stock base;
        
        // 1
        base = new Stock();
        base.setChange(1.37);
        base.setChangePercent(3.47);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);
        
        // 2
        base = new Stock();
        base.setChange(2.5);
        base.setChangePercent(6.7);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);
        
        // 3
        base = new Stock();
        base.setChange(2.5);
        base.setChangePercent(6.7);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);
        
        // 4
        base = new Stock();
        base.setChange(2.5);
        base.setChangePercent(6.7);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);
        
        // 5
        base = new Stock();
        base.setChange(3.1);
        base.setChangePercent(8);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);      
        
        // 6
        base = new Stock();
        base.setChange(3.1);
        base.setChangePercent(8);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);  
        
        // 7
        base = new Stock();
        base.setChange(3.1);
        base.setChangePercent(8);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);  
        
        // 8
        base = new Stock();
        base.setChange(3.1);
        base.setChangePercent(8);
        base.setDayHigh(1000);
        base.setDayLow(500);
        base.setName("TESTSTOCK");
        base.setPrice(100);
        base.setTime("2015-11-12T15:06:15+0000");
        base.setType("nisse");
        base.setVolume(2985824);
        base.setYearHigh(5000);
        base.setYearLow(100);
        base.setSymbol("T");
        data.add(base);  
        
        // 9
        base = new Stock();
        base.setChange(2.245);
        base.setChangePercent(4.463);
        base.setDayHigh(462);
        base.setDayLow(464);
        base.setName("TESTSTOCK2");
        base.setPrice(246);
        base.setTime("2015-11-12T15:07:15+0000");
        base.setType("hest");
        base.setVolume(47458);
        base.setYearHigh(4677);
        base.setYearLow(1570);
        base.setSymbol("T");
        data.add(base);  
        
        // 10
        base = new Stock();
        base.setChange(2.245);
        base.setChangePercent(4.463);
        base.setDayHigh(462);
        base.setDayLow(464);
        base.setName("TESTSTOCK2");
        base.setPrice(246);
        base.setTime("2015-11-12T15:07:15+0000");
        base.setType("hest");
        base.setVolume(47458);
        base.setYearHigh(4677);
        base.setYearLow(1570);
        base.setSymbol("T");
        data.add(base); 
        
        // 11
        base = new Stock();
        base.setChange(2.245);
        base.setChangePercent(4.463);
        base.setDayHigh(462);
        base.setDayLow(464);
        base.setName("TESTSTOCK2");
        base.setPrice(246);
        base.setTime("2015-11-12T15:07:15+0000");
        base.setType("hest");
        base.setVolume(47458);
        base.setYearHigh(4677);
        base.setYearLow(1570);
        base.setSymbol("T");
        data.add(base); 
        
        // 12
        base = new Stock();
        base.setChange(2.245);
        base.setChangePercent(4.463);
        base.setDayHigh(462);
        base.setDayLow(464);
        base.setName("TESTSTOCK2");
        base.setPrice(24624);
        base.setTime("2015-11-12T15:07:15+0000");
        base.setType("hest");
        base.setVolume(47458);
        base.setYearHigh(4677);
        base.setYearLow(1570);
        base.setSymbol("T");
        data.add(base); 
        
        // 13
        base = new Stock();
        base.setChange(2.245);
        base.setChangePercent(4.463);
        base.setDayHigh(462);
        base.setDayLow(464);
        base.setName("TESTSTOCK2");
        base.setPrice(24624);
        base.setTime("2015-11-12T15:07:15+0000");
        base.setType("hest");
        base.setVolume(47458);
        base.setYearHigh(4677);
        base.setYearLow(1570);
        base.setSymbol("T");
        data.add(base); 
        
        // 14
        base = new Stock();
        base.setChange(2.245);
        base.setChangePercent(4.463);
        base.setDayHigh(462);
        base.setDayLow(464);
        base.setName("TESTSTOCK2");
        base.setPrice(24624);
        base.setTime("2015-11-12T15:07:15+0000");
        base.setType("hest");
        base.setVolume(47458);
        base.setYearHigh(4677);
        base.setYearLow(1570);
        base.setSymbol("T");
        data.add(base); 
        
        // 15
        base = new Stock();
        base.setChange(2.46);
        base.setChangePercent(5.463);
        base.setDayHigh(437);
        base.setDayLow(478);
        base.setName("TESTSTOCK3");
        base.setPrice(333);
        base.setTime("2015-11-12T15:07:19+0000");
        base.setType("test");
        base.setVolume(2852);
        base.setYearHigh(29);
        base.setYearLow(13);
        base.setSymbol("T");
        data.add(base); 
        
        // 16
        base = new Stock();
        base.setChange(8.4);
        base.setChangePercent(13.2);
        base.setDayHigh(437);
        base.setDayLow(478);
        base.setName("TESTSTOCK3");
        base.setPrice(333);
        base.setTime("2015-11-12T15:07:19+0000");
        base.setType("test");
        base.setVolume(2852);
        base.setYearHigh(29);
        base.setYearLow(13);
        base.setSymbol("T");
        data.add(base); 
        
        // 17
        base = new Stock();
        base.setChange(8.4);
        base.setChangePercent(13.2);
        base.setDayHigh(437);
        base.setDayLow(478);
        base.setName("TESTSTOCK3");
        base.setPrice(333);
        base.setTime("2015-11-12T15:07:19+0000");
        base.setType("test");
        base.setVolume(2852);
        base.setYearHigh(29);
        base.setYearLow(13);
        base.setSymbol("T");
        data.add(base); 
        
        // 18
        base = new Stock();
        base.setChange(3.1);
        base.setChangePercent(8);
        base.setDayHigh(437);
        base.setDayLow(478);
        base.setName("TESTSTOCK3");
        base.setPrice(333);
        base.setTime("2015-11-12T15:07:19+0000");
        base.setType("test");
        base.setVolume(2852);
        base.setYearHigh(29);
        base.setYearLow(13);
        base.setSymbol("T");
        data.add(base); 
        
        // 19
        base = new Stock();
        base.setChange(3.1);
        base.setChangePercent(8);
        base.setDayHigh(437);
        base.setDayLow(478);
        base.setName("TESTSTOCK3");
        base.setPrice(333);
        base.setTime("2015-11-12T15:07:19+0000");
        base.setType("test");
        base.setVolume(2852);
        base.setYearHigh(29);
        base.setYearLow(13);
        base.setSymbol("T");
        data.add(base); 
        
        // 20
        base = new Stock();
        base.setChange(7.436);
        base.setChangePercent(8.436);
        base.setDayHigh(45);
        base.setDayLow(23);
        base.setName("TESTSTOCK4");
        base.setPrice(235);
        base.setTime("2015-11-12T15:07:25+0000");
        base.setType("fest");
        base.setVolume(425);
        base.setYearHigh(78);
        base.setYearLow(23);
        base.setSymbol("T");
        data.add(base); 
    }
    
    public String getData(int index) {
        JsonArrayBuilder ab = Json.createArrayBuilder();
        
        for (int i = 0; i < 1000; i++) { 
            data.get(index).setSymbol("" + i);
            
            ab = ab.add(data.get(index).generateJson());
        }

        return Json.createObjectBuilder().add("resources", ab).build().toString();
    }
}