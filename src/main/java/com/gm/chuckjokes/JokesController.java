package com.gm.chuckjokes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller
public class JokesController {

    private final JokeServiceImpl jokeService;
    private static final Logger LOG = LoggerFactory.getLogger(JokesController.class);

    public JokesController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String randomJoke(Model model) {
        String joke = jokeService.getJoke();
        LOG.info("Getting joke:  {}", joke);
        model.addAttribute("joke", joke);
        return "jokes";
    }
}
