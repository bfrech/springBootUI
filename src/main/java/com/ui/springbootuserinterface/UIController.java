package com.ui.springbootuserinterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UIController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("formInput", new FormInput());
        model.addAttribute("queryResults", new QueryResults());
        return "index";
    }

    @PostMapping("/")
    public String submitFormInput(@ModelAttribute FormInput input, Model model){
        model.addAttribute("formInput", input);
        System.out.println(input);
        return "index";
    }

    @PostMapping("/submit")
    public String showQueryResults(@ModelAttribute FormInput input, @ModelAttribute QueryResults queryResults, Model model){

        // wait here until results arrived
        Result res = new Result();
        res.setData("hello");
        res.setDataName("hi");
        res.setDate("hey");
        queryResults.addResult(res);

        model.addAttribute("formInput", input);
        model.addAttribute("queryResults", queryResults);
        return "index";
    }
}
