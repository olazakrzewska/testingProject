package triangle;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/triangle")
public class TriangleController {

    private final TriangleService service = new TriangleService();

    @GetMapping
    public TriangleResponse calculate(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam double c) throws InterruptedException {

        boolean valid = service.isValid(a,b,c);

        if (!valid) {
            return new TriangleResponse(false, 0, 0);
        }
        return new TriangleResponse(
                true,
                service.perimeter(a,b,c),
                service.area(a,b,c)
        );
    }
}
