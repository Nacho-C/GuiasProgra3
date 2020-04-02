package ej5Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ej5.Categoria;
import ej5.Chofer;
import ej5.ColectivoLinea;
import ej5.Domicilio;
import ej5.Empresa;
import ej5.Vehiculo;
import javax.swing.JComboBox;

public class Ventana extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JScrollPane Detalles;
	private JPanel Vinculaciones;
	private JPanel Objetos;
	private JPanel panel;
	private JPanel VincularChofer;
	private JPanel VincularAcoplado;
	private JPanel Botones;
	private JScrollPane scrollLista;
	private JList Lista;
	private JTextArea TituloLista;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JLabel lblNewLabel_4;
	private JTextField textField_2;
	private JPanel panel_1;
	private JPanel Botones_1;
	private JLabel lblModelo;
	private JTextField textField_3;
	private JLabel lblNewLabel_6;
	private JTextField textField_4;
	private JLabel lblNewLabel_9;
	private JButton btnNewButton_1;
	private JScrollPane scrollLista_1;
	private JList Lista_1;
	private JTextArea txtrColectivosDeLinea;
	private JPanel panel_2;
	private JPanel Botones_2;
	private JLabel lblModelo_1;
	private JTextField textField_5;
	private JLabel lblNewLabel_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton_2;
	private JScrollPane scrollLista_2;
	private JList Lista_2;
	private JTextArea txtrCamiones;
	private JLabel lblNewLabel_8;
	private JTextField textField_7;
	private JLabel lblNewLabel_10;
	private JTextField textField_8;
	private JButton btnNewButton_3;
	private DefaultListModel<Chofer> modeloListaChof;
	private DefaultListModel<Vehiculo> modeloListaColLin;
	private Empresa empresa = Empresa.getInstance("Empresa");
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Ventana frame = new Ventana();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana()
	{
		empresa.addCategoria(new Categoria("1",10000,true,false,false));
		empresa.addCategoria(new Categoria("2",15000,true,true,false));
		empresa.addCategoria(new Categoria("3",15000,false,false,true));
		empresa.addCategoria(new Categoria("4",17000,true,true,true));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1208, 705);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		this.Detalles = new JScrollPane();
		this.contentPane.add(this.Detalles, BorderLayout.EAST);

		this.Vinculaciones = new JPanel();
		this.contentPane.add(this.Vinculaciones, BorderLayout.SOUTH);
		this.Vinculaciones.setLayout(new BorderLayout(0, 0));

		this.VincularChofer = new JPanel();
		FlowLayout fl_VincularChofer = (FlowLayout) this.VincularChofer.getLayout();
		fl_VincularChofer.setHgap(200);
		fl_VincularChofer.setVgap(100);
		this.Vinculaciones.add(this.VincularChofer, BorderLayout.WEST);

		this.btnNewButton_3 = new JButton("Vincular Chofer y Vehiculo seleccionados");
		this.btnNewButton_3.addActionListener(this);
		this.VincularChofer.add(this.btnNewButton_3);

		this.VincularAcoplado = new JPanel();
		FlowLayout fl_VincularAcoplado = (FlowLayout) this.VincularAcoplado.getLayout();
		fl_VincularAcoplado.setHgap(200);
		fl_VincularAcoplado.setVgap(100);
		this.Vinculaciones.add(this.VincularAcoplado, BorderLayout.EAST);

		this.Objetos = new JPanel();
		this.contentPane.add(this.Objetos, BorderLayout.CENTER);
		this.Objetos.setLayout(new GridLayout(0, 5, 0, 0));

		this.panel = new JPanel();
		this.Objetos.add(this.panel);
		this.panel.setLayout(new BorderLayout(0, 0));

		this.Botones = new JPanel();
		this.panel.add(this.Botones, BorderLayout.SOUTH);
		this.Botones.setLayout(new GridLayout(5, 2, 0, 0));

		this.lblNewLabel = new JLabel("Nombre");
		this.Botones.add(this.lblNewLabel);

		this.textField = new JTextField();
		this.Botones.add(this.textField);
		this.textField.setColumns(10);

		this.lblNewLabel_1 = new JLabel("Calle");
		this.Botones.add(this.lblNewLabel_1);

		this.textField_1 = new JTextField();
		this.Botones.add(this.textField_1);
		this.textField_1.setColumns(10);

		this.lblNewLabel_4 = new JLabel("N\u00FAmero");
		this.Botones.add(this.lblNewLabel_4);

		this.textField_2 = new JTextField();
		this.Botones.add(this.textField_2);
		this.textField_2.setColumns(10);

		this.lblNewLabel_2 = new JLabel("Categor\u00EDa");
		this.Botones.add(this.lblNewLabel_2);
		
		this.comboBox = new JComboBox(empresa.getCategorias().toArray());
		this.comboBox.setEditable(false);
		this.Botones.add(this.comboBox);

		this.lblNewLabel_3 = new JLabel("");
		this.Botones.add(this.lblNewLabel_3);

		this.btnNewButton = new JButton("Agregar");
		this.btnNewButton.addActionListener(this);
		this.Botones.add(this.btnNewButton);

		this.scrollLista = new JScrollPane();
		this.panel.add(this.scrollLista, BorderLayout.CENTER);

		this.Lista = new JList<Chofer>();
		this.scrollLista.setViewportView(this.Lista);
		this.modeloListaChof = new DefaultListModel<Chofer>();
		this.Lista.setModel(modeloListaChof);

		this.TituloLista = new JTextArea();
		this.TituloLista.setEditable(false);
		this.TituloLista.setText("Choferes");
		this.scrollLista.setColumnHeaderView(this.TituloLista);

		this.panel_1 = new JPanel();
		this.Objetos.add(this.panel_1);
		this.panel_1.setLayout(new BorderLayout(0, 0));

		this.Botones_1 = new JPanel();
		this.panel_1.add(this.Botones_1, BorderLayout.SOUTH);
		this.Botones_1.setLayout(new GridLayout(5, 2, 0, 0));

		this.lblModelo = new JLabel("Modelo");
		this.Botones_1.add(this.lblModelo);

		this.textField_3 = new JTextField();
		this.textField_3.setColumns(10);
		this.Botones_1.add(this.textField_3);

		this.lblNewLabel_6 = new JLabel("Cantidad de Pasajeros");
		this.Botones_1.add(this.lblNewLabel_6);

		this.textField_4 = new JTextField();
		this.textField_4.setColumns(10);
		this.Botones_1.add(this.textField_4);

		this.lblNewLabel_9 = new JLabel("");
		this.Botones_1.add(this.lblNewLabel_9);

		this.btnNewButton_1 = new JButton("Agregar");
		this.btnNewButton_1.addActionListener(this);
		this.Botones_1.add(this.btnNewButton_1);

		this.scrollLista_1 = new JScrollPane();
		this.panel_1.add(this.scrollLista_1, BorderLayout.CENTER);

		this.Lista_1 = new JList();
		this.scrollLista_1.setViewportView(this.Lista_1);
		this.modeloListaColLin = new DefaultListModel<Vehiculo>();
		this.Lista_1.setModel(modeloListaColLin);

		this.txtrColectivosDeLinea = new JTextArea();
		this.txtrColectivosDeLinea.setText("Colectivos de Linea");
		this.txtrColectivosDeLinea.setEditable(false);
		this.scrollLista_1.setColumnHeaderView(this.txtrColectivosDeLinea);

		this.panel_2 = new JPanel();
		this.Objetos.add(this.panel_2);
		this.panel_2.setLayout(new BorderLayout(0, 0));

		this.Botones_2 = new JPanel();
		this.panel_2.add(this.Botones_2, BorderLayout.SOUTH);
		this.Botones_2.setLayout(new GridLayout(5, 2, 0, 0));

		this.lblModelo_1 = new JLabel("Modelo");
		this.Botones_2.add(this.lblModelo_1);

		this.textField_5 = new JTextField();
		this.textField_5.setColumns(10);
		this.Botones_2.add(this.textField_5);

		this.lblNewLabel_5 = new JLabel("Tara");
		this.Botones_2.add(this.lblNewLabel_5);

		this.textField_6 = new JTextField();
		this.textField_6.setColumns(10);
		this.Botones_2.add(this.textField_6);

		this.lblNewLabel_8 = new JLabel("Capacidad");
		this.Botones_2.add(this.lblNewLabel_8);

		this.textField_7 = new JTextField();
		this.Botones_2.add(this.textField_7);
		this.textField_7.setColumns(10);

		this.lblNewLabel_10 = new JLabel("N\u00FAmero Interno");
		this.Botones_2.add(this.lblNewLabel_10);

		this.textField_8 = new JTextField();
		this.Botones_2.add(this.textField_8);
		this.textField_8.setColumns(10);

		this.lblNewLabel_7 = new JLabel("");
		this.Botones_2.add(this.lblNewLabel_7);

		this.btnNewButton_2 = new JButton("Agregar");
		this.Botones_2.add(this.btnNewButton_2);

		this.scrollLista_2 = new JScrollPane();
		this.panel_2.add(this.scrollLista_2, BorderLayout.CENTER);

		this.Lista_2 = new JList();
		this.scrollLista_2.setViewportView(this.Lista_2);

		this.txtrCamiones = new JTextArea();
		this.txtrCamiones.setText("Camiones");
		this.txtrCamiones.setEditable(false);
		this.scrollLista_2.setColumnHeaderView(this.txtrCamiones);
	}

	public void actionPerformed(ActionEvent arg0)
	{
		JButton boton = (JButton) arg0.getSource();
		Vehiculo colLinSelec = (ColectivoLinea) Lista_1.getSelectedValue();
		Chofer choferSelec = (Chofer) Lista.getSelectedValue();
		if (boton == btnNewButton_3)
			choferSelec.setVehiculoAsignado(colLinSelec);
		else
			if (boton == btnNewButton)
				empresa.addChofer(new Chofer(textField.getText(), (Categoria) comboBox.getSelectedItem(), new Domicilio(textField_1.getText(), (int) Integer.parseInt(textField_2.getText()))));
			else
					empresa.addVehiculo(new ColectivoLinea(textField_3.getText(), (int) Integer.parseInt(textField_4.getText())));
		this.actualizarListas();	
	}
	
	private void actualizarListas()
	{
		this.modeloListaChof.clear();
		this.modeloListaColLin.clear();
		Iterator<Chofer> itChof = empresa.getChoferes().iterator();
		Iterator<Vehiculo> itColLin = empresa.getVehiculos().iterator();
		while (itChof.hasNext())
			this.modeloListaChof.addElement(itChof.next());
		while (itColLin.hasNext())
			this.modeloListaColLin.addElement(itColLin.next());
		this.repaint();
	}
}
