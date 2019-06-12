package com.example.demo.com.example.contraller;

import com.example.Person;
import com.example.demo.service.EmaxpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ExampleContraller {
    @Autowired
    private EmaxpleService emaxpleService;

    @RequestMapping("/haha")
    public void helleo(HttpServletResponse response) throws IOException {
        response.sendRedirect("Index.html");
    }

    @RequestMapping("/hehe")
    public String hao(Person person){
        emaxpleService.insertPerson(person);
        return "提交成功";
    }
    @RequestMapping("/xixi")
    public String selectNmae(){
        return emaxpleService.selectName();
    }
}
