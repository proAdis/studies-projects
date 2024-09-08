using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    class CompareStudent:IComparer<Student>
    {
       public int Compare(Student s1,Student s2)
        {
            if (s1.Name.Length > s2.Name.Length)
                return 1;
            else
            {
                if (s1.Name.Length < s2.Name.Length)
                    return -1;
            }
            return 0;
        }
    }
}
