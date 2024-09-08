using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Library
    {
        public List<Book> books;
        
        

        public void LibraryMenagament()
        {

        }
        //public bool F(Book book)
        //{
        //    if (book.Author == "מנוחה בקרמן")
        //        return true;
        //    return false;
        //}

        //public void ChangeAuthor(Book b)
        //{
        //    if (b.Author != "מנוחה בקרמן")
        //    { 
        //        b.Author = "מנוחה בקרמן";
        //        Console.WriteLine("The name Has changed");
        //    }
        //}
        
        public Library()
        {
            books = new List<Book>();
            books.Add(new Book(1, "ילדי שי", "מנוחה בקרמן"));
            books.Add(new Book(2, "שולינקה 1", "מנוחה בקרמן"));
            books.Add(new Book(3, "שולינקה 1", "מנוחה פוקס"));




            //books.RemoveAll(F);
            //books.ForEach(ChangeAuthor);
            
        }
    }
}
