package com.bitsinbinary.bib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bitsinbinary.bib.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
