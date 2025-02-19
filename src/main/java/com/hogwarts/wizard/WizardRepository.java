package com.hogwarts.wizard;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WizardRepository extends JpaRepository<Wizard,Integer> {
}
