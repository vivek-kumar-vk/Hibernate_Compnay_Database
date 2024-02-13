package org.hibernate.HIbernateProject_CompnayDataBase_NativeQuery;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Company {
	@Id
	private int companyId;
	private String companyName;
	private String headQuaterLocation;
	private int noOfBranches;
	private String companyType;
	private int totalNumberOfEmployee;
	private String companyCEO;

	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getHeadQuaterLocation() {
		return headQuaterLocation;
	}
	public void setHeadQuaterLocation(String headQuaterLocation) {
		this.headQuaterLocation = headQuaterLocation;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public int getTotalNumberOfEmployee() {
		return totalNumberOfEmployee;
	}
	public void setTotalNumberOfEmployee(int totalNumberOfEmployee) {
		this.totalNumberOfEmployee = totalNumberOfEmployee;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", headQuaterLocation="
				+ headQuaterLocation + ", noOfBranches=" + noOfBranches + ", companyType=" + companyType
				+ ", totalNumberOfEmployee=" + totalNumberOfEmployee + ", companyCEO=" + companyCEO + "]";
	}

}
