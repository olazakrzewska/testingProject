package triangle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    private final TriangleService service = new TriangleService();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(double a, double b, double c, Model model) {

        boolean valid = service.isValid(a,b,c);

        model.addAttribute("valid", valid);

        if (valid) {
            model.addAttribute("perimeter", service.perimeter(a,b,c));
            model.addAttribute("area", service.area(a,b,c));
        }

        return "index";
    }
}