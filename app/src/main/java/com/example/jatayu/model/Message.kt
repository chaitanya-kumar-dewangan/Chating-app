package com.example.jatayu.model

data class Message(
    val id: String = "",
    val senderId: String = "",
    val message: String? = "",
    val createdAt: Double = System.currentTimeMillis().toDouble(),
    val senderName: String = "",
    val senderImage: String? = null,
    val imageUrl: String? = null
)
