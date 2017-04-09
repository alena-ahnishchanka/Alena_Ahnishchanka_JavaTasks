package Gift.IOStreamsReadWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// Class created for reading data from file / writing data to file using I/O Streams

public class IOStreamsReadWrite {

    public IOStreamsReadWrite() throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("source.txt");
            out = new FileOutputStream("dest.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            } finally {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            }
    }
}

