package com.web.SearchWeb.main.controller;


import com.web.SearchWeb.main.domain.Website;
import com.web.SearchWeb.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
/*@RequestMapping("/customer")*/
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    /**
     *  메인 페이지
     */
    @GetMapping("/mainList")
    public String mainList(Model model){
        List<Website> list = mainService.getList();
        System.out.println("list = " + list);

        model.addAttribute("list", list);
        return "main/mainList";
    }



}