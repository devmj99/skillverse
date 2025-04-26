package com.abdullah.skillverse.service;

import com.abdullah.skillverse.model.post;

import java.util.List;

public interface postService {
    post savepost(post post);
    List<post> getAllposts();
    post getPostById(int id);
    String updatePost(int id, post updatedPost);
    String deletePost(int id);
}
