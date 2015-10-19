package pengfeis.mvc.sample.service;

import pengfeis.mvc.sample.model.SchoolScore;

import java.util.List;

public interface SchoolInfoService {
    List<SchoolScore> getSchoolScores();
    Boolean addSchoolScore(SchoolScore schoolScore);
    SchoolScore removeSchoolScores();
    Boolean saveSchoolScore(SchoolScore schoolScore);
}
