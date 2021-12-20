package org.tei.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tei.pojo.Item;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class HelloController {
    @RequestMapping(value = "/index")
    public Map<String, String> index(@RequestHeader HttpHeaders headers) {
        Item item = new Item();
        item.setName("jack");
        item.setPrice(99.9);
        System.out.println("headers => " + headers);
        return headers.toSingleValueMap();
    }
}
