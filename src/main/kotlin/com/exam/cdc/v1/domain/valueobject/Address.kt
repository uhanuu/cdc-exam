package com.exam.cdc.v1.domain.valueobject

data class Address(
    val streetAddress: String,
    val detailAddress: String,
    val city: String,
    val zipCode: String
)