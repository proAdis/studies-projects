using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IEnumerableProject
{
    class Program
    {
        static void Main(string[] args)
        {
            SchoolArr school = new SchoolArr();
            foreach(var item in school)
            {
                Console.WriteLine("***");
            }

            int g= school["Rtuiu"];

            Console.Read();
        }
    }
}
