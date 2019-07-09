/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Administrador
 */
public class ControladorProfessor {

    static {
        public static void inserir(ManutencaoProfessor man){
        professor objeto = new professor();
        objeto.setNome(man.jtfNome.getText());
        objeto.setSobrenome(man.jtfSobrenome.getText());
        objeto.setEndereço(man.jtfEndereço.getText());
        
        boolean resultado = ProfessorDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
