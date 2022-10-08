package sagar.springtutorial.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    private String name;
    private UUID id;
}
