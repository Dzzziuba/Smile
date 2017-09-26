package dziuba.roma.controllers;

import dziuba.roma.model.Journalist;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roma Dziuba
 */
@Controller
public class JournalistController {
    public static List<Journalist> journalists = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Journalist> get() {
        return journalists;
    }

    public static void addToList(Journalist j) {
        journalists.add(j);
    }
}
