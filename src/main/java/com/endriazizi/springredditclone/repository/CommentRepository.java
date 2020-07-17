package com.endriazizi.springredditclone.repository;

import com.endriazizi.springredditclone.model.Comment;
import com.endriazizi.springredditclone.model.Post;
import com.endriazizi.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}