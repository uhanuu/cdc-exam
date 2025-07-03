package com.exam.cdc.v1.application.port.out

import com.exam.cdc.v1.application.port.`in`.RegisterUserCommand
import com.exam.cdc.v1.domain.model.User

interface RegisterUserPort {
    fun registerUser(command: RegisterUserCommand): User
}