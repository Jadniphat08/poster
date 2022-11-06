package org.itsci.lab08.controller;

import org.itsci.lab08.model.Trainee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/show-form")
    public String showForm() {
        return "hello-form";
    }
    @PostMapping("/process-form")
    public String processForm(@ModelAttribute("student") Trainee trainee, Model
            model) {
        model.addAttribute("trainee", trainee);
        model.addAttribute("title", title + " - รายละเอียด");
        return "register/view";
    }
    @RequestMapping("/process-form")
    public String processForm(
            @RequestParam("studentName") String theName, Model model) {
        model.addAttribute("message", "Hello, " + theName);
        return "hello-result";
    }
}
