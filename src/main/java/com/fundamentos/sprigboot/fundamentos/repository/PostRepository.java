package com.fundamentos.sprigboot.fundamentos.repository;

import com.fundamentos.sprigboot.fundamentos.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
