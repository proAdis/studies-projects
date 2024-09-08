using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{
    delegate double MyDelegate();
    class Program
    {
        
        static void Main(string[] args)
        {
            //Anonymous Methods
            double num1 = 9, num2 = 6;

            MyDelegate mul_delegate = delegate()
              {
                  return num1 * num2;
              };
            Console.WriteLine($"num1 = {num2} num2 = {num1}");
            Console.WriteLine("{}");
            Console.WriteLine( mul_delegate());


            //Extension Method
            List<int> list = new List<int>() {5, 78 };
            list.Swap(0, 1);
            list.Add(4);

            int num3 = int.Parse(Console.ReadLine());
            int num4 = Console.ReadLine().ToInt();

            Console.Read();
        }
    }
}
