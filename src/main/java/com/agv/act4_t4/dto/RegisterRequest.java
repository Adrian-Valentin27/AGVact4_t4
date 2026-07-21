package com.agv.act4_t4.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
public class RegisterRequest {
    
    @NotBlank(message = "El usuario no puede estar vacío")
    @Size(min = 4, max = 20, message = "El usuario debe tener entre 4 y 20 caracteres")
    @JsonProperty("usuario")
    private String username;
    
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(min = 6, message = "La contraseña debe tener al menos 6 caracteres")
    @JsonProperty("contrasena")
    private String password;
    
    @NotBlank(message = "El correo no puede estar vacío")
    @Email(message = "El formato del correo no es válido")
    @JsonProperty("correo")
    private String email;
}