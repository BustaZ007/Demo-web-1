package com.example.demoweb.Service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<>();

    {
        posts.add(new Post((long) 0, "First post", new Date()));
        posts.add(new Post((long) 1, "Second post", new Date()));
        posts.add(new Post((long) 2, "Third post", new Date()));
        posts.add(new Post((long) 3, "Fourth post", new Date()));
    }

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }

}
