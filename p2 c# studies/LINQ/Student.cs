using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    class Student
    {
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

     

        private int grade;

        public int Grade
        {
            get { return grade; }
            set { grade = value; }
        }
        private int teacherId;

        public int TeacherId
        {
            get { return teacherId; }
            set { teacherId = value; }
        }


        public Student(int id, string name, int grade,int tea)
        {
            this.id = id;
            this.name = name;
            this.grade = grade;
            this.teacherId = tea;
        }

    }
}
