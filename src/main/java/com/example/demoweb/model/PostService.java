package com.example.demoweb.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<>();

    {
        posts.add(new Post("First post", new Date()));
        posts.add(new Post("Second post", new Date()));
        posts.add(new Post("Third post", new Date()));
        posts.add(new Post("Fourth post", new Date()));
    }

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

}
