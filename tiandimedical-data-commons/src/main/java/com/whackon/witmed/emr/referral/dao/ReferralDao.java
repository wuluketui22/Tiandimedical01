package com.whackon.witmed.emr.referral.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.emr.referral.pojo.entity.Referral;
import org.springframework.stereotype.Repository;
/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）记录 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface ReferralDao extends BaseMapper<Referral> {
}
