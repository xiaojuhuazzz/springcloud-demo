package com.yjk.ms_two.controller;

import com.yjk.ms_two.entity.Visitor;
import com.yjk.ms_two.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class VisitorController {

    @Autowired
    private VisitorRepository repository;

    @RequestMapping("/")
    public String index(HttpServletRequest request){
        String ip = request.getRemoteAddr();
        Visitor visitor = repository.findByIp(ip);
        if (visitor == null){
            visitor = new Visitor();
            visitor.setIp(ip);
            visitor.setTimes(1);
        }else {
            visitor.setTimes(visitor.getTimes()+1);
        }
        repository.save(visitor);
        return "I have benn seen ip"+visitor.getIp()+" "+visitor.getTimes()+" times.";
    }
}
