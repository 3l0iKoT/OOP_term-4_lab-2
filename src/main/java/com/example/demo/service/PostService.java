package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    {
        posts.add(new Post((long) posts.size(), "Это первый пост! Привет!", new Date()));
        posts.add(new Post((long) posts.size(), "Я сдал комиссию по ООП!", new Date()));
        posts.add(new Post((long) posts.size(), "Как дела?", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }
}
