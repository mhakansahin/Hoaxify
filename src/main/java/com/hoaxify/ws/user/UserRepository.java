package com.hoaxify.ws.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<HoaxifyUser, Long> {
    HoaxifyUser findByUsername(String username);
}
