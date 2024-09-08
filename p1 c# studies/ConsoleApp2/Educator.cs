using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Educator
    {
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
        private int numOfStudents;

        public int NumOfStudents
        {
            get { return numOfStudents; }
            set { numOfStudents = value; }
        }

        private Student[] students = new Student[30];

        public Educator()
        {
            Student.AddNewStudent += new AddStudent(AddStudent);
        }
        public void AddStudent(Student s)
        {
            Student.AddNewStudent();
            if(s.Class1 == class1)
            {
                students[numOfStudents] = s;
            }
        }
    }
}
