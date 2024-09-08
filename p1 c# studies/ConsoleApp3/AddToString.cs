using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{
    static class AddToString
    {
        public static int ToInt(this string str)
        {
            return int.Parse(str);
        }
     }
}
