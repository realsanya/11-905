package ru.kpfu.itis.demo.blog.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private Role role;
    private State state;
    public enum Role {
        USER, ADMIN
    }
    public enum State {
        ACTIVE, BANNED
    }
}
