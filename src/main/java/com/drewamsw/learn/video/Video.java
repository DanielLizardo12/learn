package com.drewamsw.learn.video;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Daniel
 * @Date 23/04/2023
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Video {

    @Id
    private UUID id;
    private String name;
}
