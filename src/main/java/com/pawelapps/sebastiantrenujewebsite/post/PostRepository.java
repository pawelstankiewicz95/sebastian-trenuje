package com.pawelapps.sebastiantrenujewebsite.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository<Post, Long> extends JpaRepository {
}
