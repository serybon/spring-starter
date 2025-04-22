package by.bnd.spring.database.repository;

import by.bnd.spring.database.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Optional;

@Repository
public class CompanyRepository {
    public Optional<Company> findById(Integer id) {
        System.out.println("Company repository findById method called");
        return Optional.of(new Company(id, null, Collections.emptyMap()));
    }
}
