package com.sf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;

@SpringBootTest
class ApplicationTests {

    @Test
   public void test() throws IOException {
        String urlStr = "http://www.baidu.com/";

         URL url = new URL(urlStr);

        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
        //获取httpURLConnection的输入流
        try(
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
           ){
                String line;
                while ((line=br.readLine()) !=null){
                    System.out.println(line);
                }
        }

    }

}
