package com.zzc.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 选拔男生
 * 实现Criteria接口
 */
public class CriteriaMale implements Criteria{
    /**
     * 找出男生
     * @param filterPersonList filterPersonList
     * @return List<FilterPerson>
     */
    @Override
    public List<FilterPerson> meetCriteria(List<FilterPerson> filterPersonList) {
        List<FilterPerson> malePersons = new ArrayList<>();
        for (FilterPerson person : filterPersonList) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
