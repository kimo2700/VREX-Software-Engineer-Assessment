package com.assessment.webservice.service;
import com.assessment.webservice.model.Command;
import com.assessment.webservice.model.Respond;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class WebService {
    public WebService() {
    }

    public Map<String, Respond> getTop(Map<String, ArrayList<Command>> m){//service method

    Map<String, Respond> result = new HashMap<>();
        for (Map.Entry<String,ArrayList<Command>> entry : m.entrySet()){
            double beginTimestamp = System.currentTimeMillis();

            String key = entry.getKey();
            Optional<Map.Entry<String, Long>> maxEntry = entry.getValue().stream().
                                collect(Collectors.groupingBy(Command::getCommand,
                                        Collectors.counting())).entrySet().stream()
                    .max(Comparator.comparing(Map.Entry::getValue));
                  String value = maxEntry.get().getKey();
            double endTimestamp = System.currentTimeMillis();
                  result.put(key,new Respond(value,beginTimestamp,endTimestamp));


                                }
        return result;


        }
}







