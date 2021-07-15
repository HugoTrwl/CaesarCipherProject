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
 * Servlet implementation class DetailedPage
 */
@WebServlet("/DetailedPage")
public class DetailedPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailedPage() {
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
        		+ "            #cesar1 {\r\n"
        		+ "                vertical-align: middle;\r\n"
        		+ "                width: 4em;\r\n"
        		+ "            }\r\n"
        		+ "            \r\n"
        		+ "            .cesar {\r\n"
        		+ "                width: 5em;\r\n"
        		+ "            }\r\n"
        		+ "\r\n"
        		+ "            #msg_aide1, #msg_aide2, #msg_aide3, #msg_aide4 {\r\n"
        		+ "                display: none;\r\n"
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
        		+ "                    <a href='SimplifiedPage'><img src='Images/CaesarCipher_Detail.png' alt='' width='70%'></a>\r\n"
        		+ "                </td>\r\n"
        		+ "            </tr>\r\n"
        		+ "        </table>\r\n"
        		+ "        \r\n"
        		+ "        <table align='center' border='1px' width='40%'>\r\n"
        		+ "            <tr align='center'>\r\n"
        		+ "                <td>\r\n"
        		+ "                    <p><strong>Le chemin ci-dessous vous guidera à travers l'utilisation du chiffrement de César &darr;<br>\r\n"
        		+ "                        Vous trouverez à chaque étape un bouton « aide » <img id='cesar1' src='Images/cesar_question.png' alt='César_Aide'> si vous êtes perdu !</strong></p>\r\n"
        		+ "                </td>\r\n"
        		+ "            </tr>\r\n"
        		+ "        </table>\r\n"
        		+ "\r\n"
        		+ "        <form method='GET'><br>\r\n"
        		+ "        <table align='center' border='1px' width='70%'>\r\n"
        		+ "            <tr>\r\n"
        		+ "                <td>\r\n"
        		+ "                    <table align='center' width='95%'>\r\n"
        		+ "                        <tr>\r\n"
        		+ "                            <td>\r\n"
        		+ "                                <table>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td colspan='2'>\r\n"
        		+ "                                            <label for='textIn'>I. Entrez les informations que vous souhaitez chiffrer/déchiffrer :</label>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td width='25%'>\r\n"
        		+ "                                <textarea id='textIn' name='textIn' rows='5' cols='45' required>");
		
		if (request.getParameter("textIn") != null) {
    		out.println(request.getParameter("textIn") + "</textarea>");
        }
		
		out.println("</textarea>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                        <td>\r\n"
        		+ "                                            <table>\r\n"
        		+ "                                                <tr>\r\n"
        		+ "                                                    <td>\r\n"
        		+ "                                                        <img class='cesar' id='cesarAide1' src='Images/cesar_question.png' alt='César_Aide'>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                    <td id='msg_aide1'>\r\n"
        		+ "                                                        <p><i>C'est dans cette case que vous devez entrer le texte clair ou chiffré de votre choix.\r\n"
        		+ "                                                            Le chiffrement de César ne prend pas en compte les accents donc il ne faut pas mettre des lettres qui en comportent.\r\n"
        		+ "                                                            Les majuscules sont toutefois prises en compte !</i></p>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                </tr>\r\n"
        		+ "                                            </table>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='left' colspan='2'>\r\n"
        		+ "                                            <img width='60%' src='Images/road_g-d_1.png' alt=''>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td colspan='2'>\r\n"
        		+ "                                            <table width='100%'>\r\n"
        		+ "                                                <tr>\r\n"
        		+ "                                                    <td colspan='2'>\r\n"
        		+ "                                                        <table width='100%'>\r\n"
        		+ "                                                            <td width='55%'></td>\r\n"
        		+ "                                                            <td align='left'>\r\n"
        		+ "                                                                <label for='shift'>II. Entrez une valeur de décalage :</label>\r\n"
        		+ "                                                            </td>\r\n"
        		+ "                                                        </table>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                </tr>\r\n"
        		+ "                                                <tr>\r\n"
        		+ "                                                    <td align='right'>\r\n"
        		+ "                                                        <table>\r\n"
        		+ "                                                            <tr>\r\n"
        		+ "                                                                <td id='msg_aide2'>\r\n"
        		+ "                                                                    <p><i>La valeur que vous devez indiquer ici correspond au décalage qui sera appliqué à chacune des lettres de votre message \r\n"
        		+ "                                                                        entré dans la partie I. Veulliez noter que la liste déroulante s'arrête au numéro 25 car la valeur suivante : 26 correspond\r\n"
        		+ "                                                                        à la même chose que la valeur initiale car il n'y a que 25 possibilités de décalage avec un alphabet de 26 lettres.</i></p>\r\n"
        		+ "                                                                </td>\r\n"
        		+ "                                                                <td>\r\n"
        		+ "                                                                    <img class='cesar' id='cesarAide2' src='Images/cesar_question.png' alt='César_Aide'>\r\n"
        		+ "                                                                </td>\r\n"
        		+ "                                                            </tr>\r\n"
        		+ "                                                        </table>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                    <td width='40%'>\r\n"
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
        		+ "                                                        \r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                </tr>\r\n"
        		+ "                                            </table>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='center' colspan='2'>\r\n"
        		+ "                                            <img width='60%' src='Images/road_d-g_1.png' alt=''>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='left' colspan='2'>\r\n"
        		+ "                                            <label for='checkbox'>III. Sélectionnez les options souhaitées (pour le chiffrement exclusivement) :</label>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='left'>\r\n"
        		+ "                                            <input type='checkbox' name ='upper'><label for='upper'>Ajout de majuscules aléatoires</label><br>\r\n"
        		+ "                                            <input type='checkbox' name='randomnumber'><label for='randomnumber'>Ajout de chiffres aléatoires</label><br>\r\n"
        		+ "                                            <input type='checkbox' name='randomsymbol'><label for='randomsymbol'>Ajout de symboles aléatoires</label>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                        <td>\r\n"
        		+ "                                            <table>\r\n"
        		+ "                                                <tr>\r\n"
        		+ "                                                    <td>\r\n"
        		+ "                                                        <img class='cesar' id='cesarAide3' src='Images/cesar_question.png' alt='César_Aide'>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                    <td id='msg_aide3'>\r\n"
        		+ "                                                        <p><i>Cette partie s'adresse aux utilisateurs souhaitant se créer des mots de passe robuste en utilisant la méthode de\r\n"
        		+ "                                                            chiffrement de César. Il est important de rappeler que cet aspect ne correspond pas à l'utilisation originale que l'on faisait\r\n"
        		+ "                                                            de cet outil. Il était en effet utilisé exclusivement pour chiffrer des messages composés de lettres !</i></p>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                </tr>\r\n"
        		+ "                                            </table>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='left' colspan='2'>\r\n"
        		+ "                                            <img width='60%' src='Images/road_g-d_2.png' alt=''>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td colspan='2'>\r\n"
        		+ "                                            <table width='100%'>\r\n"
        		+ "                                                <tr>\r\n"
        		+ "                                                    <td colspan='2'>\r\n"
        		+ "                                                        <table width='100%'>\r\n"
        		+ "                                                            <td width='55%'></td>\r\n"
        		+ "                                                            <td align='left'>\r\n"
        		+ "                                                                <label for='result'>IV. Sélectionnez le résultat recherché :</label>\r\n"
        		+ "                                                            </td>\r\n"
        		+ "                                                        </table>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                </tr>\r\n"
        		+ "                                                <tr>\r\n"
        		+ "                                                    <td align='right'>\r\n"
        		+ "                                                        <table>\r\n"
        		+ "                                                            <tr>\r\n"
        		+ "                                                                <td id='msg_aide4'>\r\n"
        		+ "                                                                    <p><i>Cette dernière étape est celle qui définit le type de résultat que vous allez obtenir. Si vous souhaitez chiffrer un message\r\n"
        		+ "                                                                        (pour notamment créer un mot de passe), cliquez sur \"Chiffrer\". Si vous souhaitez déchiffrer un message qui a été préalablement chiffré\r\n"
        		+ "                                                                        à l'aide du chiffre de César et pour lequel vous avez connaissance de la clé de décalage utilisée, cliquez sur \"Dechiffrer\". Enfin, si\r\n"
        		+ "                                                                        vous n'avez malheureusement pas l'information de la clé utilisée, cliquez sur \"Force brute\" et cela vous donnera toutes les possibilités\r\n"
        		+ "                                                                        de déchiffrement.</i></p>\r\n"
        		+ "                                                                </td>\r\n"
        		+ "                                                                <td>\r\n"
        		+ "                                                                    <img class='cesar' id='cesarAide4' src='Images/cesar_question.png' alt='César_Aide'>\r\n"
        		+ "                                                                </td>\r\n"
        		+ "                                                            </tr>\r\n"
        		+ "                                                        </table>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                    <td align='left' width='40%'>\r\n"
        		+ "                                                        <input class='submit' type='submit' name='result' value='Chiffrer'>\r\n"
        		+ "                                                        <input class='submit' type='submit' name='result' value='Dechiffrer'>\r\n"
        		+ "                                                        <input class='submit' type='submit' name='result' value='Force brute'>\r\n"
        		+ "                                                    </td>\r\n"
        		+ "                                                </tr>\r\n"
        		+ "                                            </table>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='right' colspan='2'>\r\n"
        		+ "                                            <img width='60%' src='Images/road_d-g_2.png' alt=''>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='center' colspan='2'>\r\n"
        		+ "                                            <label for='textOut'>V. Résultat :</label>\r\n"
        		+ "                                        </td>\r\n"
        		+ "                                    </tr>\r\n"
        		+ "                                    <tr>\r\n"
        		+ "                                        <td align='center' colspan='2'>\r\n"
        		+ "                                            <textarea id='textOut' rows='5' cols='45'>");
        
        if (request.getParameter("result") == null) {
        	out.println("</textarea>\r\n"
        			+ "                                        </td>\r\n"
        			+ "                                    </tr>\r\n"
        			+ "                                </table>\r\n"
        			+ "                            </td>\r\n"
        			+ "                        </tr>\r\n"
        			+ "                    </table>\r\n"
        			+ "                </td>\r\n"
        			+ "            </tr>\r\n"
        			+ "        </table>\r\n"
        			+ "        </form>\r\n"
        			+ "\r\n"
        			+ "        <script language='javascript'>\r\n"
        			+ "            document.getElementById('cesarAide1').onclick = function() {\r\n"
        			+ "                document.getElementById('msg_aide1').style.display = 'block';\r\n"
        			+ "            }\r\n"
        			+ "\r\n"
        			+ "            document.getElementById('cesarAide2').onclick = function() {\r\n"
        			+ "                document.getElementById('msg_aide2').style.display = 'block';\r\n"
        			+ "            }\r\n"
        			+ "\r\n"
        			+ "            document.getElementById('cesarAide3').onclick = function() {\r\n"
        			+ "                document.getElementById('msg_aide3').style.display = 'block';\r\n"
        			+ "            }\r\n"
        			+ "\r\n"
        			+ "            document.getElementById('cesarAide4').onclick = function() {\r\n"
        			+ "                document.getElementById('msg_aide4').style.display = 'block';\r\n"
        			+ "            }\r\n"
        			+ "        </script>\r\n"
        			+ "    </body>\r\n"
        			+ "</html>");
        } else {
        	if (request.getParameter("result").matches("Chiffrer") && request.getParameter("upper") == null && request.getParameter("randomnumber") == null && request.getParameter("randomsymbol") == null) {
        		/**
        		 * Appel de la méthode Encryption() de la classe Scripts
        		 */
            	out.println(Scripts.Encryption(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Dechiffrer")) {
            	/**
        		 * Appel de la méthode Decryption() de la classe Scripts
        		 */
            	out.println(Scripts.Decryption(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Chiffrer") && request.getParameter("upper") != null && request.getParameter("randomnumber") == null && request.getParameter("randomsymbol") == null) {
            	/**
        		 * Appel de la méthode EncryptionU() de la classe Scripts
        		 */
            	out.println(Scripts.EncryptionU(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Chiffrer") && request.getParameter("randomnumber") != null && request.getParameter("upper") == null && request.getParameter("randomsymbol") == null) {
            	/**
        		 * Appel de la méthode EncryptionN() de la classe Scripts
        		 */
            	out.println(Scripts.EncryptionN(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Chiffrer") && request.getParameter("randomsymbol") != null && request.getParameter("upper") == null && request.getParameter("randomnumber") == null) {
            	/**
        		 * Appel de la méthode EncryptionS() de la classe Scripts
        		 */
            	out.println(Scripts.EncryptionS(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Chiffrer") && request.getParameter("upper") != null && request.getParameter("randomnumber") != null && request.getParameter("randomsymbol") == null) {
            	/**
        		 * Appel de la méthode EncryptionUN() de la classe Scripts
        		 */
            	out.println(Scripts.EncryptionUN(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Chiffrer") && request.getParameter("upper") != null && request.getParameter("randomsymbol") != null && request.getParameter("randomnumber") == null) {
            	/**
        		 * Appel de la méthode EncryptionSU() de la classe Scripts
        		 */
            	out.println(Scripts.EncryptionSU(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Chiffrer") && request.getParameter("randomnumber") != null && request.getParameter("randomsymbol") != null && request.getParameter("upper") == null) {
            	/**
        		 * Appel de la méthode EncryptionSN() de la classe Scripts
        		 */
            	out.println(Scripts.EncryptionSN(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Chiffrer") && request.getParameter("upper") != null && request.getParameter("randomnumber") != null && request.getParameter("randomsymbol") != null) {
            	/**
        		 * Appel de la méthode EncryptionSUN() de la classe Scripts
        		 */
            	out.println(Scripts.EncryptionSUN(request.getParameter("shift"), request.getParameter("textIn")) + "</textarea>");
            } else if (request.getParameter("result").matches("Force brute")) {
            	/**
        		 * Appel de la méthode produceBruteForce() de la classe Scripts
        		 */
            	try {
                	out.println(Scripts.producePlaintext(request.getParameter("textIn")) + "</textarea>");
            	} catch (ArrayIndexOutOfBoundsException e) {
            		e.printStackTrace();
            		out.println("Le déchiffrement par force brute n'a pas fonctionné. Vérifiez que vous n'avez pas mis d'accent ou fait de retour à la ligne dans la partie I !</textarea>");
            	}
            } 
            
            out.println("</td>\r\n"
            		+ "                                    </tr>\r\n"
            		+ "                                </table>\r\n"
            		+ "                            </td>\r\n"
            		+ "                        </tr>\r\n"
            		+ "                    </table>\r\n"
            		+ "                </td>\r\n"
            		+ "            </tr>\r\n"
            		+ "        </table>\r\n"
            		+ "        </form>\r\n"
            		+ "\r\n"
            		+ "        <script language='javascript'>\r\n"
            		+ "            document.getElementById('cesarAide1').onclick = function() {\r\n"
            		+ "                document.getElementById('msg_aide1').style.display = 'block';\r\n"
            		+ "            }\r\n"
            		+ "\r\n"
            		+ "            document.getElementById('cesarAide2').onclick = function() {\r\n"
            		+ "                document.getElementById('msg_aide2').style.display = 'block';\r\n"
            		+ "            }\r\n"
            		+ "\r\n"
            		+ "            document.getElementById('cesarAide3').onclick = function() {\r\n"
            		+ "                document.getElementById('msg_aide3').style.display = 'block';\r\n"
            		+ "            }\r\n"
            		+ "\r\n"
            		+ "            document.getElementById('cesarAide4').onclick = function() {\r\n"
            		+ "                document.getElementById('msg_aide4').style.display = 'block';\r\n"
            		+ "            }\r\n"
            		+ "            \r\n"
            		+ "            window.onload = function () {\r\n"
            		+ "                window.scrollTo(0, 10000);\r\n"
            		+ "            }\r\n"
            		+ "        </script>\r\n"
            		+ "    </body>\r\n"
            		+ "</html>");
        }
	}
}