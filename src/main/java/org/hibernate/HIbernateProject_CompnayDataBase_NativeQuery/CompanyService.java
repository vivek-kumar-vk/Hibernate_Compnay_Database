package org.hibernate.HIbernateProject_CompnayDataBase_NativeQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class CompanyService {
	public Session session() {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Company.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}

	public void addCompany(Company c) {
		Session session = session();
		Transaction transaction = session.beginTransaction();

		session.save(c);

		transaction.commit();
		session.close();

	}
	public List<Company> findCompanyById(int companyId) {
		Session session = session();
		Transaction transaction = session.beginTransaction();

		String query = "SELECT * FROM Company WHERE companyId = :companyId";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query , Company.class);
		nativeQuery.setParameter("companyId", companyId);
		List<Company>companies = nativeQuery.list();

		transaction.commit();
		session.close();

		return companies;

	}
	public List<Company> findCompanyByName(String companyName){
		Session session = session();
		Transaction transaction = session.beginTransaction();

		String  query = "SELECT * FROM Company WHERE companyName = :companyName";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query, Company.class);
		nativeQuery.setParameter("companyName", companyName);
		List<Company> companies = nativeQuery.list();
		transaction.commit();
		session.close();

		return companies;
	}
	public List<Company> findCompanyByCEO(String companyCEO){
		Session session = session();
		Transaction transaction = session.beginTransaction();

		String  query = "SELECT * FROM Company WHERE companyCEO = :companyCEO";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query, Company.class);
		nativeQuery.setParameter("companyCEO", companyCEO);
		List<Company> companies = nativeQuery.list();
		transaction.commit();
		session.close();

		return companies;
	}
	public List<Company> findAllcompanyType(String companyType){
		Session session = session();
		Transaction transaction = session.beginTransaction();

		String  query = "SELECT * FROM Company WHERE companyType = :companyType";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query, Company.class);
		nativeQuery.setParameter("companyType", companyType);
		List<Company> companies = nativeQuery.list();
		transaction.commit();
		session.close();

		return companies;
	}
	public void updateNoOfEmployeesById(int id , int empNo) {
		Session session = session();
		Transaction transaction = session.beginTransaction();
		
		String query = "UPDATE Company SET totalNumberOfEmployee = :noOfEmp WHERE companyId = :cId";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query, Company.class);
		nativeQuery.setParameter("noOfEmp", empNo);
		nativeQuery.setParameter("cId", id);
		int res= nativeQuery.executeUpdate();
		
		System.out.println(res);
		transaction.commit();
		session.close();

	}
	public void updateNoOfBranchesByName(String companyName , int noOfBranches) {
		Session session = session();
		Transaction transaction = session.beginTransaction();
		
		String query = "UPDATE Company SET noOfBranches = :noOfBranches WHERE companyName = :companyName";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query, Company.class);
		nativeQuery.setParameter("noOfBranches", noOfBranches);
		nativeQuery.setParameter("companyName", companyName);
		int res= nativeQuery.executeUpdate();
		
		System.out.println(res);
		transaction.commit();
		session.close();

	}
	public void deleteCompanyByName(String companyName) {
		Session session = session();
		Transaction transaction = session.beginTransaction();
		String query = "DELETE FROM Company WHERE companyName = :companyName";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query, Company.class);
		nativeQuery.setParameter("companyName", companyName);
		int res= nativeQuery.executeUpdate();
		
		System.out.println(res);
		transaction.commit();
		session.close();

	}
	public void deleteCompanyByCompanyType(String companyType) {
		Session session = session();
		Transaction transaction = session.beginTransaction();
		String query = "DELETE FROM Company WHERE companyType = :companyType";
		NativeQuery<Company>nativeQuery = session.createNativeQuery(query, Company.class);
		nativeQuery.setParameter("companyType", companyType);
		int res= nativeQuery.executeUpdate();
		
		System.out.println(res);
		transaction.commit();
		session.close();

	}
}
