package com.pb.demoparkapi.web.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class UsuarioCreateDTO {

    private String username;
    private String password;
}
