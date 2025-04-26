package com.abdullah.skillverse.service;

import com.abdullah.skillverse.model.post;
import com.abdullah.skillverse.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class postServiceImpl implements postService {

    @Autowired
    private postRepository Repository;

    @Override
    public post savepost(post post) {
        post.setCreatedAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());
        return Repository.save(post);
    }

    @Override
    public List<post> getAllposts() {
        return Repository.findAll();
    }

    @Override
    public post getPostById(int id) {
        Optional<post> optionalPost = Repository.findById(id);
        return optionalPost.orElse(null);
    }

    @Override
    public String updatePost(int id, post updatedPost) {
        Optional<post> existingPostOpt = Repository.findById(id);
        if (existingPostOpt.isPresent()) {
            post existingPost = existingPostOpt.get();
            existingPost.setTitle(updatedPost.getTitle());
            existingPost.setContent(updatedPost.getContent());
            existingPost.setLike(updatedPost.getLike());
            existingPost.setComments(updatedPost.getComments());
            existingPost.setAuthor(updatedPost.getAuthor());
            existingPost.setCategory(updatedPost.getCategory());
            existingPost.setUpdatedAt(LocalDateTime.now());
            Repository.save(existingPost);
            return "Post updated successfully.";
        } else {
            return "Post not found.";
        }
    }

    @Override
    public String deletePost(int id) {
        if (Repository.existsById(id)) {
            Repository.deleteById(id);
            return "Post deleted successfully.";
        } else {
            return "Post not found.";
        }
    }
}
