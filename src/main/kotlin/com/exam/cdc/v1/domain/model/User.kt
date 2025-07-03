package com.exam.cdc.v1.domain.model

import com.exam.cdc.v1.domain.valueobject.Address
import com.exam.cdc.v1.domain.valueobject.UserName

class User(
    val userName: UserName,
    val address: Address
) {
}