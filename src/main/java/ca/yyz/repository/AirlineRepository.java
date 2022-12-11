package ca.yyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import ca.yyz.model.Airline;

@CrossOrigin(origins = { "http://localhost:4200", "https://ambitious-ground-0244a4410.2.azurestaticapps.net" })
public interface AirlineRepository extends JpaRepository<Airline, Integer> {

}