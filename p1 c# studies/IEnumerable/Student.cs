using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IEnumerableProject
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

        private double avg;

        public double Avg
        {
            get { return avg; }
            set { avg = value; }
        }

        private int grade;

        public int Grade
        {
            get { return grade; }
            set { grade = value; }
        }

        public Student()
        {

        }

    }
}
