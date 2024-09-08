using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{
     static  class AddToListClass
    {
        public static void Swap<T>(this List<T> l,int index1, int index2)
        {
            T temp = l[index1];
            l[index1] = l[index2];
            l[index2] = temp;
        }

    }
}
