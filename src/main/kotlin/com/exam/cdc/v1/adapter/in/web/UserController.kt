package com.exam.cdc.v1.adapter.`in`.web

import com.exam.cdc.common.hexagonal.WebAdapter
import com.exam.cdc.v1.application.port.`in`.RegisterUserCommand
import com.exam.cdc.v1.application.port.`in`.RegisterUserUseCase
import com.exam.cdc.v1.domain.model.User
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
@RequestMapping("/api/v1")
class UserController(
    private val registerUserUseCase: RegisterUserUseCase
) {

    @PostMapping("/users")
    fun createUser(
        @Validated @RequestBody request: RegisterUserRequest
    ): ResponseEntity<User> {
        val command = RegisterUserCommand(request.userName, request.address)
        return ResponseEntity.ok(registerUserUseCase.registerUser(command))
    }
}