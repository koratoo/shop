package com.shop.controller;

import com.shop.entity.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.ItemDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/ex07")
    public String thymeleafExample07() {

        return "thymeleafEx/thymeleafEx07";
    }
}