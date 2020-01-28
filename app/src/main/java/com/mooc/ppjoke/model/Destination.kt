package com.mooc.ppjoke.model

data class Destination(
    var asStarter: Boolean,
    var clazName: String,
    var id: Int,
    var isFragment: Boolean,
    var needLogin: Boolean,
    var pageUrl: String
)