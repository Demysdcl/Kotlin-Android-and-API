package com.stixu.commons

import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort.Direction

abstract class PageQuery<T> {
    
    constructor() {
        query = buildQuery()
    }
    
    //  当前页
    var curr: Int = 0
    get
    set
    
    //  当前页数
    var pageSize: Int = 10
    get
    set
    
    //  排序方向
    var dir: String = "DESC"
    get
    set
    
    // 排序字段
    var column:String = "id"
    get
    set
    
    // 需要查询的对象
    var query: T
    get
    set    
    
    abstract fun buildQuery(): T;
    
    fun toPager(): Pageable {
        val sort: Direction = if(dir.capitalize().equals("ASC"))
                        Direction.ASC 
                   else Direction.DESC
        return PageRequest(curr, pageSize, sort, column)
    }
}