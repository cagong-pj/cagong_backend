package winterproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import winterproject.domain.Cafe;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @GetMapping("/")

    @GetMapping(path = "/")
    public Optional<>


    @GetMapping(path = "inquiry/field1={hashtag}&field2={location}")
    public List<Cafe> inquiry(@PathVariable(name = "location"))
}
