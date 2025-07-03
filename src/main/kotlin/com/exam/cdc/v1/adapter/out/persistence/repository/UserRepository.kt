package com.exam.cdc.v1.adapter.out.persistence.repository

import com.exam.cdc.v1.adapter.out.persistence.entity.UserJpaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserJpaEntity, Long> {
}