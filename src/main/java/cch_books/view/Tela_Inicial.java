package cch_books.view;

import cch_books.http.ClienteHttp;
import cch_books.model.Book;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
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

        jPanel1.setBackground(new java.awt.Color(84, 0, 84));

        jTFBuscar.setBackground(new java.awt.Color(216, 202, 229));

        jLBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jLBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jLBBuscar.setText("Buscar:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantidade:");

        jTFQuantidade.setBackground(new java.awt.Color(216, 202, 229));

        jBTNBuscar.setBackground(new java.awt.Color(168, 128, 168));
        jBTNBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBTNBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBTNBuscar.setText("Buscar");
        jBTNBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(84, 0, 84));
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
        jTBLivros.setGridColor(new java.awt.Color(255, 255, 255));
        jTBLivros.setRowSelectionAllowed(false);
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
            .addGap(0, 667, Short.MAX_VALUE)
            .addGroup(jPNTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPNTabelaLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPNTabelaLayout.setVerticalGroup(
            jPNTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
            .addGroup(jPNTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPNTabelaLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(jBTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jPNTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBBuscar)
                    .addComponent(jBTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(398, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jPNTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNBuscarActionPerformed
        try {
            livros.clear();
            String busca = jTFBuscar.getText();
            busca = busca.replace(" ", ""); 

            if (busca.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite um termo para busca!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int quantidade = 30;
            try {
                String quantidadeText = jTFQuantidade.getText();
                if (!quantidadeText.isEmpty()) {
                    quantidade = (int) Math.round(Double.parseDouble(quantidadeText));
                    
                    if (quantidade > 40){
                        JOptionPane.showMessageDialog(this, "Quantidade máxima suportada pela API: 40 livros!", "Information", JOptionPane.INFORMATION_MESSAGE);
                        quantidade = 40;
                        jTFQuantidade.setText(String.valueOf(quantidade));
                    }
                } else {
                    jTFQuantidade.setText(String.valueOf(quantidade));
                }
            } catch (NumberFormatException e) {
                jTFQuantidade.setText(String.valueOf(quantidade));
                JOptionPane.showMessageDialog(this, "Formato do dado inválido no campo quantidade Utilize somente valores inteiros. Busca usando valor padrão: 30", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            try {
                ClienteHttp cliente = new ClienteHttp();
                String url = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&maxResults=" + quantidade;
                String json = cliente.buscaDados(url);
                livros = extrairDados(json);
            } catch (JSONException e) {
                e.printStackTrace();
            }

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

            for (Book livro : livros) {
                if(livro.getTitulo().equals(titulo)){
                     
                    Detalhes_Livro detalhesLivro = new Detalhes_Livro(this, true);
                    detalhesLivro.recebeDados(livro);
                    detalhesLivro.setModal(true);
                    detalhesLivro.pack();
                    detalhesLivro.setLocationRelativeTo(this);
                    detalhesLivro.setVisible(true);
                    
                    break;
                }
            }
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

                        try {
                            if (volumeInfo != null) {
                                livro.setTitulo(volumeInfo.optString("title", "Título não encontrado").trim());
                                livro.setEditora(volumeInfo.optString("publisher", "Editora não encontrada").trim());
                                livro.setDescricao(volumeInfo.optString("description", "Descrição não encontrada").trim());

                                List<String> autores = new ArrayList<>();
                                try {
                                    JSONArray autoresJson = volumeInfo.optJSONArray("authors");
                                    if (autoresJson != null) {
                                        for (int j = 0; j < autoresJson.length(); j++) {
                                            autores.add(autoresJson.getString(j).trim());
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao processar autor: " + e.getMessage());
                                }

                                if(autores.isEmpty()){
                                    autores.add("Autores desconhecidos");
                                }

                                livro.setAutores(autores);

                                try {
                                    livro.setThumbnailUrl(volumeInfo.optJSONObject("imageLinks").optString("thumbnail").trim());
                                } catch (Exception e) {
                                    System.out.println(livro.getTitulo());
                                    livro.setThumbnailUrl("Imagem não encontrada");
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao processar volumeInfo: " + e.getMessage());
                        }
                        
                        try {
                            if(saleInfo != null){
                                livro.setPaisOrigem(saleInfo.optString("country", "País de origem não encontrado").trim());

                                try {
                                    JSONObject listPrice = saleInfo.optJSONObject("listPrice");
                                    if (listPrice != null){
                                        livro.setValor(listPrice.optDouble("amount"));
                                        livro.setCodMoeda(listPrice.optString("currencyCode").trim());
                                    }
                                } catch (Exception e) {
                                    System.out.println("Erro ao processar listPrice: " + e.getMessage());
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao processar saleInfo: " + e.getMessage());
                        }
                        
                        try {
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
                        } catch (Exception e) {
                            System.out.println("Erro ao processar saleInfo: " + e.getMessage());
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
