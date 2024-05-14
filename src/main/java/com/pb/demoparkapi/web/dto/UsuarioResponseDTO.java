package com.pb.demoparkapi.web.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioResponseDTO {

    private Long id;

    private String username;

    private String role;
}
