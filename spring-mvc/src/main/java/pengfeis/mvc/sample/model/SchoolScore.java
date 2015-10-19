package pengfeis.mvc.sample.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "school_scores", schema = "", catalog = "dev")
public class SchoolScore {
    private Integer id;
    private Integer schoolCode;
    private String schoolName;
    private Integer planNum;
    private Integer realNum;
    private Integer enrollNum;
    private Integer minimumScore;
    private String chineseLanguage;
    private String mathScore;
    private String foreignLanguageScore;
    private Integer year;
    private Integer maximumScore;
    private Float averageEnrollScore;
    private String provinceName;
    private Integer artOrScienceInd;
    private Integer enrollBatchNum;
    private Timestamp updateTime;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "院校代号", nullable = false, insertable = true, updatable = true)
    public Integer getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(Integer schoolCode) {
        this.schoolCode = schoolCode;
    }

    @Basic
    @Column(name = "院校名称", nullable = true, insertable = true, updatable = true, length = 50)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "计划人数", nullable = true, insertable = true, updatable = true)
    public Integer getPlanNum() {
        return planNum;
    }

    public void setPlanNum(Integer planNum) {
        this.planNum = planNum;
    }

    @Basic
    @Column(name = "实际投档人数", nullable = true, insertable = true, updatable = true)
    public Integer getRealNum() {
        return realNum;
    }

    public void setRealNum(Integer realNum) {
        this.realNum = realNum;
    }

    @Basic
    @Column(name = "录取人数", nullable = true, insertable = true, updatable = true)
    public Integer getEnrollNum() {
        return enrollNum;
    }

    public void setEnrollNum(Integer enrollNum) {
        this.enrollNum = enrollNum;
    }

    @Basic
    @Column(name = "最低分", nullable = true, insertable = true, updatable = true)
    public Integer getMinimumScore() {
        return minimumScore;
    }

    public void setMinimumScore(Integer minimumScore) {
        this.minimumScore = minimumScore;
    }

    @Basic
    @Column(name = "语文", nullable = true, insertable = true, updatable = true, length = 5)
    public String getChineseLanguage() {
        return chineseLanguage;
    }

    public void setChineseLanguage(String chinesLanguage) {
        this.chineseLanguage = chinesLanguage;
    }

    @Basic
    @Column(name = "数学", nullable = true, insertable = true, updatable = true, length = 5)
    public String getMathScore() {
        return mathScore;
    }

    public void setMathScore(String mathScore) {
        this.mathScore = mathScore;
    }

    @Basic
    @Column(name = "外语", nullable = true, insertable = true, updatable = true, length = 5)
    public String getForeignLanguageScore() {
        return foreignLanguageScore;
    }

    public void setForeignLanguageScore(String foreignLanguage) {
        this.foreignLanguageScore = foreignLanguage;
    }

    @Basic
    @Column(name = "年份", nullable = false, insertable = true, updatable = true)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "录取最高分", nullable = true, insertable = true, updatable = true)
    public Integer getMaximumScore() {
        return maximumScore;
    }

    public void setMaximumScore(Integer maximumScore) {
        this.maximumScore = maximumScore;
    }

    @Basic
    @Column(name = "平均分", nullable = true, insertable = true, updatable = true, precision = 0)
    public Float getAverageEnrollScore() {
        return averageEnrollScore;
    }

    public void setAverageEnrollScore(Float averageEnrollScore) {
        this.averageEnrollScore = averageEnrollScore;
    }

    @Basic
    @Column(name = "省份", nullable = true, insertable = true, updatable = true, length = 5)
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Basic
    @Column(name = "科别", nullable = false, insertable = true, updatable = true)
    public Integer getArtOrScienceInd() {
        return artOrScienceInd;
    }

    public void setArtOrScienceInd(Integer artOrScienceInd) {
        this.artOrScienceInd = artOrScienceInd;
    }

    @Basic
    @Column(name = "批次", nullable = false, insertable = true, updatable = true)
    public Integer getEnrollBatchNum() {
        return enrollBatchNum;
    }

    public void setEnrollBatchNum(Integer enrollBatch) {
        this.enrollBatchNum = enrollBatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchoolScore that = (SchoolScore) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (schoolCode != null ? !schoolCode.equals(that.schoolCode) : that.schoolCode != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (planNum != null ? !planNum.equals(that.planNum) : that.planNum != null) return false;
        if (realNum != null ? !realNum.equals(that.realNum) : that.realNum != null) return false;
        if (enrollNum != null ? !enrollNum.equals(that.enrollNum) : that.enrollNum != null) return false;
        if (minimumScore != null ? !minimumScore.equals(that.minimumScore) : that.minimumScore != null) return false;
        if (chineseLanguage != null ? !chineseLanguage.equals(that.chineseLanguage) : that.chineseLanguage != null) return false;
        if (mathScore != null ? !mathScore.equals(that.mathScore) : that.mathScore != null) return false;
        if (foreignLanguageScore != null ? !foreignLanguageScore.equals(that.foreignLanguageScore) : that.foreignLanguageScore != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (maximumScore != null ? !maximumScore.equals(that.maximumScore) : that.maximumScore != null) return false;
        if (averageEnrollScore != null ? !averageEnrollScore.equals(that.averageEnrollScore) : that.averageEnrollScore != null) return false;
        if (provinceName != null ? !provinceName.equals(that.provinceName) : that.provinceName != null) return false;
        if (artOrScienceInd != null ? !artOrScienceInd.equals(that.artOrScienceInd) : that.artOrScienceInd != null) return false;
        if (enrollBatchNum != null ? !enrollBatchNum.equals(that.enrollBatchNum) : that.enrollBatchNum != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (schoolCode != null ? schoolCode.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (planNum != null ? planNum.hashCode() : 0);
        result = 31 * result + (realNum != null ? realNum.hashCode() : 0);
        result = 31 * result + (enrollNum != null ? enrollNum.hashCode() : 0);
        result = 31 * result + (minimumScore != null ? minimumScore.hashCode() : 0);
        result = 31 * result + (chineseLanguage != null ? chineseLanguage.hashCode() : 0);
        result = 31 * result + (mathScore != null ? mathScore.hashCode() : 0);
        result = 31 * result + (foreignLanguageScore != null ? foreignLanguageScore.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (maximumScore != null ? maximumScore.hashCode() : 0);
        result = 31 * result + (averageEnrollScore != null ? averageEnrollScore.hashCode() : 0);
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        result = 31 * result + (artOrScienceInd != null ? artOrScienceInd.hashCode() : 0);
        result = 31 * result + (enrollBatchNum != null ? enrollBatchNum.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
