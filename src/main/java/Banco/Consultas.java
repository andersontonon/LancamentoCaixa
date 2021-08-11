/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Anderson Tonon
 */
public class Consultas{
    
    public static String BUSCA_USER = "SELECT * FROM usuarios";
    public static String CADASTRO_LANCAMENTO = "INSERT INTO lancamentos (lanc_nome, lanc_pdv, lanc_suprimentos, lanc_vendaprazo, lanc_pos, lanc_tef, lanc_vendarecebimento, lanc_sangria, lanc_recebimentos, lanc_saldo, lanc_data) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    public static String BUSCA_LANCAMENTOS = "SELECT * FROM lancamentos WHERE lanc_nome = ?";
    public static String BUSCA_LANCAMENTOS_SEM_DATA = "SELECT DISTINCT lanc_data FROM lancamentos";
    public static String BUSCA_LANCAMENTOS_DATA = "SELECT * FROM lancamentos WHERE lanc_data = ?";
    public static String REMOVE_USER = "DELETE FROM usuarios WHERE id = ";
    public static String CADASTRO_USER = "INSERT INTO usuarios (usuario, nome, senha) VALUES (?,?,?)";
    public static String EDITAR_USER = "UPDATE usuarios SET usuario = ?, nome = ?, senha = ? WHERE id = ?";
    
}
