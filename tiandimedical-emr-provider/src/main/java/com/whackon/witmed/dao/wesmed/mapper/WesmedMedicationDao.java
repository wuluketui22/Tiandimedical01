package com.whackon.witmed.dao.wesmed.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.emr.wesmed.pojo.entity.WesmedMedication;
import org.springframework.stereotype.Repository;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 西医处方用药 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface WesmedMedicationDao extends BaseMapper<WesmedMedication> {
}
