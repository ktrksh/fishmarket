package com.example.fishmarket.controller;

import com.example.fishmarket.model.FishListing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FishListingController {

    private List<FishListing> listings = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("listings", listings);
        return "index"; // index.html を表示
    }

    @GetMapping("/new")
    public String newListing(Model model) {
        model.addAttribute("fishListing", new FishListing());
        return "new_listing"; // new_listing.html を表示
    }

    @PostMapping("/listings")
    public String createListing(@ModelAttribute FishListing fishListing) {
        listings.add(fishListing);
        return "redirect:/"; // トップページにリダイレクト
    }
}