package thymproject.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import thymproject.project.entity.FeedBack;
import thymproject.project.service.FeedBackService;

@Controller
public class FeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    @GetMapping("/")
    public String giveFeedBack(){
        return "feedback";
    }

    @PostMapping("/addFeedBack")
    public String addFeedBack(@ModelAttribute FeedBack feedBack){
        feedBackService.storeInDb(feedBack);
        return "saved";

    }


}
