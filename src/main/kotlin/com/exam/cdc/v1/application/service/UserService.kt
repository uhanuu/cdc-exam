package com.exam.cdc.v1.application.service

import com.exam.cdc.common.hexagonal.UseCase
import com.exam.cdc.v1.application.port.`in`.RegisterUserCommand
import com.exam.cdc.v1.application.port.`in`.RegisterUserUseCase
import com.exam.cdc.v1.application.port.out.RegisterUserPort
import com.exam.cdc.v1.domain.model.User

@UseCase
class UserService(
  private val registerUserPort: RegisterUserPort
): RegisterUserUseCase {
    override fun registerUser(command: RegisterUserCommand): User {
        return registerUserPort.registerUser(command)
    }
}