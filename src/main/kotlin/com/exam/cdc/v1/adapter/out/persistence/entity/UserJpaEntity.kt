package com.exam.cdc.v1.adapter.out.persistence.entity

import com.exam.cdc.v1.adapter.out.persistence.valueobject.AddressJpaVo
import jakarta.persistence.*

@Entity
@Table(name = "users")
class UserJpaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val userName: String,
    @Embedded
    val address: AddressJpaVo
) {
}