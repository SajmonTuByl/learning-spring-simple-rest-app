package com.example.learningspringsimpleapprest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemplaryObjectController {

    // Method will get a value (String) and pass it further as a "mappedValue" variable.
    // To map the value we need to execute "localhost:8080/hello?mappedValue=value"
    @GetMapping("/hello")
    public ExemplaryObject getMappingMethod(@RequestParam(value = "mappedValue", defaultValue = "defaultText") String mappedValue){
        // Now the function returns a new object, which takes mappedValue as the one of its parameters in a constructor.
        // Object will be converted to JSON, because Jackson 2 is used by default (Spring Web classpath in dependency file)
        // Keep in mind that mappedValue is a String!
        return new ExemplaryObject(444, mappedValue, true);
    }
}
