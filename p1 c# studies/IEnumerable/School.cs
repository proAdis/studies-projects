using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IEnumerableProject
{
    class SchoolArr:IEnumerable
    {
        private Student[] students = new Student[2]
            { new Student(),new Student()};
        private int name;

        public int Name
        {
            get { return name; }
            set { name = value; }
        }

        public int this[string index]
        {
            get
            {
                foreach (var item in students)
                {
                    if (item.Name == index)
                        return item.Grade;
                }
                return 0;
            }
        }
      

        //מחזירה את האוסף שעליו נרצה לעבור foreach
        public IEnumerator GetEnumerator()
        {
            return students.GetEnumerator();
        }

        
    }
}
