using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public delegate void AddStudent(Student s);
    public class Student
    {
        public static event AddStudent AddNewStudent;

        private int id;

        public int Id
        {
            get { return id; }
            set { id = value; }
        }
        private string name;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        private int class1;

        public int Class1
        {
            get { return class1; }
            set { class1 = value; }
        }

    }
}
