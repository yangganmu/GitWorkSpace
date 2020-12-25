package controller;

import bean.County;
import mapper.CountyMapper;
import net.sf.json.JSONArray;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@org.springframework.stereotype.Controller
public class CountyInfo {
    @RequestMapping(value="china/{pid}/{cid}", method = RequestMethod.GET)
    public String getCity(@PathVariable("cid") Integer cid, @PathVariable("pid") Integer pid, Model model){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CountyMapper countyMapper = (CountyMapper) applicationContext.getBean("countyMapper");
        List<County> p = countyMapper.getCounty(pid,cid);
        String json = JSONArray.fromObject(p).toString();
        model.addAttribute("message",json);
        return "/index";
    }
}
