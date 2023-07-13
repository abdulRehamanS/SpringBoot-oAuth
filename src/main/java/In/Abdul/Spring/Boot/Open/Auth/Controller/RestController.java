package In.Abdul.Spring.Boot.Open.Auth.Controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/")
    public String welcome() {
        return "welcome to Kodnest...!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome to admin...!";
    }

    @GetMapping("/user")
    public String user() {
        return "welcome to user...!";
    }
}
