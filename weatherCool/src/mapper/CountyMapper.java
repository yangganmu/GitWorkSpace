package mapper;

import bean.County;

import java.util.List;

public interface CountyMapper {
    public List<County> getCounty(Integer provinceid, Integer cityid);
}
