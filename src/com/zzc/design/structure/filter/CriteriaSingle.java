package com.zzc.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤单身
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<FilterPerson> meetCriteria(List<FilterPerson> filterPersonList) {
        List<FilterPerson> singlePersons = new ArrayList<>();
        for (FilterPerson person : filterPersonList) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
