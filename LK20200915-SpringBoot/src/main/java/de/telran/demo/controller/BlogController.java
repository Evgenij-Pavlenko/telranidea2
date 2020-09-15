package de.telran.demo.controller;

import de.telran.demo.BlogService;
import de.telran.demo.entity.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    private BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/api/posts")
    public void createBlogPost(@RequestBody BlogPost post) {
        blogService.createBlogPost(post);
    }

    @GetMapping("/api/posts")
    public List<BlogPost> getBlogPost(BlogPost post) {
        return blogService.getBlogPost();
    }

}
