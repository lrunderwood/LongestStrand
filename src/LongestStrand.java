import java.io.*;

public class LongestStrand {
    public static void main(String[] args){
        String file1 = "C:\\Users\\lrund\\Downloads\\drive-download-20210408T004257Z-001\\sample.1";
        try{
            InputStream inputStream = new FileInputStream(file1);
            long fileSize = new File(file1).length();
            byte[] bytes = new byte[(int) fileSize];

            inputStream.read(bytes);

            for(int i = 0; i < bytes.length; i++){
                System.out.println(Integer.toBinaryString(bytes[i]));
            }

        }catch(IOException e){

        }
    }
}
