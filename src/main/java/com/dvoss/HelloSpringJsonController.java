package com.dvoss;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dan on 6/22/16.
 */
@RestController
public class HelloSpringJsonController {
    @RequestMapping(path = "/person.json", method = RequestMethod.GET)
    public Person getPerson() {
        Person p = new Person("Alice", "Charleston", 40);
        return p;
    }

    @RequestMapping(path = "/person.json", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person) { // can only be one request body per route, but could be a hashmap instead of custom obj
        System.out.println("Received: " + person.name);
    }
}
