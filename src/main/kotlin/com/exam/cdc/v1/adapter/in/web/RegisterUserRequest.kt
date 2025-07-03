package com.exam.cdc.v1.adapter.`in`.web

import com.exam.cdc.v1.domain.valueobject.Address
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class RegisterUserRequest(
    @field:NotBlank(message = "사용자의 이름을 입력해주세요")
    val userName: String,
    @field:NotNull(message = "주소를 입력해주세요")
    val address: Address
) {
}