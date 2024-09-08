using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LambdaExpression
{
    class Rectengle:Shape
    {
        public int width { get; private set; }
        public int height { get; private set; }

        public double Area()
        {
            return width * height;
        }
       public  double Perimeter()
        {
            return width * 2 + height * 2;
        }

    }
}
