package ex1_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyExample {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;
        byte[] buffer = new byte[512];

        try {
            in = new FileInputStream("wall.jpg");
            out = new FileOutputStream("wall_copy.jpg");

            long start = System.currentTimeMillis();

            int data = 0;
            while((data = in.read(buffer)) != -1) {
                out.write(buffer, 0, data);
            }

            System.out.println("이미지 읽기 종료");

            long end = System.currentTimeMillis();
            long time = (end - start) / 1000;
            System.out.println(time + "초");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}