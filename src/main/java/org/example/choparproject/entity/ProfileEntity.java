package org.example.choparproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.choparproject.enums.ProfileRole;
import org.example.choparproject.enums.ProfileStatus;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "profile_entity")
@Setter
@Getter
public class ProfileEntity {
   // id(uuid),name, phone or email(un, not null), password, status,role,visible,created_date, birthDate(not null)
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "status", nullable = false)
    private ProfileStatus status;

    @Column(name = "role")
    private ProfileRole role;

    @Column(name = "visible")
    private Boolean visible;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;
}
