package cn.tim.rdp.web;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping(value = "/test")
    public String Test() {
        return "111";
    }


    @GetMapping(value = "/test1")
    public String Test1() {
        return "HelloWorld123456";
    }

    @GetMapping(value = "/test2")
    public String Test3() {
        return "HelloWorld1234567";
    }
}