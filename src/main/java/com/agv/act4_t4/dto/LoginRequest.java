package com.agv.act4_t4.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class LoginRequest {
    
    @NotBlank(message = "El usuario no puede estar vacío")
    private String usuario;
    
    @NotBlank(message = "La contraseña no puede estar vacía")
    private String contrasena;
}