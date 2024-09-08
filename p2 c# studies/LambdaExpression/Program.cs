using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace LambdaExpression
{
    public delegate bool IsTeenager(Student st);
    public delegate void IsOld();
    public delegate void NameAndAge(string name, int age);

    class Program
    {
        static void Main(string[] args)
        {
            //Anonymous Methods
            IsTeenager teenager = delegate (Student st)
            {
                return st.Age > 12 && st.Age < 20;
            };

            //Lambda Expression
            IsOld isOld = () => Console.WriteLine("You are old");

            Student s1 = new Student(2222, "Yael", 25);
            Student s2 = new Student(1111, "Rachel", 19);
            Console.WriteLine(teenager(s1));

            IsTeenager teenager1 = s => s.Age > 12 && s.Age < 20;
            Console.WriteLine(teenager1(s2));

            //Lambda Expression with 2 or more parameters
            NameAndAge nameAndAge = (n, a) => Console.WriteLine("Your name is {0} and your age is {1}",n,a);
            NameAndAge nameAndAge1 = (n, a) =>
            {
                Console.WriteLine("Your name is {0} and your ag is {1}", n, a);
                Console.WriteLine("*****");
            };

            isOld();
            


            List<int> list = new List<int>() {1,34,67,54,24,38 };
            list.ForEach(i => Console.WriteLine(i));
            List<int> evens = list.FindAll(i => i % 2 == 0);
            Console.WriteLine("********************");
            evens.ForEach(i => Console.WriteLine(i));
            Console.WriteLine("********************");




            var worker1 = new { id = 1, name = "yossi", job = "rabbay" };
            var worker2 = new { id = 1, name = "yossi", job = "rabbay" };

            var workers = new[] { worker1, worker2, new { id = 2, name = "yossi", job = "rabbay" } };
            foreach (var item in workers)
            {
                if(item.id == 1)
                    Console.WriteLine();
            }

            Console.WriteLine(worker1.id);



            var s = new Student();


















            //int n1 = 10, t = 12;
            //Console.WriteLine($"n1 = {n1} t = {t}");
            Console.Read();
            
        }

        
    }
}
