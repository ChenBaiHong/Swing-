package WindowBuider_JList����;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class WindowBuider_JList extends JFrame {

	private JPanel contentPane;
	/**
	 * �б�
	 */
	@SuppressWarnings("rawtypes")
	JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuider_JList frame = new WindowBuider_JList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public WindowBuider_JList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		/*
		 * ��������Լ��Ĳ���
		 */
		setContentPane(contentPane);
		
		list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				/*
				 * ��ȡ��list�ؼ���ѡ��ĵ�ֵ
				 */
				System.out.println(list.getSelectedValue());
			}
		});
	
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"A", "B", "C", "D", "E"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list, BorderLayout.CENTER);
	}

}
