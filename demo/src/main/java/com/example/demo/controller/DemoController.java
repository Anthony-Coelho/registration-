package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class DemoController
{
    @RequestMapping(value = "/register", method = RequestMethod.POST)
@GetMapping("/register")
public String registerUser(
        @RequestParam String firstName,
        @RequestParam String lastName,
        @RequestParam(defaultValue = "off") String rememberMe, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            printHeader(out);
            out.print("<h2>Welcome " + firstName + " " + lastName + "</h2>\n");
            if (rememberMe.equals("on")) {
                out.print("<h3>You will be remembered!</h3>");
}
            printFooter(out);
            return null;


    }

    private void printHeader(PrintWriter out){

    out.print("<DOCTYPE html>\n"
                + "<html>\n"
                +"<head>\n"
                +"<style>\n"
                +"h1{color:orangered;text-align: center;font-size: 50px;}"
                +"h2{color:orangered;text-align: center;font-size: 50px;}"
                +"h3{color:orangered;text-align: center;font-size: 50px;}"
                + "body{background-color: black;background-image: url(https://i.gifer.com/O7e8.gif);background-repeat: no-repeat;background-size: cover;}"
                + "img{display: block;margin-left: auto;margin-right: auto;width:220px; height:220px;margin-top: 240px}"
                +"</style>\n"
                +"<meta charset=\"UTF-8\">\n"
                +"</head>\n"
                +"<body>\n"
                +"<h1>Registration Successful!</h1>\n");
    }
    private void printFooter(PrintWriter out) {
        out.print("\n"
                    +"<img src=https://toughpigs.com/wp-content/uploads/2022/01/FIwKd7pXEAIlJZX-590x443.jpg>"
                    +"</body>\n"
                    +"</html>");
    }

    @GetMapping("/register_page")
    public String goRegister(){
    return "register";
}

}
