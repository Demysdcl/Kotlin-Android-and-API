package com.iqmsoft.boot.vue

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
open class Book(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val author: String,
        val title: String,
        val publisher: String,
        val isbn: String,
        val publication: String,
        var user: String?
)