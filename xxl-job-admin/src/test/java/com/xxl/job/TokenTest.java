package com.xxl.job;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

/**
 * @author qxq
 * @date 2024/6/24
 */
public class TokenTest {

    @Test
    public void parse() {

        String tokenHex = "7b226964223a312c22757365726e616d65223a2261646d696e222c2270617373776f7264223a226531306164633339343962613539616262653536653035376632306638383365222c22726f6c65223a312c227065726d697373696f6e223a6e756c6c7d";
        String tokenJson = new String(new BigInteger(tokenHex, 16).toByteArray());      // username_password(md5)
        System.out.println(tokenJson);
    }

}
