package com.stixu.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import org.hibernate.annotations.GenericGenerator
import javax.persistence.GeneratedValue
import javax.persistence.Table
import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * 角色管理，承担权限中的角色类
 * 
 */
@Entity
@Table(name="T_SECURITY_ROLE")
data class Role(
    
    //  主键
    @Id@Column(name="PK", length=40)
    @GenericGenerator(name="system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator="system-uuid")
    var id: String = "",
    
    //  名称
    @Column(name="ROLE_NAME", length=40)
    var name: String = ""
    
    ) {
    
    //  备注信息
    @Column(name="ROLE_REMARKS", length=1000)
    @JsonIgnore
    lateinit var remarks:String
}