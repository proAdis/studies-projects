using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    public delegate int fg(int i);
    class Program
    {
        public static bool F(int n)
        {
            return n > 10 && n % 2 == 0;
        }
        public static Student F1(Student s)
        {
            return s;
        }
        static void Main(string[] args)
        {
            // List<int> li = new List<int>() { 11, 5, 98, 68, 3, 4 };

            // IEnumerable<int> li1 = from i in li
            //                      where i > 10 && i%2 == 0
            //                      select i;

            // var li2 = li.Where(F);
            // var li3 = li.Where(i => i>10 && i%2 ==0);


            // foreach (var item in li1)
            // {
            //     Console.WriteLine(item);
            // }
            // Console.WriteLine("*********");

            // //List<Student> students = new List<Student>() { new Student(4,"Sara",5),
            // //                                               new Student(5,"Zilpa",8),
            // //                                               new Student(1,"Rachel",2),
            // //                                               new Student(2,"Lea",2),
            // //                                               new Student(3,"Rivka",4)};
            // var s1 = from s in students
            //          where s.Grade == 2
            //          select s;
            // var s2 = from s in students
            //          where s.Grade == 2
            //          select (s.Name,s.Grade);

            // Console.WriteLine("s1");
            // foreach (var item in s1)
            // {
            //     Console.WriteLine(item.Id+" "+item.Name);
            // }
            // Console.WriteLine("s2");
            // foreach (var item in s2)
            // {
            //     Console.WriteLine(item.Grade + " " + item.Name);
            // }


            // //order by
            // //query syntax
            // IEnumerable<Student> students1 = from s in students
            //                                  orderby s.Grade
            //                                  select s;
            // IEnumerable<Student> students2 = from s in students
            //                                  orderby (s.Grade,s.Name) descending
            //                                  select s;

            // Console.WriteLine("\n order by");
            // Console.WriteLine("\nstudents1");
            // foreach (var item in students1)
            // {
            //     Console.WriteLine(item.Id + " " + item.Name+" "+item.Grade);
            // }
            // Console.WriteLine("\nstudents2");
            // foreach (var item in students2)
            // {
            //     Console.WriteLine(item.Id + " " + item.Name + " " + item.Grade);
            // }
            // //function syntax
            // var students3 = students.OrderBy(i => i.Id);
            // var students33 = students.OrderByDescending(i => i.Id);

            // //CompareStudent c = new CompareStudent();
            // //var students4 = students.OrderBy(s => s, c);
            // //הפרמטר הראשון מייצג לפי איזה ערך למיין, והפרמטר השני הוא אבייקט מטיפוס מחלקה שמממשת את הממשק איקומפרר
            // //יצרנו בה פונקציה קומפר שמייצגת איזה צורה של מיון לבצע
            // Console.WriteLine("\n*************************");
            // var students4 = students.OrderBy(s => s, new CompareStudent());
            // foreach (var item in students4)
            // {
            //     Console.WriteLine(item.Name);
            // }

            // Console.WriteLine("\n********************");
            // var students5 = students.Where(s=>s.Grade == 2).OrderBy(s => s, new CompareStudent());
            // foreach (var item in students5)
            // {
            //     Console.WriteLine(item.Name);
            // }
            // Console.WriteLine("***********************");
            // var l1 = new List<string>() { "aa", "bb", "cc" };
            // var l2 = new List<string>() { "Aa", "bb", "CC" };


            // //Union
            // var result = l1.Union(l2);
            // result = l1.Union(l2, new UnionString());
            // result = from l in l1
            //          select l;


            // foreach (var item in result)
            // {
            //     Console.WriteLine(item);
            // }
            // Console.WriteLine();
            // //Group by
            //// IEnumerable<IGrouping<int, Student>> result2 = students.GroupBy(f => f.Grade).OrderBy(s => s.GetEnumerator().Current.Name);

            // IEnumerable<IGrouping<int,Student>> result2 = students.GroupBy(f => f.Grade).OrderBy(s=>s.Key);

            // foreach (var item in result2)
            // {
            //     Console.WriteLine(item.Key);

            //     foreach (var item1 in item.OrderBy(s=>s.Name))
            //     {
            //         Console.WriteLine(item1.Name);
            //     }
            // }

            //join
            List<string> str1 = new List<string>() { "AAA", "BBB", "CCC" };
            List<string> str2 = new List<string>() { "AAA", "BBB", "DDD" };
            var result3 = str1/* הרשימה החיצונית*/.Join(
                str2,//הרשימה הפנימית
                s13 => s13,//לפי איזה ערך מהרשימה החיצונית לבצע את הצירוף
                s23 => s23,//לפי איזה ערך מהרשימה הפנימית לבצע את הצירוף
                (s13, s23) => s13);//אילו ערכים יהיו באוסף החדש

            var studentss = new List<Student>() { new Student(1,"a",2,4),
                                                  new Student(2,"b",3,8),
                                                  new Student(3,"c",7,4),
                                                  new Student(4,"d",7,9)};
            List<Teacher> teachers = new List<Teacher>() { new Teacher(4,"Ta"),
            new Teacher(7,"Tb"),
            new Teacher(8,"Tc")};

            var teacherToStudent1 = studentss.Join(teachers,
                s => s.TeacherId,
                t => t.Id,
                (s, t) => new { sName = s.Name, tName = t.Name });
            foreach (var item in teacherToStudent1)
            {
                Console.WriteLine(item.sName+ " "+ item.tName);
            }

            var teacherToStudent2 = from s in studentss
                                    join t in teachers
                                    on s.TeacherId equals t.Id
                                    select new
                                    {
                                        sName = s.Name,
                                        tName = t.Name
                                    };


            //fg f = i => i + 5;
            //f(4);
            //var students5 = students.OrderBy(F1,new CompareStudent());




            Console.Read();
            //int[] vs = new int[3];
            //List<int> k = vs.ToList();

        }
    }
}
