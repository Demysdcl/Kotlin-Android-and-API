package com.stixu.security.controller

import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject
import com.stixu.security.RoleRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.data.domain.Page
import com.stixu.domain.Role
import org.springframework.data.domain.PageRequest
import com.stixu.commons.PageQuery

/**
 * 角色控制器
 */
@RestController
@RequestMapping("/security/role")
class RoleController @Inject constructor(val roleDao: RoleRepository){
    
    @RequestMapping("/query")
    fun findAll(pr: RoleQuery): Page<Role> {
        return roleDao.findAll(pr.toPager());
    }
    
}

class RoleQuery: PageQuery<Role>() {
    
    override fun buildQuery(): Role {
        return Role()
    }
}