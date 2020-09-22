package de.telran.demo.service;

import de.telran.demo.entity.BlogPost;
import de.telran.demo.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private BlogPostRepository blogPostRepository;

    @Autowired
    public BlogService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public BlogPost createBlogPost(BlogPost post) {
        BlogPost savedPost = blogPostRepository.save(post);
        return savedPost;
    }

    public List<BlogPost> getBlogPost() {
        return blogPostRepository.findAll();
    }
}
