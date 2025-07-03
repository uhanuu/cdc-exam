package com.exam.cdc.v1.application.port.`in`

import com.exam.cdc.v1.domain.model.User

interface RegisterUserUseCase {
    fun registerUser(command: RegisterUserCommand): User
}