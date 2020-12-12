package com.tutorial.SimpleCrud.services.impl

import com.tutorial.SimpleCrud.models.User
import com.tutorial.SimpleCrud.repositories.UserRepository
import com.tutorial.SimpleCrud.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
data class UserServiceImpl(@Autowired val userRepository: UserRepository) : UserService {
    override fun index(): List<User> {
        return userRepository.findAll()
    }

    override fun show(id: String): User {
        return userRepository.getOne(id)
    }

    override fun save(user: User): User {
        return userRepository.save(user)
    }

    override fun update(user: User, id: String): User {
        var edit: User = userRepository.getOne(id)
        edit.address = user.address
        edit.age = user.age

        return userRepository.save(edit)
    }

    override fun delete(id: String) {
        userRepository.delete(userRepository.getOne(id))
    }

}
