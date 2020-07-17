package com.endriazizi.springredditclone.repository;

import com.endriazizi.springredditclone.model.Post;
import com.endriazizi.springredditclone.model.Subreddit;
import com.endriazizi.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}