package com.hogwarts.artifact.dto;

import com.hogwarts.wizard.dto.WizardDto;
import jakarta.validation.constraints.NotEmpty;

public record ArtifactDto(String id,
                          @NotEmpty(message = "Name is required.")
                          String name,

                          @NotEmpty(message = "description is required.")
                          String description,

                          @NotEmpty(message = "Url is required")
                          String imageUrl,

                          WizardDto owner) {
}
