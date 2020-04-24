package com.netcracker.Task1.controller;

import com.netcracker.Task1.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.FileWriter;
import java.io.IOException;

@Controller
public class GreetingController{

    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting){
        try {
            addToFile(greeting.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "result";
    }

    public void addToFile(String s)
            throws IOException{
        FileWriter writer=new FileWriter("src\\main\\resources\\templates\\Rez.txt", true);
        writer.write(s);
        writer.write("\n");
        writer.close();
    }

}
