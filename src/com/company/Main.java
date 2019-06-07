package com.company;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //将一个文件内容输出到另一个文件
        FileInputStream input = new FileInputStream("res/input.txt");
        FileOutputStream output = new FileOutputStream("res/output.txt");

        InputStreamReader reader = new InputStreamReader(input,"UTF-8");
        OutputStreamWriter writer = new OutputStreamWriter(output,"UTF-8");

        int ch;
        while ((ch = reader.read()) != -1){
            writer.write(ch);
        }

        reader.close();  //close掉 表示告诉程序结束了读写  依次关闭  避免依赖先关闭
        input.close();
        writer.close();
        output.close();

        //IO Utils
        File inputFile = new File("res/input.txt");
//        String content = FileUtils.readFileToString(inputFile);
//        System.out.println(content);

        News news = new News("abc","blala");
        System.out.println(news.display());

        FileNews fileNews = new FileNews("abc","bababa");
        fileNews.display();
        FileNews fileNews1 = new FileNews(); // 直接调用 需要super去初始化News 再初始化FileNews
        fileNews1.read("/res/input.txt");

        Child a = new Child();
    }
}
