package controller;

import bean.City;
import mapper.CityMapper;
import net.sf.json.JSONArray;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@org.springframework.stereotype.Controller
public class CityInfo {

    @RequestMapping(value="/china/{id}", method = RequestMethod.GET)
    public String getCity(@PathVariable("id") Integer id, Model model){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CityMapper cityMapper = (CityMapper) applicationContext.getBean("cityMapper");
        List<City> p = cityMapper.getCity(id);
        String json = JSONArray.fromObject(p).toString();
        System.out.println(1);
        model.addAttribute("message",json);
        return "/index";
    }
}
