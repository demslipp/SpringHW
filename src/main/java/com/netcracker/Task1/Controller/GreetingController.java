package com.netcracker.Task1.Controller;

import com.netcracker.Task1.Model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

@Controller
public class GreetingController{


    @GetMapping("/greeting")

    public String greetingForm(@Valid Model model){

        model.addAttribute("greeting", delegate(new Greeting()));
        return "greeting";
    }

    private Greeting delegate(@Valid Greeting greeting){
        if(greeting.getSurname()==""){

        }
        return greeting;
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@Valid @ModelAttribute Greeting greeting) throws IOException{
        try {
            addToFile(greeting.toString());
        } catch (FileNotFoundException e) {
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
