package com.assessment.webservice.control;

import com.assessment.webservice.model.Command;
import com.assessment.webservice.model.Respond;
import com.assessment.webservice.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class controler {
    @Autowired// autowired service object
    WebService webService ;


    @PostMapping(path = "/")// calling post method synchronized one request at a time
    public  synchronized Map<String, Respond> posting (@RequestBody Map<String, ArrayList<Command>> input) {
       return webService.getTop(input);

    }
        //code

}
