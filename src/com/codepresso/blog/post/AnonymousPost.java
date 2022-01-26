package com.codepresso.blog.post;

public class AnonymousPost extends Post {

    String title;
    String content;

    public AnonymousPost(String title, String content) {
        super(content);
        this.title = title;
        this.content = content;
    }
    public void save(Post post) {
        System.out.println("Saving title, content to database...");
    }

    public String toString() {
        return "\n Title: " + title +
                "\n Content: " + content;
    }

}
