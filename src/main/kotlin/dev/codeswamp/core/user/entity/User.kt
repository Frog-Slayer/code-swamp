package dev.codeswamp.core.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
data class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, unique = true)
    var email: String? = null,

    @Column(nullable = false, unique = true)
    var nickname: String? = null,

    var profileUrl: String? = null,

    @Column(nullable = false)
    var role: Role = Role.ROLE_GUEST,
)