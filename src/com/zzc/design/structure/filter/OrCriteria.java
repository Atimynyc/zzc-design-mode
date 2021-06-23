package com.zzc.design.structure.filter;

import java.util.List;

/**
 * 将两个规则进行或操作
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<FilterPerson> meetCriteria(List<FilterPerson> persons) {
        List<FilterPerson> firstCriteriaItems = criteria.meetCriteria(persons);
        List<FilterPerson> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (FilterPerson person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }

}
