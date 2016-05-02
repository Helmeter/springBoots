package hello;

/**
 * Created by helmeter on 5/2/16.
 */

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller

public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    String homes() {
        return "Hello World!";
    }



}