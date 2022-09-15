package com.whackon.witmed.base.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>天地医疗信息平台 - JWT 工具类<b/>
 * @author yan
 * @date 2022/9/14
 */
public class JwtUtil {
	/**
	 * 根据验证成功的用户姓名、手机号码生成Token
	 * @param adminVO
	 * @return
	 * @throws Exception
	 */
	public String cerateToken(AdminVO adminVO) throws Exception{
		// 使用JWT生成Token
		// 创建JWT对象
		JWTCreator.Builder builder = JWT.create();
		// 设置 JWT的 header部分
		Map<String,Object> headerMap = new HashMap<String,Object>();
		 headerMap.put("alg", "HS256");
		 headerMap.put("typ","JWT");
		 builder.withHeader(headerMap);

		 // 设置 JWT的 Payload 部分
		Map<String,Object> payloadMap = new HashMap<String,Object>();
		payloadMap.put(adminVO.getName(),adminVO.getCellphone());
		builder.withPayload(payloadMap);

		// 设置该 JWT生成 Token的有效时长
		Date expiresDate = new Date(System.currentTimeMillis() + 30*60*1000);
		builder.withExpiresAt(expiresDate);

		// 使用相关算法进行签名
		Algorithm algorithm = Algorithm.HMAC256("tiandimedical123");
		String token = builder.sign(algorithm);
		return token;
	}

	/**
	 * 解密 Token，获得存放数据的 Map<String,Claim>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public Map<String, Claim> decryptToken(String token) throws Exception{
		// 创建 JWT校验对象，负责对所给定的 JWT进行格式校验，也就是使用加密算法和密钥进行解密
		JWTVerifier verifier = JWT.require(Algorithm.HMAC256("tiandimedical123")).build();
		// 获得 JWT中加密的 Payload 部分
		DecodedJWT decodedJWT = verifier.verify(token);

		// 当解密成功后就可以通过 DecodedJWT 获得 Token 中的相关信息
		return decodedJWT.getClaims();
	}
}
