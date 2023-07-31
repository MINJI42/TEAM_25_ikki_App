package com.example.team_25_ikki_app

data class Message(
    val senderId: String,
    val senderNickname: String,
    val content: String,
    val timestamp: Long
)
