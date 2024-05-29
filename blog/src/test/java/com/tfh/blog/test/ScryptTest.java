package com.tfh.blog.test;

import com.lambdaworks.crypto.SCrypt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/**
 * @author tang
 * @version 1.0
 * @since 2024/5/29 9:39
 * Description: 加密测试
 */

@SpringBootTest
public class ScryptTest {
    @Test
    public void test01() {
        String str = "password";
        int n = 1 << 8;
        try {
            byte[] scrypt = SCrypt.scrypt(str.getBytes(), "加盐".getBytes(), n, 1024, 10, 128);
            String string = Arrays.toString(scrypt);
            System.out.println(string);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
