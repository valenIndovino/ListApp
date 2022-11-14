package com.ort.listapp.domain.model

data class AuthResponse(
    val usuario: Usuario = Usuario(),
    val successMessage: String = "",
    val errorMessage: String = ""
)
