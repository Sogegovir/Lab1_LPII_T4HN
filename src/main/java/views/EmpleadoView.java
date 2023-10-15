package views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		String e;
		
		//e = new EmpleadoController().createEmpleado("peres","soge", 22, "M", 3000);
		//System.out.println(e);
		
		//e = new EmpleadoController().updateEmpleado(1, "rene", "edison", 20, "m", 4000);
		//System.out.println(e);
		 
		//e = new EmpleadoController().deleteEmpleado(2);
		//System.out.println(e);
		
		//e = new  EmpleadoController().getEmpleado(3);
		//System.out.println(e);
				
		  JFrame frame = new JFrame("Empleado Resultado");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);

	        
	        JPanel panel = new JPanel();

	        
	        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del empleado:");
	        String apellido = JOptionPane.showInputDialog("Ingresa el apellido del empleado:");
	        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del empleado:"));
	        String genero = JOptionPane.showInputDialog("Ingresa el género del empleado (M/F):");
	        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario del empleado:"));

	       
	        String resultado = new EmpleadoController().createEmpleado(nombre, apellido, edad, genero, salario);

	       
	        JLabel label = new JLabel("Resultado: " + resultado);
	        panel.add(label);

	        
	        frame.add(panel);
	        frame.setVisible(true);
		
	}
	
	
	
}
