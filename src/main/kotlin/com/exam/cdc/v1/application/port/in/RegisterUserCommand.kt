package com.exam.cdc.v1.application.port.`in`

import com.exam.cdc.v1.domain.valueobject.Address

data class RegisterUserCommand(
    val userName: String,
    val address: Address
) {
}