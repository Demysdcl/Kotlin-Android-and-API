package com.stixu.commons

import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.PagingAndSortingRepository
import java.io.Serializable

@NoRepositoryBean
interface GenericDao<E, ID:Serializable>: PagingAndSortingRepository<E, ID> {
    
    /**
     * 根据主键获取对象
     * @param id 主键
     * @return E
     */
    fun findById(id: ID): E
}