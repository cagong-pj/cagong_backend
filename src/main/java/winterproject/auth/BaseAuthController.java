package winterproject.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class BaseAuthController {

    private final HttpSession httpSession;

    @GetMapping("/oauth/base")
    public String index(Model model) {
        SessionUser sessionUser = (SessionUser) httpSession.getAttribute("user");

        if (sessionUser != null) {
            model.addAttribute("email", sessionUser.getEmail());
            model.addAttribute("userName", sessionUser.getName());

        }
        return "oauth/base/index";

    }

}
