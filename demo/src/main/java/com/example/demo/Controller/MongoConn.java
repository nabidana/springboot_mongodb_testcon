package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DTO.Testmongo;
import com.example.demo.Repository.TestRepository;

@Controller
public class MongoConn {
    
    @Autowired
    private TestRepository testRepository;

    @RequestMapping("/test")
    public String testmongo(Model model){
        List<Testmongo> t1 = testRepository.findAll();

        model.addAttribute("mongolist", t1);
        return "test";
    }
}
