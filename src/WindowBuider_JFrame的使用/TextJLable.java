package WindowBuider_JFrameµÄÊ¹ÓÃ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class TextJLable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextJLable frame = new TextJLable();
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
	public TextJLable() {
		setForeground(new Color(255, 0, 0));
		setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		setTitle("\u6807\u7B7E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u8B66\u544A\u9519\u8BEF\uFF01");
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBackground(new Color(220, 20, 60));
		lblNewLabel.setIcon(new ImageIcon(TextJLable.class.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif")));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.ITALIC, 12));
		lblNewLabel.setToolTipText("\u5C0F\u5FC3.......!");
		contentPane.add(lblNewLabel, BorderLayout.WEST);
	}

}
