package controller;

import bean.Province;
import mapper.ProvinceMapper;
import net.sf.json.JSONArray;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@org.springframework.stereotype.Controller
public class ProvinceInfo {
//    @RequestMapping(value="/china")
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView mav = new ModelAndView("index");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ProvinceMapper provinceMapper = (ProvinceMapper) applicationContext.getBean("provinceMapper");
//        List<Province> p = provinceMapper.getProvince();
//        System.out.println(p);
//        String json = JSONArray.fromObject(p).toString();
//        mav.addObject("message", json);
//        return mav;
//    }
        @RequestMapping(value="/china")
        @ResponseBody
        public List<Province> getProvince() throws Exception {
            // ModelAndView mav = new ModelAndView("index");
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            ProvinceMapper provinceMapper = (ProvinceMapper) applicationContext.getBean("provinceMapper");
            List<Province> p = provinceMapper.getProvince();

            String json = JSONArray.fromObject(p).toString();
//            mav.addObject("message", json);
            System.out.println(json);
            return p;
        }
}
