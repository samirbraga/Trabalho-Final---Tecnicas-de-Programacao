package br.com.csvanalytics.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/calc")
public class CSVMinEndpoint {
    @RequestMapping(method = RequestMethod.GET, path = "/min")
    public Map<String, Double> getMinFromColumns() {
        Map<String, Double> myMap = new HashMap<String, Double>();
        myMap.put("notas", 9.0);
        return myMap;
    }
}
