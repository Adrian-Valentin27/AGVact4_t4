package com.agv.act4_t4.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;

@Data
public class LoginRequest {
    
    @NotBlank(message = "El usuario no puede estar vacío")
    @JsonAlias({"username", "usuario"})
    private String usuario;
    
    @NotBlank(message = "La contraseña no puede estar vacía")
    @JsonAlias({"password", "contrasena"})
    private String contrasena;
}