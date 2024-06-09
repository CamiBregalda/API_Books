package cch_books.view;

import cch_books.http.ClienteHttp;
import cch_books.model.Book;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

public class Tela_Inicial extends javax.swing.JFrame {

    private List<Book> livros = new ArrayList();
    
    public Tela_Inicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLBBuscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jBTNBuscar = new javax.swing.JButton();
        jPNTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBLivros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLBBuscar.setText("Buscar:");

        jLabel2.setText("Quantidade:");

        jBTNBuscar.setText("Buscar");
        jBTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setAlignmentX(1.0F);
        jScrollPane1.setAlignmentY(1.0F);
        jScrollPane1.setInheritsPopupMenu(true);
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setRequestFocusEnabled(false);

        jTBLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Livro", "Autores"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTBLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBLivros);

        javax.swing.GroupLayout jPNTabelaLayout = new javax.swing.GroupLayout(jPNTabela);
        jPNTabela.setLayout(jPNTabelaLayout);
        jPNTabelaLayout.setHorizontalGroup(
            jPNTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(jPNTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
        );
        jPNTabelaLayout.setVerticalGroup(
            jPNTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
            .addGroup(jPNTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBTNBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jPNTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLBBuscar)
                        .addComponent(jBTNBuscar)))
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jPNTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNBuscarActionPerformed
        try {
            livros.clear();
            String busca = jTFBuscar.getText();

            if (busca.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite um termo para busca!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int quantidade;
            try {
                quantidade = Integer.parseInt(jTFQuantidade.getText());
            } catch (NumberFormatException e) {
                quantidade = 0;
            }

            ClienteHttp cliente = new ClienteHttp();
            String url = "https://www.googleapis.com/books/v1/volumes?q=" + busca;
            if (quantidade > 0) {
                url = url += "&maxResults=" + quantidade;
            }
            String json = cliente.buscaDados(url);
            livros = extrairDados(json);

            DefaultTableModel tabela = (DefaultTableModel) jTBLivros.getModel();
            tabela.setRowCount(0);

            for (int i = 0; i < livros.size(); i++) {
                String autores = String.join(", ", livros.get(i).getAutores());
                tabela.addRow(new Object[]{livros.get(i).getTitulo(), autores});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao realizar busca!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBTNBuscarActionPerformed

    private void jTBLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBLivrosMouseClicked
        try {
            String titulo = jTBLivros.getValueAt(jTBLivros.getSelectedRow(), 0).toString();
            
            Detalhes_Livro detalhesLivro = new Detalhes_Livro();
            detalhesLivro.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao abrir detalhes do livro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTBLivrosMouseClicked

    private List<Book> extrairDados(String json){        
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray itensJson = jsonObject.optJSONArray("items");

            if(itensJson != null){
                for (int i = 0; i < itensJson.length(); i++) {
                    try {
                        JSONObject item = itensJson.getJSONObject(i);
                        Book livro = new Book();

                        JSONObject volumeInfo = item.optJSONObject("volumeInfo");
                        JSONObject saleInfo = item.optJSONObject("saleInfo");
                        JSONObject accessInfo = item.optJSONObject("accessInfo");

                        livro.setId(item.optString("id", "Id não encontrado"));

                        if (volumeInfo != null) {
                            livro.setTitulo(volumeInfo.optString("title", "Título não encontrado").trim());
                            livro.setEditora(volumeInfo.optString("publisher", "Editora não encontrado").trim());
                            livro.setEditora(volumeInfo.optString("description", "Descrição não encontrado").trim());

                            List<String> autores = new ArrayList<>();
                            JSONArray autoresJson = volumeInfo.optJSONArray("authors");
                            if (autoresJson != null) {
                                for (int j = 0; j < autoresJson.length(); j++) {
                                    try {
                                        autores.add(autoresJson.getString(j).trim());
                                    } catch (Exception e) {
                                        System.out.println("Erro ao processar autor: " + e.getMessage());
                                    }
                                }
                            }

                            if(autores.isEmpty()){
                                autores.add("Autores desconhecidos");
                            }

                            livro.setAutores(autores);
                        }

                        if(saleInfo != null){
                            livro.setPaisOrigem(saleInfo.optString("country", "País de origem não encontrado").trim());

                            JSONObject listPrice = saleInfo.optJSONObject("listPrice");
                            if (listPrice != null){
                                livro.setValor(listPrice.optDouble("amount", 0.0));
                                livro.setCodMoeda(listPrice.optString("currencyCode", "Código não encontrado").trim());
                            }
                        }

                        if(accessInfo != null){
                            try {
                                livro.setDisponivelPDF(accessInfo.optJSONObject("pdf").optBoolean("isAvailable", false));
                            } catch (Exception e) {
                                System.out.println("Erro ao processar PDF: " + e.getMessage());
                                livro.setDisponivelPDF(false);
                            }

                            try {
                                livro.setDisponivelEPub(accessInfo.optJSONObject("epub").optBoolean("isAvailable", false));
                            } catch (Exception e) {
                                System.out.println("Erro ao processar ePub: " + e.getMessage());
                                livro.setDisponivelEPub(false);
                            }
                        }

                        livros.add(livro);
                    } catch (Exception e) {
                        System.out.println("Erro ao processar item do livro: " + e.getMessage());
                    }
                }
            }

            return livros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tela_Inicial telaInicial = new Tela_Inicial();
                telaInicial.setTitle("Tela Inicial");
                telaInicial.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTNBuscar;
    private javax.swing.JLabel jLBBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPNTabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBLivros;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables
}
