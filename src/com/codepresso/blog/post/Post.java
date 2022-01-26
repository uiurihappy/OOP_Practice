package com.codepresso.blog.post;

import com.codepresso.blog.manager.PostManager;

public class Post extends PostManager {
    protected String content;
    protected String username;
    protected String title;


    public Post(){

    }

    public Post(String content){
        this.content = content;
    }

    public void save() {
        System.out.println("Saving content to database...");
    }

    public String toString() {
        return "\n Content: " + content;
    }
}