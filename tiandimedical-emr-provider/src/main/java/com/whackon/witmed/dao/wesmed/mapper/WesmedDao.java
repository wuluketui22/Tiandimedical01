package com.whackon.witmed.dao.wesmed.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.emr.wesmed.pojo.entity.Wesmed;
import org.springframework.stereotype.Repository;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 西医处方 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface WesmedDao extends BaseMapper<Wesmed> {
}
