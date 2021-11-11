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
    private Integer CaseNo;
    private  String Branch;
    private String ReportingMethod;
    private String Date;
    private String Time;
    private String Category;
    private String SubCategory;
    private  String Priority;
    private String Nature;
    private String CaseManager;
    private String CaseReporter;
    private String CaseStatus;

    public User() {
    }

    public User(Integer caseNo, String branch, String reportingMethod, String date, String time, String category, String subCategory, String priority, String nature, String caseManager, String caseReporter, String caseStatus) {
        CaseNo = caseNo;
        Branch = branch;
        ReportingMethod = reportingMethod;
        Date = date;
        Time = time;
        Category = category;
        SubCategory = subCategory;
        Priority = priority;
        Nature = nature;
        CaseManager = caseManager;
        CaseReporter = caseReporter;
        CaseStatus = caseStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCaseNo() {
        return CaseNo;
    }

    public void setCaseNo(Integer caseNo) {
        CaseNo = caseNo;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getReportingMethod() {
        return ReportingMethod;
    }

    public void setReportingMethod(String reportingMethod) {
        ReportingMethod = reportingMethod;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSubCategory() {
        return SubCategory;
    }

    public void setSubCategory(String subCategory) {
        SubCategory = subCategory;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getNature() {
        return Nature;
    }

    public void setNature(String nature) {
        Nature = nature;
    }

    public String getCaseManager() {
        return CaseManager;
    }

    public void setCaseManager(String caseManager) {
        CaseManager = caseManager;
    }

    public String getCaseReporter() {
        return CaseReporter;
    }

    public void setCaseReporter(String caseReporter) {
        CaseReporter = caseReporter;
    }

    public String getCaseStatus() {
        return CaseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        CaseStatus = caseStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", CaseNo=" + CaseNo +
                ", Branch='" + Branch + '\'' +
                ", ReportingMethod='" + ReportingMethod + '\'' +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", Category='" + Category + '\'' +
                ", SubCategory='" + SubCategory + '\'' +
                ", Priority='" + Priority + '\'' +
                ", Nature='" + Nature + '\'' +
                ", CaseManager='" + CaseManager + '\'' +
                ", CaseReporter='" + CaseReporter + '\'' +
                ", CaseStatus='" + CaseStatus + '\'' +
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
