package com.abdullah.skillverse.repository;

import com.abdullah.skillverse.model.post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepository extends JpaRepository<post,Integer> {
}
