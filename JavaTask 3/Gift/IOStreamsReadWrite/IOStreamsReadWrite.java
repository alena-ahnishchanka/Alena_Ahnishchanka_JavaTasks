package Gift.IOStreamsReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


// Class created for reading data from file / writing data to file using I/O Streams

public class IOStreamsReadWrite {

    File source;
    File dest;

    public IOStreamsReadWrite(File source, File dest) throws IOException{
        this.source = source;
        this.dest = dest;

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream(source);
            out = new FileOutputStream(dest);
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
