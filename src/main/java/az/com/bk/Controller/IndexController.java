package az.com.bk.Controller;

import az.com.bk.Service.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class IndexController {

    private final CardService cardService;

    public IndexController(CardService cardService) {

        this.cardService = cardService;
    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("mod")
    public String mod()
    {
        return "mod";
    }

    @GetMapping("test")
    public String test()
    {
        return "test";
    }




}
