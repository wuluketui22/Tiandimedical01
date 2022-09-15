package com.whackon.witmed.base.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b></b>
 *
 * @author DELL
 * @date 2022/9/14
 */
public class TokenUtil {
	//设置生成Token所使用的加密算法为HS256
	private static final Algorithm ALGORITHM=Algorithm.HMAC256(BaseConstants.TOKEN_SECRET);
	//设置有效载荷存储key
	private static final String CLAIM_KEY="info";

	/**
	 * 根据数据以及有效时长生成
	 * @param value
	 * @param expireSec
	 * @return
	 */
	public static String createToken(Object value,Integer expireSec)throws Exception {
		//创建JWT生成器对象
		JWTCreator.Builder builder = JWT.create();

		//设置JWT Header 信息
		Map<String, Object> header = new HashMap<String, Object>();
		//设置加密算法属性
		header.put("alg", "HS256");
		header.put("typ", "jwt");
		builder.withHeader(header);

		//设置有效载荷信息
		//为了能够将Object类型的有效载荷存储到JWT中，因此将Objec同型的数据变为JSON格式String
		JsonMapper jsonMapper = new JsonMapper();
		//使用JsonMapper将Object的value变为String的JSON
		String jsonValue = jsonMapper.writeValueAsString(value);
		//将对应的数据存入JWT
		builder.withClaim(CLAIM_KEY, jsonValue);

		//设置Token所存储的时长
		//判断是否给定有效时间
		if (expireSec!=null&&expireSec>0){
			//给定有效时长，得到过期时间
			Date expireDate=new Date(System.currentTimeMillis()+expireSec*1000);
			builder.withExpiresAt(expireDate);
		}
		//使用加密算法进行加密签名，生成最终的Token
		return builder.sign(ALGORITHM);
	}


	/**
	 * 根据所给定的Token进行有效性验证
	 * @param token
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public Object verifToken(String token,Class type)throws Exception{
	//判断Token是否有效
		if (token!=null&&!"".equals(token.trim())){
			//给定有效Token之后，创建JWT Token校验对象
			JWTVerifier verifier=JWT.require(ALGORITHM).build();
			//校验Token有效性，获得DecodedJWT对象
			DecodedJWT decodedJWT=verifier.verify(token);
			//通过DecodedJWt获得有效信息
			String jsonValue=decodedJWT.getClaim(CLAIM_KEY).asString();
			//判断信息是否存在
			if (jsonValue!=null&&!"".equals(jsonValue.trim())){
				//将JSON格式的Value数据变为对应类对象
				JsonMapper jsonMapper=new JsonMapper();
				return jsonMapper.readValue(jsonValue, type);
			}else {
				throw new Exception("未查找到Token信息");
			}
		}else {
			throw new Exception("未给定有效Token信息");
		}

	}
}
