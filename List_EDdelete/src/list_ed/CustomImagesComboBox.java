 
package list_ed;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.xml.bind.annotation.XmlElement;

 
public class CustomImagesComboBox extends JFrame {

    
    
    public CustomImagesComboBox(){
        setTitle("ComboBox");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        
        final JComboBox com = new JComboBox();
        com.setPreferredSize(new Dimension(200,58));
        com.setModel(populate());
        com.setRenderer(new ImagesTextReader());
        
        
        getContentPane().add(com);
    }
    
    private DefaultComboBoxModel populate(){
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        dm.addElement(new ImagesNText(new ImageIcon("F:\\computer.png"),"Test ComboBox"));
        return dm;
    }
    
    public static void main(String[] args) {
        new CustomImagesComboBox().setVisible(true);
        
        
    }
    
    class ImagesTextReader extends JLabel implements ListCellRenderer{

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean Selected, boolean cellHasFocus) {
            
            ImagesNText it = (ImagesNText) value;
            
            setIcon(it.getImg());
            setText(it.getName());
            
            if(Selected){
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            }
            setFont(list.getFont());
                    
           return this;
        }
        
    }
    
    class ImagesNText {
    
        private Icon img;
        private String name;
        
        public ImagesNText(Icon im,String n){
            img = im;
            name = n;
        }

        public Icon getImg() {
            return img;
        }

        public String getName() {
            return name;
        }

        public void setImg(Icon im) {
            img = im;
        }

        public void setName(String n) {
            name = n;
        }
        
    }
    
    
}
