package com._ideas.data_collector.repositories;

import com._ideas.data_collector.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {
}
