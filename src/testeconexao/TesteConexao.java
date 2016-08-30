/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeconexao;


 /* import da minha tabela*/
import util.HibernateUtil;  // import da classe util esta classe garante que terá apenas uma sessão aberta no seus sistema com isso temos melhoria de desenpenho no programa
import org.hibernate.Session; //import para uso do Session no hibernate

/**
 *
 * @author CJF
 */
public class TesteConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session conexao = HibernateUtil.getSessionFactory().getCurrentSession();

    
}
}