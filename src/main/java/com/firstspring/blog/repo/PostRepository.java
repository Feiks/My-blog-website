package com.firstspring.blog.repo;

import com.firstspring.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {



}
