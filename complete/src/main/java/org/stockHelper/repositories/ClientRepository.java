package org.stockHelper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stockHelper.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
