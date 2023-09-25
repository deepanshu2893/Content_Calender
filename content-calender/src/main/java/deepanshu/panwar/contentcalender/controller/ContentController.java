package deepanshu.panwar.contentcalender.controller;


import deepanshu.panwar.contentcalender.model.Content;
import deepanshu.panwar.contentcalender.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private ContentCollectionRepository repository;

    public ContentController (ContentCollectionRepository repository){
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();

    }
}
