package thymproject.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thymproject.project.entity.FeedBack;
import thymproject.project.repository.FeedBackRepository;

@Service
public class FeedBackService {

    @Autowired
    private FeedBackRepository feedBackRepository;


    public void storeInDb(FeedBack feedBack){
        feedBackRepository.save(feedBack);
    }
}
