package com.exam.cdc.v1.adapter.out.persistence

import com.exam.cdc.common.hexagonal.PersistenceAdapter
import com.exam.cdc.v1.adapter.out.persistence.entity.UserJpaEntity
import com.exam.cdc.v1.adapter.out.persistence.mapper.UserMapper
import com.exam.cdc.v1.adapter.out.persistence.repository.UserRepository
import com.exam.cdc.v1.adapter.out.persistence.valueobject.AddressJpaVo
import com.exam.cdc.v1.application.port.`in`.RegisterUserCommand
import com.exam.cdc.v1.application.port.out.RegisterUserPort
import com.exam.cdc.v1.domain.model.User

@PersistenceAdapter
class UserPersistenceAdapter(
    private val userRepository: UserRepository,
    private val userMapper: UserMapper
): RegisterUserPort {
    override fun registerUser(command: RegisterUserCommand): User {
        val (streetAddress, detailAddress, city, zipCode) = command.address
        val addressJpaVo = AddressJpaVo(
            streetAddress = streetAddress,
            detailAddress = detailAddress,
            city = city,
            zipCode = zipCode
        )
        val userJpaEntity = UserJpaEntity(
            userName = command.userName,
            address = addressJpaVo
        )

        val userEntity = userRepository.save(userJpaEntity)
        return userMapper.entityToDomain(userEntity)
    }

}