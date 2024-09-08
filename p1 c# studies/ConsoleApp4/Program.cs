using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace ConsoleApp4
{
    class Program
    {
        public static bool isValid(string st)
        {

            Stack<char> stack = new Stack<char>();
            Dictionary<char, char> dic = new Dictionary<char, char>();
            dic.Add('}', '{');
            dic.Add(')', '(');
            dic.Add(']', '[');
            foreach (char c in st)
            {
                if (c == '{' || c == '[' || c == '(')
                    stack.Push(c);
                if ((c == '}' || c == ']' || c == ')'))
                    if (dic[c] == stack.First())
                        stack.Pop();
                    else
                        break;

            }
            return stack.Count == 0;
        }
        static void Main(string[] args)
        {
            Console.WriteLine(isValid("{c{{[{]}}f(f)d}"));
        }
    }
}
