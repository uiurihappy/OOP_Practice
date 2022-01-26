package com.codepresso.blog.post;

public class BlogPost extends Post {

    String title;
    String username;

    public BlogPost(String title,String content, String username) {
        super(content);
        this.title = title;
        this.username = username;
    }
    public void save(Post post) {
        System.out.println("Saving title, username to database...");
    }

    public String toString() {
        return "\n Title: " + title +
                "\n Content: " + content +
                "\n UserName: " + username;
    }
}
