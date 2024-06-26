package com.Prashanth.JobWave.company;


import org.springframework.stereotype.Service;

import java.util.List;


public interface CompanyService {
    List<Company> getAllCompanies();

    void createCompany(Company company);

    Company getCompanyById(Long id);

    boolean deleteCompanyById(Long id);

    boolean updateCompany(Long id, Company updatedCompany);
}
