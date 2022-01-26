package com.codepresso.blog.post;

public class SimplePost extends Post{

    String content;
    String username;

    public SimplePost(String content, String username) {
        super(content);
        this.content = content;
        this.username = username;
    }
    public void save(Post post) {
        System.out.println("Saving content, username to database...");
    }

    public String toString() {
        return "\n Content: " + content +
                "\n UserName: " + username;
    }

}
