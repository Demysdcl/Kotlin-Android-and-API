package com.stixu

import org.springframework.stereotype.Service
import javax.inject.Inject

@Service
class LoginService @Inject constructor(val loginDao: LoginDao) {
    
    fun create(): String {
        return loginDao.create()
    }
}