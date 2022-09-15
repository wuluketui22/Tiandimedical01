package com.whackon.witmed.dao.casesSummary.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import com.whackon.witmed.emr.casesSummary.pojo.entity.Medication;
import org.springframework.stereotype.Repository;

/**
 * <b></b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Repository
public interface MedicationDao extends BaseMapper<Medication> {
}
