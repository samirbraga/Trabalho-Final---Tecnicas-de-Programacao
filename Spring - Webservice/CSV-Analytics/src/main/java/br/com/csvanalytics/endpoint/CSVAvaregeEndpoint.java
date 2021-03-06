package br.com.csvanalytics.endpoint;

import br.com.csvanalytics.controller.CSVController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.csvanalytics.model.Session;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/calc")
public class CSVAvaregeEndpoint {

    @RequestMapping(method = RequestMethod.GET, path = "/average")
    public Map<String, Double> queryMethod(@RequestParam String token) {
        if (Session.checkExistence(token)){
            Map<String, Double> average = CSVController.averageCalculate(token);
            return average;
        }

        return null;
    }
}
