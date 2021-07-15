package WebInterfaces;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Scripts.Scripts;

/**
 * @author Hugo Turschwell / Quentin Galpin
 *
 */

/**
 * Servlet implementation class SimplifiedPage
 */
@WebServlet("/SimplifiedPage")
public class SimplifiedPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimplifiedPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
        out.println("<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "    <head>\r\n"
        		+ "        <style>\r\n"
        		+ "            @font-face {\r\n"
        		+ "                font-family: 'caesar_font';\r\n"
        		+ "                src: url('Police/CAESAR.TTF');\r\n"
        		+ "            }\r\n"
        		+ "            \r\n"
        		+ "            body {\r\n"
        		+ "                background-image: url('https://wallpaperaccess.com/full/1659880.jpg');\r\n"
        		+ "                background-size: cover;\r\n"
        		+ "                background-repeat: repeat-y;\r\n"
        		+ "                \r\n"
        		+ "                font-family: 'caesar_font', Helvetica, Arial, sans-serif;\r\n"
        		+ "                font-weight: bold;\r\n"
        		+ "            }\r\n"
        		+ "\r\n"
        		+ "            h1 {\r\n"
        		+ "                font-size: 3em;\r\n"
        		+ "                text-decoration: underline;\r\n"
        		+ "            }\r\n"
        		+ "\r\n"
        		+ "            #CaesarCipherWheel {\r\n"
        		+ "                display: block;\r\n"
        		+ "                margin-left: auto;\r\n"
        		+ "                margin-right: auto;\r\n"
        		+ "                width: 20%;\r\n"
        		+ "            }\r\n"
        		+ "        </style>\r\n"
        		+ "    </head>\r\n"
        		+ "    <body>\r\n"
        		+ "        <table>\r\n"
        		+ "            <tr align='center'>\r\n"
        		+ "                <td align='left' width='20%'>\r\n"
        		+ "                    <a href='HomePage'><img src='Images/CaesarCipherWheel_Accueil.png' alt='' width='50%'></a>\r\n"
        		+ "                </td>\r\n"
        		+ "                <td>\r\n"
        		+ "                    <h1>Chiffrement Caesar Cipher</h1>\r\n"
        		+ "                    <h2>Chiffrez votre mot de passe comme César !</h2>\r\n"
        		+ "                </td>\r\n"
        		+ "                <td align='right' width='20%'>\r\n"
        		+ "                    <a href='DetailedPage'><img src='Images/CaesarCipher_Simple.png' alt='' width='70%'></a>\r\n"
        		+ "                </td>\r\n"
        		+ "            </tr>\r\n"
        		+ "        </table>\r\n"
        		+ "\r\n"
        		+ "        <form method='GET'><br>\r\n"
        		+ "        <table align='center' border='1px'>\r\n"
        		+ "            <tr>\r\n"
        		+ "                <td>\r\n"
        		+ "                    <table>\r\n"
        		+ "                        <tr>\r\n"
        		+ "                            <td>\r\n"
        		+ "                                <label for='textIn'>Entrez votre texte :</label>\r\n"
        		+ "                            </td>\r\n"
        		+ "                            <td></td>\r\n"
        		+ "                            <td>\r\n"
        		+ "                                <label for='textOut'>Résultat :</label>\r\n"
        		+ "                            </td>\r\n"
        		+ "                        <tr>\r\n"
        		+ "                            <td>\r\n"
        		+ "                                <textarea id='textIn' name='textIn' rows='5' cols='33' required>");
        		
		if (request.getParameter("textIn") != null) {
    		out.println(request.getParameter("textIn") + "</textarea>");
        }
		
		out.println("</textarea>\r\n"
        		+ "                            </td>\r\n"
        		+ "                            <td>\r\n"
        		+ "                                <table>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td width='10px'>\r\n"
        		+ "                                                        <select name=\"shift\" required>\r\n"
        		+ "                                                            <option disabled>--Choisissez une valeur de décalage--</option>\r\n"
        		+ "                                                            <option>1</option>\r\n"
        		+ "                                                            <option>2</option>\r\n"
        		+ "                                                            <option>3</option>\r\n"
        		+ "                                                            <option>4</option>\r\n"
        		+ "                                                            <option>5</option>\r\n"
        		+ "                                                            <option>6</option>\r\n"
        		+ "                                                            <option>7</option>\r\n"
        		+ "                                                            <option>8</option>\r\n"
        		+ "                                                            <option>9</option>\r\n"
        		+ "                                                            <option>10</option>\r\n"
        		+ "                                                            <option>11</option>\r\n"
        		+ "                                                            <option>12</option>\r\n"
        		+ "                                                            <option>13</option>\r\n"
        		+ "                                                            <option>14</option>\r\n"
        		+ "                                                            <option>15</option>\r\n"
        		+ "                                                            <option>16</option>\r\n"
        		+ "                                                            <option>17</option>\r\n"
        		+ "                                                            <option>18</option>\r\n"
        		+ "                                                            <option>19</option>\r\n"
        		+ "                                                            <option>20</option>\r\n"
        		+ "                                                            <option>21</option>\r\n"
        		+ "                                                            <option>22</option>\r\n"
        		+ "                                                            <option>23</option>\r\n"
        		+ "                                                            <option>24</option>\r\n"
        		+ "                                                            <option>25</option>\r\n"
        		+ "                                                        </select>\r\n"        		
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='center'>\r\n"
        		+ "                                            <input type='submit' name='result' value='Chiffrer'>\r\n"
        		+ "                                            <input type='submit' name='result' value='Dechiffrer'>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                </table>\r\n"
        		+ "                            </td>\r\n"
        		+ "                            <td>\r\n"
        		+ "                                <textarea id='textOut' rows='5' cols='33'>");
        
        if (request.getParameter("result") == null) {
        	out.println("</textarea>\r\n"
        			+ "                            </td>\r\n"
        			+ "                        </tr>\r\n"
        			+ "                    </table>\r\n"
        			+ "                </td>\r\n"
        			+ "            </tr>\r\n"
        			+ "        </table>\r\n"
        			+ "        </form>\r\n"
        			+ "\r\n"
        			+ "        <br><br><br>\r\n"
        			+ "\r\n"
        			+ "        <img id='CaesarCipherWheel' src='Images/CaesarCipher.png' alt=''>\r\n"
        			+ "    </body>\r\n"
        			+ "</html>");
        } else {
            if (request.getParameter("result").matches("Chiffrer")) {
            	/**
        		 * Appel de la méthode Encryption() de la classe Scripts
        		 */
            	out.println(Scripts.Encryption(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Dechiffrer")) {
            	/**
        		 * Appel de la méthode Decryption() de la classe Scripts
        		 */
            	out.println(Scripts.Decryption(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            }
            
            
        	out.println("</td>\r\n"
        			+ "                        </tr>\r\n"
        			+ "                    </table>\r\n"
        			+ "                </td>\r\n"
        			+ "            </tr>\r\n"
        			+ "        </table>\r\n"
        			+ "        </form>\r\n"
        			+ "\r\n"
        			+ "        <br><br><br>\r\n"
        			+ "\r\n"
        			+ "        <img id='CaesarCipherWheel' src='Images/CaesarCipher.png' alt=''>\r\n"
        			+ "    </body>\r\n"
        			+ "</html>");
        }
        
	}

}