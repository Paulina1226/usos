package pl.paulina.usos;

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

}