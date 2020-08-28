package com.example.app.entity

open class User {
    var username: String? = null
    var password: String? = null
    var code: String? = null

    constructor() {}
    constructor(username: String, password: String, code: String) {
        this.username = username
        this.password = password
        this.code = code
    }

}