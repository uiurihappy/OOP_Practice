package com.codepresso.blog.manager;

// 적잘한 import 추가 필요

import com.codepresso.blog.main.BlogSystem;
import com.codepresso.blog.post.AnonymousPost;
import com.codepresso.blog.post.BlogPost;
import com.codepresso.blog.post.Post;
import com.codepresso.blog.post.SimplePost;

import java.util.ArrayList;
import java.util.List;

public class PostManager {
    private List<Post> postList;

    protected String title;
    protected String content;
    protected String username;

    public PostManager() {
        // 코드 구현
        this.postList = new ArrayList<>();
    }

    public void writePost(Post post) {
        // 코드 구현
        // Post 및 Post를 상속받은 클래스들의 save 메소드 활용
        // postList에 새로운 객체 추가
        // 다형성을 활용
        post.save();
        postList.add(post);

    }

    public void printPosts() {
        // 코드 구현
        // Post 및 Post를 상속받은 클래스들의 toString 메소드 활용
        // 다형성을 활용
        for(Post post : postList){
            System.out.println(post.toString());
        }

    }

    public void deletePost(int index) {
        // 코드 구현
        postList.remove(index);
    }

    public int getNumberOfPosts() {
        // 코드 구현
        return postList.size();
    }
}
