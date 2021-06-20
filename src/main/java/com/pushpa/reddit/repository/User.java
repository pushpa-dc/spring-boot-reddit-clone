package com.pushpa.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User extends JpaRepository<com.pushpa.reddit.model.User, Long> {
}
