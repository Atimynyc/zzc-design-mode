package com.zzc.design.structure.filter;

import java.util.List;

/**
 * 选拔接口
 */
public interface Criteria {
    /**
     * 选拔人
     * @param filterPersonList filterPersonList
     * @return List<FilterPerson> 选拔结果
     */
    List<FilterPerson> meetCriteria(List<FilterPerson> filterPersonList);
}
