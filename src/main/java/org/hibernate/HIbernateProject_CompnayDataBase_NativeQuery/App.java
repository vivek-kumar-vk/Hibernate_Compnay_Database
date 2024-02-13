package org.hibernate.HIbernateProject_CompnayDataBase_NativeQuery;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Company company = new Company();
        company.setCompanyId(101);
        company.setCompanyName("ATLASIAN");
        company.setHeadQuaterLocation("Bengaluru");
        company.setNoOfBranches(10);
        company.setCompanyType("IT");
        company.setTotalNumberOfEmployee(1001);
        company.setCompanyCEO("VIVEK KUMAR");
        
        CompanyService companyService = new CompanyService();
       companyService.addCompany(company);
        
       
       
    }
}
