package com.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {

	Client findByClientName(String clientName);

	List<Client> findByClientName(String string, String string2);

	List<Client> findByAllClientName(String string, String string2);

}
