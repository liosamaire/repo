using System;
namespace validation
{
    class CharInput
    {

        public static char readChar()
        {

            char inValue = ' ';
            bool validNumber = false;
            String inString = null;

            while (validNumber == false)
            {
                try
                {
                    inString = Console.ReadLine();
                    inString = inString.Trim();
                    inValue = inString[0];
                    validNumber = true;
                }

                catch (Exception)
                {
                    Console.WriteLine("  The value you entered is not valid.  ");
                    Console.WriteLine("  Please enter a valid character.  ");
                    Console.WriteLine("Enter another character value: ");
                }
            }
            return inValue;
        }


        public static char checkAlpha()
        {
            char inValue = ' ';
            bool validNumber = false;
            while (validNumber == false)
            {
                    inValue = readChar();
                    //Console.WriteLine(inValue);
                    if(Char.IsLetter(inValue)) //True or False
                    { 
                        validNumber = true;
                    }
                    else
                    {
                        Console.WriteLine("  The value you entered is not valid.  ");
                        Console.WriteLine("  Please enter a valid char.  ");
                        Console.WriteLine("Enter another character value: ");
                    }                             
            }
            return inValue;
        }

        public static char checktwochars(char a, char b)
        {
            char reply = ' ';
            bool flag = false;
            while (flag == false)
            {
                reply = checkAlpha();
                reply = Char.ToUpper(reply);
                if ((reply == a) || (reply == b)) 
                
                {
                    flag = true;
                }                
                else
                {
                    Console.WriteLine("  The value you entered is not valid.  ");
                    Console.WriteLine("  Please enter a valid char.  ");
                    Console.WriteLine("Enter another character value: ");
                }
            }
            return reply;
        }

    }
    }
