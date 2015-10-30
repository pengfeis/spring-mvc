package pengfeis.mvc.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pengfeis.mvc.sample.model.SchoolScore;
import pengfeis.mvc.sample.service.SchoolInfoService;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/gk")
public class SchoolInfoController {

    @Autowired
    private SchoolInfoService SchoolInfoService;

    @RequestMapping("/ss")
    public ModelAndView schoolScores() {
        List<SchoolScore> schoolScores = SchoolInfoService.getSchoolScores();
        ModelAndView modelAndView = new ModelAndView("schoolScores");
        modelAndView.addObject("schoolScores", schoolScores);
        return modelAndView;
    }

    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public String getShoolInfoByName(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date day, Model model){
        return "";
    }
}
