package spring.example.petclinic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer caseNo;
    private  String branch;
    private Category category;
    private String reportingMethod;
    private String date;
    private String time;

    private SubCategory subCategory;
    private  Priority priority;
    private Nature nature;
    private CaseManager caseManager;
    private String caseReporter;
    private String caseStatus;

    public User() {
    }

    public User(Integer caseNo, String branch, Category category, String reportingMethod, String date, String time, SubCategory subCategory, Priority priority, Nature nature, CaseManager caseManager, String caseReporter, String caseStatus) {
        this.caseNo = caseNo;
        this.branch = branch;
        this.category = category;
        this.reportingMethod = reportingMethod;
        this.date = date;
        this.time = time;
        this.subCategory = subCategory;
        this.priority = priority;
        this.nature = nature;
        this.caseManager = caseManager;
        this.caseReporter = caseReporter;
        this.caseStatus = caseStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(Integer caseNo) {
        this.caseNo = caseNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getReportingMethod() {
        return reportingMethod;
    }

    public void setReportingMethod(String reportingMethod) {
        this.reportingMethod = reportingMethod;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public CaseManager getCaseManager() {
        return caseManager;
    }

    public void setCaseManager(CaseManager caseManager) {
        this.caseManager = caseManager;
    }

    public String getCaseReporter() {
        return caseReporter;
    }

    public void setCaseReporter(String caseReporter) {
        this.caseReporter = caseReporter;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", caseNo=" + caseNo +
                ", branch='" + branch + '\'' +
                ", category=" + category +
                ", reportingMethod='" + reportingMethod + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", subCategory=" + subCategory +
                ", priority=" + priority +
                ", nature=" + nature +
                ", caseManager=" + caseManager +
                ", caseReporter='" + caseReporter + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.equals(user.id) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
