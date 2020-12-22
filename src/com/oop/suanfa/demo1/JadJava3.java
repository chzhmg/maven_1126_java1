package com.oop.suanfa.demo1;

import java.io.*;

public class JadJava3 {


    public static void main(String[] args) throws Exception {
        File srcDir = new File("d:\\test\\java");
        if (!(srcDir.exists() && srcDir.isDirectory()))
            throw new Exception("目录不存在");
        File[] files = srcDir.listFiles(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith(".java");
                    }
                }
        );
        System.out.println(files.length);
        File destDir = new File("d:/test/jad");
        if (!(destDir.exists())) {
            destDir.mkdir();
        }
        for (File f : files
                ) {
            FileInputStream fis = new FileInputStream(f);
            String destName = f.getName().replace(".java", ".jad");
            FileOutputStream fos = new FileOutputStream(new File(destDir, destName));
            ;
            copy(fis, fos);
            fis.close();
            fos.close();

        }
    }

    public static void copy(InputStream ips, OutputStream ops) throws IOException {
        int len = 0;
        byte[] buf = new byte[1024];
        while ((len = ips.read(buf)) != -1) {
            ops.write(buf, 0, len);
        }
    }
}
