using System;
using validation;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FirstApp
{
    class Paintv1_kris
    {
        static void Main(string[] args)
        {
            //Data Items  
            double w1, w2, h1, h2, radius, triangle, area = 0, roofarea = 0, reqpaintgal, reqpaintlit;
            double roofpaintgal = 0, roofpaintlit = 0;
            char measurement = ' '; char shape = ' '; char repeat = 'y'; char knowarea = 'n';
            double coverage = 350.00; // For 1 gallon of paint
            const double metresCoverage = 10.75, galtolit = 4.54609, pie = Math.PI;

            //Inputs - ingredients

            do
            {


                Console.WriteLine(" Which is your preferred unit of measurement?");
                Console.Write(" Please enter m for metres, and f for feet  ");
                measurement = CharInput.checktwochars('M','F');

                Console.WriteLine(" Do you know the surface area of your room?");
                Console.Write(" Please enter y for yes and n for no  ");
                knowarea = CharInput.checktwochars('Y', 'N');

                if (knowarea == 'n')
                {

                    Console.WriteLine(" Which shape is your room?");
                    Console.WriteLine(" Please enter s for square, r for rectangle, ");
                    Console.Write(" t for triangular or c for circular  ");
                    shape = Convert.ToChar(Console.ReadLine());

                    area = 0;

                    while (area <= 0)
                    {

                        if (shape == 's')
                        {

                            Console.Write(" Please enter the width of the wall   ");
                            w1 = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the height the wall  ");
                            h1 = Convert.ToDouble(Console.ReadLine());

                            area = (w1 * h1) * 4;

                            roofarea = area / 4;
                              
                        }
                        else if (shape == 'r')
                        {

                            Console.Write(" Please enter the width of wall one  ");
                            w1 = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the height of wall one  ");
                            h1 = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the width of wall two  ");
                            w2 = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the height of wall two  ");
                            h2 = Convert.ToDouble(Console.ReadLine());

                            area = ((w1 * h1) + (w2 * h2)) * 2;

                            roofarea = w1 * w2;
                            
                        }
                        else if (shape == 't')
                        {

                            Console.Write(" Please enter the width of wall one  ");
                            w1 = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the height of wall one  ");
                            h1 = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the width of wall two  ");
                            w2 = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the height of wall two  ");
                            h2 = Convert.ToDouble(Console.ReadLine());

                            triangle = (w1 * w1) + (w2 * w2);

                            area = (Math.Sqrt(triangle) * h1) + (w1 * h1) + (w2 * h2);

                            roofarea = (w1 * w2) / 2;
                            
                        }
                        else if (shape == 'c')
                        {

                            Console.Write(" Please enter the radius of the room   ");
                            radius = Convert.ToDouble(Console.ReadLine());

                            Console.Write(" Please enter the height the wall  ");
                            h1 = Convert.ToDouble(Console.ReadLine());

                            area = (2 * radius * pie) * h1;

                            roofarea = (radius * radius) * pie;
                            
                        }
                        else
                        {

                            Console.WriteLine(" Sorry but the shape you entered wasn't");
                            Console.WriteLine(" recognized. Please try again");
                            Console.WriteLine(" Remember to enter s for square, r for rectangle, ");
                            Console.Write(" t for triangular or c for circular  ");
                            shape = Convert.ToChar(Console.ReadLine());

                        }

                    }

                }
                else
                {
                            
                    Console.Write(" Please enter the surface area of the room  ");
                    area = Convert.ToDouble(Console.ReadLine());

                }



                //Processes - recipe

                if (measurement == 'm')

                    coverage = coverage / metresCoverage;
                 



                reqpaintgal = area / coverage;
                roofpaintgal = roofarea / coverage;
                reqpaintlit = reqpaintgal * galtolit;
                roofpaintlit = roofpaintgal * galtolit;

                //Output

                Console.WriteLine(" Total paint required is: {0:0.00} in gallons", reqpaintgal);
                Console.WriteLine(" and the paint required is: {0:0.00} in litres", reqpaintlit);
                Console.WriteLine(" The roof would need an extra {0:0.00} in gallons", roofpaintgal);
                Console.WriteLine(" and {0:0.00} in litres", roofpaintlit);
                Console.WriteLine(" Would you like to do another calculation?");
                Console.Write(" Enter y for yes and n for no  ");
                repeat = Convert.ToChar(Console.ReadLine());

            } while (repeat == 'y');

        }

    }

}