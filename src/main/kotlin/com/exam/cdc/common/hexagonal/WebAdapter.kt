package com.exam.cdc.common.hexagonal

import org.springframework.core.annotation.AliasFor
import org.springframework.stereotype.Component

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
annotation class WebAdapter(
    /**
     * 논리적인 컴포넌트 이름을 제안할 수 있으며,
     * 컴포넌트 스캔 시 빈 이름으로 사용될 수 있습니다.
     */
    @get:AliasFor(annotation = Component::class)
    val value: String = ""
)
