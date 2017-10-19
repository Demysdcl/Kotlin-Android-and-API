package com.stixu.security

import com.stixu.domain.Role
import org.springframework.stereotype.Repository
import com.stixu.commons.GenericDao

@Repository
interface RoleRepository: GenericDao<Role, String> {
}