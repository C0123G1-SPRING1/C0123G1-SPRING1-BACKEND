package com.example.back_end.repository;

import com.example.back_end.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface IPostsRepository extends JpaRepository<Posts,Long> {
    @Query(value = "select * from posts",nativeQuery = true)
    Page<Posts> getAll(Pageable pageable);
    @Modifying
    @Transactional
    @Query(value = "delete from posts where id = ?",nativeQuery = true)
    void delete( Long id);
    @Query(value = "select * from posts p join employees e on p.employee_id = e.id where p.id = ?",nativeQuery = true)
    Optional<Posts> findById(Long id);
    @Query(value = "select * from posts p join employees e on p.employee_id = e.id where p.title like %:name%",nativeQuery = true)
    List<Posts> findByName(String name);
}