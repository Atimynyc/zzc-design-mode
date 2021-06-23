package com.zzc.design.structure.filter;

import java.util.List;

/**
 * 过滤规则合并类，用于将两个规则进行与操作
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<FilterPerson> meetCriteria(List<FilterPerson> persons) {
        List<FilterPerson> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }

}
