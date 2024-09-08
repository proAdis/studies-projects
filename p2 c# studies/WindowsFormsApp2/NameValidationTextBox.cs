using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    class NameValidationTextBox:TextBox
    {
        public EventHandler InvalidKeyPressed;
        public NameValidationTextBox()
        {            
            KeyPress += ValidationTextBox_KeyPress;
        }
        private void ValidationTextBox_KeyPress(object sender, KeyPressEventArgs e)
        {
            string str = "/:*?\"<>\\|";
            if(str.Contains(e.KeyChar))
            {
                if(InvalidKeyPressed!=null)
InvalidKeyPressed
            }
                
        }
    }
}
