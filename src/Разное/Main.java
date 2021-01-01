import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

/**/

public class Main {
    //File java = new File();
    public static void main(String[] args) throws IOException {
        InputStream bS = new ByteArrayInputStream("Ы".getBytes());
        int b = 0;
        while ((b = bS.read()) != -1)
            System.out.print(b +  " ");
        System.out.println("\n");

        for (byte c : "Ы".getBytes())
            System.out.print((c^-1 << 8)  + " ");
        System.out.println("\n");

        String s = "Ы";
        byte[] b1 = s.getBytes();
        for (int i = 0; i < b1.length; i++  ) {
            System.out.print(((int) b1[i] ^ -1 << 8) +  " ");
        }
        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
        writer.write("Ч");
        writer.close();
    }

    private OutputStream outputStream;
    Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);

}
