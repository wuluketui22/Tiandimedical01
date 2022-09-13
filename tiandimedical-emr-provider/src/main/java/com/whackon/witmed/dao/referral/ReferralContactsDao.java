package com.whackon.witmed.dao.referral;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.emr.referral.pojo.entity.ReferralContacts;
import org.springframework.stereotype.Repository;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）联系人 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface ReferralContactsDao extends BaseMapper<ReferralContacts> {
}
