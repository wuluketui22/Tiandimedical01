package com.whackon.witmed.dao.dictionary;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.system.dictionary.pojo.entity.DataDictionary;
import org.springframework.stereotype.Repository;

/**
 * <b>天地医疗信息平台 - 系统功能 - 数据字典 Dao层<b/>
 * @author yan
 * @date 2022/9/12
 */
@Repository
public interface DataDictionaryDao extends BaseMapper<DataDictionary> {
}
