package org.soofi.expensetracker;

import org.soofi.expensetracker.model.AppUser;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/user")
    public AppUser getUser() {
        AppUser user = new AppUser();
        user.setFirstName("hadi");
        user.setLastName("soofi");
        user.setEmail("soofi@gmail.com");
        user.setPassword("12345");
        return user;
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

    @PostMapping("/user")
    public void postUserInfo(@RequestBody AppUser user) {
        System.out.println(user.getFirstName() + ", " + user.getLastName() + ", " + user.getEmail() + ", " + user.getId() + ", " + user.getPassword());
    }
}
