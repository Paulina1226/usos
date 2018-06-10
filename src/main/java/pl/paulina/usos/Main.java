<<<<<<< HEAD
package pl.paulina.usos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Main {
 
    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "Hello World!";
    }
 
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
=======
package pl.paulina.usos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Main {
 
    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {
        return "Hello World!";
    }
 
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
>>>>>>> 24952e9bf3a63a0c18a98b88dafb7b7a40dadc8d
}