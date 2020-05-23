package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.ConjuntoGenericoOrdenado;
import modelo.OperacionConjuntoInvalidaException;
import modelo.Persona;

public class Ventana extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JPanel panelAgregarPersona;
	private JPanel panelConjuntoPersonas;
	private JLabel labelNombre;
	private JTextField campoNombre;
	private JLabel labelApellido;
	private JTextField campoApellido;
	private JLabel labelDireccion;
	private JTextField campoDireccion;
	private JLabel labelVacio;
	private JButton botonAgregarPersona;
	private JScrollPane scrollConjuntoPersonas;
	private JList listaPersonas;
	private JLabel labelConjuntoPersonas;
	private JButton botonEliminarPersona;
	private ConjuntoGenericoOrdenado<Persona> personas = new ConjuntoGenericoOrdenado();
	private DefaultListModel<Persona> modeloLista = new DefaultListModel();

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 160);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panelAgregarPersona = new JPanel();
		this.contentPane.add(this.panelAgregarPersona, BorderLayout.WEST);
		this.panelAgregarPersona.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.labelNombre = new JLabel("Nombre:");
		this.panelAgregarPersona.add(this.labelNombre);
		
		this.campoNombre = new JTextField();
		this.panelAgregarPersona.add(this.campoNombre);
		this.campoNombre.setColumns(10);
		
		this.labelApellido = new JLabel("Apellido: ");
		this.panelAgregarPersona.add(this.labelApellido);
		
		this.campoApellido = new JTextField();
		this.panelAgregarPersona.add(this.campoApellido);
		this.campoApellido.setColumns(10);
		
		this.labelDireccion = new JLabel("Dirección: ");
		this.panelAgregarPersona.add(this.labelDireccion);
		
		this.campoDireccion = new JTextField();
		this.panelAgregarPersona.add(this.campoDireccion);
		this.campoDireccion.setColumns(10);
		
		this.labelVacio = new JLabel("");
		this.panelAgregarPersona.add(this.labelVacio);
		
		this.botonAgregarPersona = new JButton("Agregar persona");
		this.botonAgregarPersona.addActionListener(this);
		this.panelAgregarPersona.add(this.botonAgregarPersona);
		
		this.panelConjuntoPersonas = new JPanel();
		this.contentPane.add(this.panelConjuntoPersonas, BorderLayout.CENTER);
		this.panelConjuntoPersonas.setLayout(new BorderLayout(0, 0));
		
		this.labelConjuntoPersonas = new JLabel("Personas:");
		this.panelConjuntoPersonas.add(this.labelConjuntoPersonas, BorderLayout.NORTH);
		
		this.scrollConjuntoPersonas = new JScrollPane();
		this.panelConjuntoPersonas.add(this.scrollConjuntoPersonas);
		
		this.listaPersonas = new JList();
		this.scrollConjuntoPersonas.setViewportView(this.listaPersonas);
		this.listaPersonas.setModel(this.modeloLista);
		
		this.botonEliminarPersona = new JButton("Eliminar persona");
		this.botonEliminarPersona.addActionListener(this);
		this.panelConjuntoPersonas.add(this.botonEliminarPersona, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		Iterator<Persona> it;
		if (arg0.getSource() == this.botonAgregarPersona)
		{
			try
			{
				this.personas.agrega(new Persona(this.campoNombre.getText(),this.campoApellido.getText(),this.campoDireccion.getText()));
				this.modeloLista.clear();
				it = this.personas.getIterator();
				while (it.hasNext())
					this.modeloLista.addElement(it.next());
			}
			catch (OperacionConjuntoInvalidaException e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		if (arg0.getSource() == this.botonEliminarPersona)
		{
			try
			{
				this.personas.elimina((Persona) this.listaPersonas.getSelectedValue());
				this.modeloLista.clear();
				it = this.personas.getIterator();
				while (it.hasNext())
					this.modeloLista.addElement(it.next());
			}
			catch (OperacionConjuntoInvalidaException e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}
}
