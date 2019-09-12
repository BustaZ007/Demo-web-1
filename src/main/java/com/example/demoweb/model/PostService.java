package com.example.demoweb.model;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    public Post[] listAllPosts(){
        return new Post[]{new Post("First post", new Date()),

                new Post("second post", new Date()),

                new Post("Third post.", new Date())};
    }
}
