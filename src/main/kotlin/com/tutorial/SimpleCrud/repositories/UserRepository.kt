package com.tutorial.SimpleCrud.repositories

import com.tutorial.SimpleCrud.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, String>
