
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FileTransfer 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
	try{
		FileChannel source=new FileInputStream(new File("D:/document/info.docx")).getChannel();
		FileChannel destination=new FileOutputStream(new File("E:/data/resume.docx")).getChannel();
		destination.transferFrom(source, 0, source.size());
 	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
     }

}
