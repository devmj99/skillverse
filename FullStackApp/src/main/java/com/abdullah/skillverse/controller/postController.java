package com.abdullah.skillverse.controller;

import com.abdullah.skillverse.model.post;
import com.abdullah.skillverse.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin
public class postController {

    @Autowired
    private postService postService;

    // Create a new post
    @PostMapping("/add")
    public String add(@RequestBody post post) {
        postService.savepost(post);
        return "New post is added";
    }

    // Read all posts
    @GetMapping("/getAll")
    public List<post> list() {
        return postService.getAllposts();
    }

    // Read post by ID
    @GetMapping("/{id}")
    public post getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }

    // Update a post
    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestBody post updatedPost) {
        return postService.updatePost(id, updatedPost);
    }

    // Delete a post
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return postService.deletePost(id);
    }
}
