using System;
using System.IO;
using System.Threading;

namespace FirstApp
{
    class Program
    {
        //    static void Main(string[] args)
        //    {

        //        //U:\C#\FileEx\FileEx\sales.dat
        //        string fileDir = @"U:\C#\FileEx\FileEx\";
        //        string filePath = fileDir + "sales.dat";
        //        FileInfo myfile = new FileInfo(filePath);
        //        if (myfile.Exists)
        //        {
        //            Console.WriteLine(myfile.Length);
        //            DateTime lastAccess = myfile.LastAccessTime;
        //            Console.WriteLine(lastAccess);
        //        }
        //        FileStream salesData = null;
        //        try
        //        {
        //            salesData = new FileStream(filePath, FileMode.Open, FileAccess.Read,FileShare.Read);
        //            using (TextReader readFile = new StreamReader(salesData))
        //            {
        //                string line = null;
        //                int counter = 0;
        //                while ((line = readFile.ReadLine()) != null)
        //                {
        //                    counter++;
        //                    if (string.IsNullOrWhiteSpace(line))
        //                    {
        //                        Console.WriteLine("Empty record number {0}",counter);
        //                    }
        //                    else
        //                    {
        //                        Console.WriteLine(line);

        //                    }

        //                }      
        //            }

        //        }
        //        catch (DirectoryNotFoundException)
        //        {
        //            Console.WriteLine(fileDir + " not found");
        //        }
        //        catch (FileNotFoundException)
        //        {
        //            Console.WriteLine(filePath + " not found");
        //        }
        //        catch (ArgumentException)
        //        {
        //            Console.WriteLine("Check file access rights");
        //        }
        //        catch (IOException)
        //        {
        //            Console.WriteLine("General file access issues");
        //        }   
        //        //finally

        //            Console.ReadKey(); 

        //    }
    }
}
