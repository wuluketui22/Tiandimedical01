package com.whackon.witmed.dao.casesSummary;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.emr.casesSummary.pojo.entity.MedicalExpenses;
import org.springframework.stereotype.Repository;

/**
 * <b></b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Repository
public interface MedicalExpenseDao extends BaseMapper<MedicalExpenses> {
}
