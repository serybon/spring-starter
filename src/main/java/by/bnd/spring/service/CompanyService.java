package by.bnd.spring.service;

import by.bnd.spring.database.entity.Company;
import by.bnd.spring.database.repository.CompanyRepository;
import by.bnd.spring.dto.CompanyReadDto;
import by.bnd.spring.listener.AccessType;
import by.bnd.spring.listener.EntityEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final ApplicationEventPublisher eventPublisher;

    public CompanyService(CompanyRepository companyRepository, ApplicationEventPublisher eventPublisher) {
        this.companyRepository = companyRepository;
        this.eventPublisher = eventPublisher;
    }

    public Optional<CompanyReadDto> findById(Integer id){
        System.out.println("Company repository findById method called");
        return companyRepository.findById(id).map(entity -> {
            eventPublisher.publishEvent(new EntityEvent(entity, AccessType.DELETE));
            return new CompanyReadDto(entity.getId());
        });
    }


}
