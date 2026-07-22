package com.agv.act4_t4.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
public class RegisterRequest {
    
    @NotBlank(message = "El usuario no puede estar vacío")
    @Size(min = 4, max = 20, message = "El usuario debe tener entre 4 y 20 caracteres")
    @JsonAlias({"username", "usuario"})
    private String usuario;
    
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(min = 6, message = "La contraseña debe tener al menos 6 caracteres")
    @JsonAlias({"password", "contrasena"})
    private String contrasena;
    
    @NotBlank(message = "El correo no puede estar vacío")
    @Email(message = "El formato del correo no es válido")
    @JsonAlias({"email", "correo"})
    private String correo;
}