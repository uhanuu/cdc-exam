package com.exam.cdc.v1.domain.valueobject

import org.springframework.util.Assert

data class UserName(
    val userName: String
) {
    init {
        Assert.hasText(userName, "사용자 이름을 입력해주세요.")
    }
}