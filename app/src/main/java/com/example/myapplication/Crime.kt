package com.example.myapplication

import java.util.*

data class Crime(@PrimaryKey var id: UUID = UUID.randomUUID()) {
    var title:String = ""
    var date: Date? = null
    var isSolved: Boolean? = null
    var requiresPolice: Int?=0
    constructor(id: UUID, title: String, date: Date, isSolved:Boolean, requiresPolice:Int):this() {
        this.title = title
        this.date = date
        this.id = id
        this.isSolved=isSolved
        this.requiresPolice=requiresPolice
    }
}
annotation class PrimaryKey
