package com.exam.cdc.v1.adapter.out.persistence.mapper

import com.exam.cdc.v1.adapter.out.persistence.entity.UserJpaEntity
import com.exam.cdc.v1.domain.model.User
import com.exam.cdc.v1.domain.valueobject.Address
import com.exam.cdc.v1.domain.valueobject.UserName
import org.springframework.stereotype.Component

@Component
class UserMapper {
    fun entityToDomain(userJpaEntity: UserJpaEntity): User {
        val (streetAddress, detailAddress, city, zipCode) = userJpaEntity.address
        return User(
            userName = UserName(userJpaEntity.userName),
            address = Address(
                streetAddress = streetAddress,
                detailAddress = detailAddress,
                city = city,
                zipCode = zipCode
            )
        )
    }
}