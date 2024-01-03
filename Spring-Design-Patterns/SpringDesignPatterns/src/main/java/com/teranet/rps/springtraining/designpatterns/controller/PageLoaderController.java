package com.teranet.rps.springtraining.designpatterns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class PageLoaderController {
    @RequestMapping("/")
    public String getIndexPage(){
        return "index.html";
    }
    @RequestMapping("home")
    public String getHomePage(){
        return "home.html";
    }
    @RequestMapping("result1")
    public String getOut(HttpServletRequest request){
        int p = Integer.parseInt(request.getParameter("firstNumber"));
        int q = Integer.parseInt(request.getParameter("secondNumber"));
        HttpSession session = request.getSession();
        session.setAttribute("num3",p*q);
        return "result.jsp";
    }

    @RequestMapping("result")
    public String getResult(@RequestParam("firstNumber")int p, @RequestParam("secondNumber")int q, HttpSession session){
        int result = p*q;
        session.setAttribute("num3",result);
        return "result.jsp";
    }
    @RequestMapping("result3")
    public ModelAndView getNewResult(@RequestParam("firstNumber")int a,@RequestParam("secondNumber")int b){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result.jsp");
        mv.addObject("result",a*b);
        return mv;
    }
}
