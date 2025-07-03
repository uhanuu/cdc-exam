package com.exam.cdc.v1.adapter.out.persistence.valueobject

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class AddressJpaVo(
    @Column(name = "street_address")
    val streetAddress: String,
    @Column(name = "detail_address")
    val detailAddress: String,
    @Column(name = "city")
    val city: String,
    @Column(name = "zip_code")
    val zipCode: String
)