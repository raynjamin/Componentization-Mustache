package com.example;

import com.example.models.Video;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ben on 9/21/16.
 */
@Controller
public class SampleProjectController {

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public String homePage(Model model) {
        Video video =
            new Video("http://movies.com/good-will-hunting.mp4",
                      "http://movies.com/good-will-hunting-thumbnail.svg",
                      "Good Will Hunting");


        video.getRelatedVideos().add(new Video("http://movies.com/movie-1.mov", "http://movies.com/movie-1.svg", "Other Movie 1"));
        video.getRelatedVideos().add(new Video("http://movies.com/movie-2.mov", "http://movies.com/movie-2.svg", "Other Movie 2"));

        model.addAttribute("featuredVideo", video);

        return "home";
    }
}
