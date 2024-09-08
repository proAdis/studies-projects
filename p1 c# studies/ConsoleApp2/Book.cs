using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public class Book
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

        private string author;

        public string Author
        {
            get { return author; }
            set { author = value; }
        }

        private bool isLend;

        public bool IsLend
        {
            get { return isLend; }
            set { isLend = value; }
        }

        public Book(int id, string name, string author)
        {
            this.id = id;
            this.name = name;
            this.author = author;
            this.isLend = false;
        }

    }
}
