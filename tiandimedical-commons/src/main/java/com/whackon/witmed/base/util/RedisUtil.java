package com.whackon.witmed.base.util;



import com.fasterxml.jackson.databind.json.JsonMapper;
import com.sun.org.apache.xpath.internal.operations.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>Redis 操作工具类</b>
 *
 * @author xt
 * @date 2022/8/24
 */
@Component("redisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据 key，将对应的 value 存储到 Redis 中</b>
	 */
	public boolean saveToRedis(String key, Object value, Integer expireSec)throws Exception{
		//创建JsonMapper对象
		JsonMapper jsonMapper=new JsonMapper();
		//通过jsonMapper将Object类型的 value变为JSON格式的String
		String valueJSON=jsonMapper.writeValueAsString(value);
		//将该数据存储到Redis中
		redisTemplate.opsForValue().set(key,valueJSON);
		//判断是否给定过期时间
		if (expireSec!=null&&expireSec>0){
			//设置过期时间，那么进行设置储存Redis的时长
			redisTemplate.expire(key,expireSec,TimeUnit.SECONDS);
		}
		return true;
	}

	/**
	 * <b>根据key获得Redis中所存储的数据</b>
	 */
	public Object getFromRedis(String key,Class valueType)throws Exception{
		//根据key从Redis中获取相应数据
		String valueJSON=redisTemplate.opsForValue().get(key);
		//判断是否能够获取相应的数据
		if (valueJSON!=null&&"".equals(valueJSON.trim())) {
			//创建JsonMapper对象
			JsonMapper jsonMapper = new JsonMapper();
			//根据类型将对应的数据变为其对象格式
			return jsonMapper.readValue(valueJSON,valueType);
		}else {
			// 未获取到相应的数据
			return null;
		}

	}

	/**
	 * <b>将对应的数据从Redis中删除</b>
	 */
	public boolean deleteFromRedis(String key)throws Exception{
		redisTemplate.delete(key);
		return true;
	}
}
