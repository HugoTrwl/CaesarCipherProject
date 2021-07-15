package WebInterfaces;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Hugo Turschwell / Quentin Galpin
 *
 */

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/HomePage")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePage() {
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
        		+ "			label {\r\n"
        		+ "				text-decoration: underline;\r\n"
        		+ "			}\r\n"
        		+ "\r\n"
        		+ "			#PageDetail, #PageSimple {\r\n"
        		+ "				display: none;\r\n"
        		+ "			}\r\n"
        		+ "        </style>\r\n"
        		+ "    </head>\r\n"
        		+ "    <body>\r\n"
        		+ "		<table align='center'>\r\n"
        		+ "			<tr>\r\n"
        		+ "				<td width='30%'></td>\r\n"
        		+ "				<td align='center'>\r\n"
        		+ "					<h1 >Chiffrement Caesar Cipher</h1>\r\n"
        		+ "					<h2>Chiffrez votre mot de passe comme César !</h2>\r\n"
        		+ "				</td>\r\n"
        		+ "				<td width='30%'>\r\n"
        		+ "					<table>\r\n"
        		+ "						<tr align='right'>\r\n"
        		+ "							<td valign='middle' width='80%'>\r\n"
        		+ "								<p>Cliquez ici pour accéder directement à l'outil &rarr;</p>\r\n"
        		+ "							</td>\r\n"
        		+ "							<td>\r\n"
        		+ "								<a href='DetailedPage'><img src='Images/CaesarCipher_Detail2.png' alt='' style='width: 100%;'></a>\r\n"
        		+ "							</td>\r\n"
        		+ "						</tr>\r\n"
        		+ "					</table>\r\n"
        		+ "				</td>\r\n"
        		+ "			</tr>\r\n"
        		+ "		</table>\r\n"
        		+ "        \r\n"
        		+ "        <table align='center' border='1px' width='60%'>\r\n"
        		+ "            <tr align='center'>\r\n"
        		+ "                <td>\r\n"
        		+ "                    <p><strong>La méthode de chiffrement basée sur le chiffre de César, aussi appelée \"chiffrement par décalage\" est \r\n"
        		+ "						la plus ancienne technique utilisée pour chiffrer et déchiffrer des données. Elle trouve son origine au Ier \r\n"
        		+ "						siècle avant JC, à l'époque où Jules César mène de nombreuses batailles. Pour transmettre ses ordres à ses \r\n"
        		+ "						généraux, il utilise une méthode de codage très simple mais particulièrement efficace : une méthode cryptographique \r\n"
        		+ "						de substitution maintenant appelée le \"code de César\".<br><br>\r\n"
        		+ "						Le principe de cette méthode est simple : chaque lettre d'un message est remplacée par une autre suivant un décalage \r\n"
        		+ "						donné dans l'alphabet, cette valeur de décalage est appelée \"clé\". Un exemple tout simple est celui-ci : en considérant \r\n"
        		+ "						que l'on prend un décalage de 5, la lettre \"a\" se transformera en \"f\". Donc en suivant le chiffrement de César, le mot \r\n"
        		+ "						\"art\" chiffré deviendra le mot \"fwy\".</strong>\r\n"
        		+ "					</p>\r\n"
        		+ "                </td>\r\n"
        		+ "            </tr>\r\n"
        		+ "        </table>\r\n"
        		+ "\r\n"
        		+ "		<br>\r\n"
        		+ "\r\n"
        		+ "		<table align='center' width='80%'>\r\n"
        		+ "			<tr>\r\n"
        		+ "				<td align='center'>\r\n"
        		+ "					<form method='GET' id='quiz'>\r\n"
        		+ "						<h2 align='center'>Répondez à ce rapide quiz pour continuer :</h2>\r\n"
        		+ "		\r\n"
        		+ "						<label for='question1'>Comment appelle-t-on la plus connue des premières méthodes de chiffrement ?</label><br><br>\r\n"
        		+ "						<input type='radio' name='question1' value='1.1'>le code d'Alexandrie\r\n"
        		+ "						<input type='radio' name='question1' value='1.2'>la numération préhistorique\r\n"
        		+ "						<input type='radio' name='question1' value='1.3'>le chiffre de César\r\n"
        		+ "						<input type='radio' name='question1' value='1.4'>l'algorithme d'Euclide\r\n"
        		+ "						\r\n"
        		+ "						<br>\r\n"
        		+ "						<br>\r\n"
        		+ "						<br>\r\n"
        		+ "\r\n"
        		+ "						<label for='question2'>Comment fonctionne-t-elle ?</label><br><br>\r\n"
        		+ "						<input type='radio' name='question2' value='2.1'>on décale les lettres dans l'alphabet pour rendre les mots incompréhensibles<br>\r\n"
        		+ "						<input type='radio' name='question2' value='2.2'>on inverse l'ordre des lettres dans les mots pour les transformer<br>\r\n"
        		+ "						<input type='radio' name='question2' value='2.3'>on transforme toutes les lettres en nombres pour faire croire que ce n'est pas une phrase<br>\r\n"
        		+ "		\r\n"
        		+ "						<br>\r\n"
        		+ "						<br>\r\n"
        		+ "\r\n"
        		+ "						<label for='question3'>En considérant que l'algorithme de chiffrement dont nous parlons ici utilise un décalage de trois lettres, sauriez-vous déchiffrer le mot « fbforqh » ?</label><br><br>\r\n"
        		+ "						<input type='radio' name='question3' value='3.1'>carotte\r\n"
        		+ "						<input type='radio' name='question3' value='3.2'>abattue\r\n"
        		+ "						<input type='radio' name='question3' value='3.3'>cyclone\r\n"
        		+ "						<input type='radio' name='question3' value='3.2'>Pologne\r\n"
        		+ "						<input type='radio' name='question3' value='3.3'>ça ne veut rien dire\r\n"
        		+ "		\r\n"
        		+ "						<br>\r\n"
        		+ "						<br>\r\n"
        		+ "						<br>\r\n"
        		+ "\r\n"
        		+ "						<label for='question4'>Lequel des mots de passe suivants peut être considéré comme le plus sûr ?</label><br><br>\r\n"
        		+ "						<input type='radio' name='question4' value='4.1'>P@ssw0rd\r\n"
        		+ "						<input type='radio' name='question4' value='4.2'>Y*opx04>O\r\n"
        		+ "						<input type='radio' name='question4' value='4.3'>Jane7669\r\n"
        		+ "		\r\n"
        		+ "						<br>\r\n"
        		+ "						<br>\r\n"
        		+ "						<br>\r\n"
        		+ "		\r\n"
        		+ "						<input type='button' value='Soumettre' onclick='qcm()'>\r\n"
        		+ "		\r\n"
        		+ "					</form>\r\n"
        		+ "\r\n"
        		+ "					<p id='PageSimple'>\r\n"
        		+ "						D'après vos réponses justes (<input type='text' style='width: 1%;' id='reponses1' readonly>/4), nous vous recommandons de suivre le lien ci-dessous &darr;<br><br>\r\n"
        		+ "						<a href='SimplifiedPage'><img src='Images/CaesarCipher_Simple2.png' alt='' style='width: 25%;'></a>\r\n"
        		+ "					</p>\r\n"
        		+ "					\r\n"
        		+ "					<p id='PageDetail'>\r\n"
        		+ "						D'après vos réponses justes (<input type='text' style='width: 1%;' id='reponses2' readonly>/4), nous vous recommandons de suivre le lien ci-dessous &darr;<br><br>\r\n"
        		+ "						<a href='DetailedPage'><img src='Images/CaesarCipher_Detail2.png' alt='' style='width: 25%;'></a>\r\n"
        		+ "					</p>\r\n"
        		+ "					\r\n"
        		+ "				</td>\r\n"
        		+ "			</tr>\r\n"
        		+ "		</table>\r\n"
        		+ "\r\n"
        		+ "		<script type='text/javascript'>\r\n"
        		+ "			function qcm() {\r\n"
        		+ "				reponse_juste = 0;\r\n"
        		+ "	\r\n"
        		+ "				var q1 = document.querySelector('input[name=question1]:checked').value\r\n"
        		+ "				var q2 = document.querySelector('input[name=question2]:checked').value\r\n"
        		+ "				var q3 = document.querySelector('input[name=question3]:checked').value\r\n"
        		+ "				var q4 = document.querySelector('input[name=question4]:checked').value\r\n"
        		+ "	\r\n"
        		+ "				if (q1 == '1.3') {\r\n"
        		+ "					reponse_juste++;\r\n"
        		+ "				}\r\n"
        		+ "				if (q2 == '2.1') {\r\n"
        		+ "					reponse_juste++;\r\n"
        		+ "				}\r\n"
        		+ "				if (q3 == '3.3') {\r\n"
        		+ "					reponse_juste++;\r\n"
        		+ "				}\r\n"
        		+ "				if (q4 == '4.2') {\r\n"
        		+ "					reponse_juste++;\r\n"
        		+ "				}\r\n"
        		+ "	\r\n"
        		+ "				document.getElementById('reponses1').value = reponse_juste;\r\n"
        		+ "				document.getElementById('reponses2').value = reponse_juste;\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "				if (reponse_juste > 2) {\r\n"
        		+ "					document.getElementById('quiz').style.display = 'none';\r\n"
        		+ "					document.getElementById('PageSimple').style.display = 'block';\r\n"
        		+ "				} else {\r\n"
        		+ "					document.getElementById('quiz').style.display = 'none';\r\n"
        		+ "					document.getElementById('PageDetail').style.display = 'block';\r\n"
        		+ "				}\r\n"
        		+ "			}\r\n"
        		+ "		</script>\r\n"
        		+ "    </body>\r\n"
        		+ "</html>");
        }
}