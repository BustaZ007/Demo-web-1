package com.example.demoweb.model;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post[] listAllPosts(){
        return new Post[]{new Post("First post", 11),

                new Post("second post", 150),

                new Post("Third post.", 1000)};
    }
}
