package com.zzc.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 选拔女生
 * 实现Criteria接口
 */
public class CriteriaFemale implements Criteria{
    /**
     * 找出女生
     * @param filterPersonList filterPersonList
     * @return List<FilterPerson>
     */
    @Override
    public List<FilterPerson> meetCriteria(List<FilterPerson> filterPersonList) {
        List<FilterPerson> femalePersons = new ArrayList<>();
        for (FilterPerson person : filterPersonList) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
