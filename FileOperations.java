import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations 
{

	public static void createFile(String name) throws IOException
	{
		//File is a class having createNewFile() method
		File ff=new File(name);
		// getting location where file is created
		System.out.println(ff.getAbsolutePath());
		boolean isCreated=ff.createNewFile();
		if(isCreated==true)
		{
			System.out.println("File is Created");
		}
		else
		{
			System.out.println("File is not created, already present");
		}
	}
	
	public static void writeFile(String name,String messege) throws IOException
	{
		File ff=new File(name);
		//FileWriter is a class having write() method
		FileWriter fw=new FileWriter(ff);
		fw.write(messege);
		fw.close();  //To save above written data we must have to write this method.
	}
	
	//By using append method old data remains as it is and new data is added to file.
	public static void appendFile(String name,String messege) throws IOException
	{
		File ff=new File(name);
		//FileWriter is a class having write() method
		FileWriter fw=new FileWriter(ff,true);
		fw.write(messege);
		fw.close();  //To save above written data we must have to write this method.
	}
	
	public static void readFile(String name) throws IOException
	{
		File ff=new File(name);
		//FileReader is a class having read() method
		//read method returns the ascii value of each character which is read.
		FileReader fr=new FileReader(ff);

		int z;
		while((z=fr.read()) != -1)
        {
        	System.out.print((char)z);  //Converting values into characters
        }
	}	
	public static void deleteFile(String name) throws IOException 
	{
		File ff=new File(name);
		//File class is having delete method to delete the existing file
		ff.delete();
		System.out.println("File is deleted");
	}
    
	public static void main(String[] args) throws IOException 
	{
		//createFile("text.txt");
		//writeFile("text.txt","Hello Atul");
		//appendFile("text.txt"," Where Are You");
		//readFile("text.txt");
		deleteFile("text.txt");
	}

}
