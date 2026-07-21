package com.agv.act4_t4.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

@Data
public class LoginRequest {

    @NotBlank(message = "El usuario no puede estar vacío")
    @JsonProperty("usuario")
    private String username;
    
    @NotBlank(message = "La contraseña no puede estar vacía")
    @JsonProperty("contrasena")
    private String password;
}