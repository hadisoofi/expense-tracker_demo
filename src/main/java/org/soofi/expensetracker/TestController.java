package org.soofi.expensetracker;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/user")
    public String sayHello() {
        return "Hello world!";
    }

    @GetMapping("/{id}")
    public String returnUser(@PathVariable String id) {
        return "user with id: " + id;
    }

    @GetMapping()
    public String testQueryParameter
            (@RequestParam(name = "firstName") String firstName, @RequestParam(name = "lastName") String lastName) {
        return "hello " + firstName + " " + lastName;
    }

    @PostMapping
    public String testPostMapping(@RequestBody Map<String, Object> myMap) {
        return "Got info " + myMap.get("info");
    }
}
