using System;

namespace FirstApp
{
    class Paintv1_1Rec
    {
        static void Main(string[] args)
        {
            //Data Items  
            double length, height, width, area, total_Paint_Req = 0.0;
            char measurement = ' ';

            double coverage = 350.00; // For 1 gallon of paint
            const double metresCoverage = 10.75;
            const double feetCoverage = 3.28084;

            //Inputs - ingredients

            Console.Write("Please enter your length"); //Write message in brackets to console
            length = Convert.ToDouble(Console.ReadLine()); //Convert chars from keyboard to appropriate type

            Console.Write("Please enter your height"); //Write message in brackets to console
            height = Convert.ToDouble(Console.ReadLine()); //Convert chars from keyboard to appropriate type

            Console.Write("Please enter your width"); //Write message in brackets to console
            width = Convert.ToDouble(Console.ReadLine()); //Convert chars from keyboard to appropriate type

            Console.Write("Please enter your measurement"); //Write message in brackets to console
            measurement = Convert.ToChar(Console.ReadLine()); //Convert chars from keyboard to appropriate type

            //Processes - recipe

            if (measurement == 'm')

                coverage = coverage / metresCoverage;

            else if (measurement == 'f')

                coverage = coverage / feetCoverage;

            area = (length * height + width * height) * 2;

            total_Paint_Req = area / coverage;

            //Output

            Console.WriteLine("Total paint required is: {0:0.00} in gallons", total_Paint_Req);
            Console.ReadKey();

            Console.WriteLine("Surface Area is: {0}", area);
            Console.ReadKey();


        }
    }
}