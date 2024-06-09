
package cch_books.view;

import cch_books.model.Book;

public class Detalhes_Livro extends javax.swing.JInternalFrame {
    
    public Detalhes_Livro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBack = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLBTitulo = new javax.swing.JLabel();
        jLBEditora = new javax.swing.JLabel();
        jLBAutores = new javax.swing.JLabel();
        jLBIdioma = new javax.swing.JLabel();
        jTFEditora = new javax.swing.JTextField();
        jTFAutores = new javax.swing.JTextField();
        jTFIdioma = new javax.swing.JTextField();
        jLBPreco = new javax.swing.JLabel();
        jTFPreco = new javax.swing.JTextField();
        jSPDescricao = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jLBDescricao = new javax.swing.JLabel();
        jLBDisponivelEm = new javax.swing.JLabel();
        jCBpdf = new javax.swing.JCheckBox();
        jCBpub = new javax.swing.JCheckBox();

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        jLBTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLBTitulo.setText("Título do livro");

        jLBEditora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBEditora.setText("Editora:");

        jLBAutores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBAutores.setText("Autores:");

        jLBIdioma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBIdioma.setText("Idioma:");

        jLBPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBPreco.setText("Preço:");

        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jSPDescricao.setViewportView(jTADescricao);

        jLBDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBDescricao.setText("Descrição:");

        jLBDisponivelEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBDisponivelEm.setText("Disponível em:");

        jCBpdf.setText("PDF");

        jCBpub.setText("PUB");

        javax.swing.GroupLayout jPBackLayout = new javax.swing.GroupLayout(jPBack);
        jPBack.setLayout(jPBackLayout);
        jPBackLayout.setHorizontalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLBTitulo)
                                .addGap(165, 165, 165))
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPBackLayout.createSequentialGroup()
                                            .addGap(68, 68, 68)
                                            .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPBackLayout.createSequentialGroup()
                                                    .addComponent(jLBEditora)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPBackLayout.createSequentialGroup()
                                                    .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLBIdioma)
                                                        .addComponent(jLBPreco))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPBackLayout.createSequentialGroup()
                                            .addGap(63, 63, 63)
                                            .addComponent(jLBAutores)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPBackLayout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLBDisponivelEm))
                                        .addComponent(jCBpdf))
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addComponent(jCBpub)
                                        .addGap(57, 57, 57)))
                                .addGap(62, 62, 62))))
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSPDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 47, Short.MAX_VALUE))))
        );
        jPBackLayout.setVerticalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLBTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLBEditora)
                            .addComponent(jTFEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBDisponivelEm))
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBAutores))
                                .addGap(12, 12, 12)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBIdioma))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLBPreco)
                                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jCBpdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBpub))))
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLBDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSPDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void recebeDados(Book livro){
        jLBTitulo.setText(livro.getTitulo());
        jTFEditora.setText(livro.getEditora());
        jTFAutores.setText(String.join(", ", livro.getAutores()));
        jTFIdioma.setText(livro.getLinguagem());
        jTFPreco.setText(livro.getCodMoeda() + " " + livro.getValor());
        jTADescricao.setText(livro.getDescricao());
        jCBpdf.setSelected(livro.isDisponivelPDF());
        jCBpub.setSelected(livro.isDisponivelEPub());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCBpdf;
    private javax.swing.JCheckBox jCBpub;
    private javax.swing.JLabel jLBAutores;
    private javax.swing.JLabel jLBDescricao;
    private javax.swing.JLabel jLBDisponivelEm;
    private javax.swing.JLabel jLBEditora;
    private javax.swing.JLabel jLBIdioma;
    private javax.swing.JLabel jLBPreco;
    private javax.swing.JLabel jLBTitulo;
    private javax.swing.JPanel jPBack;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSPDescricao;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFAutores;
    private javax.swing.JTextField jTFEditora;
    private javax.swing.JTextField jTFIdioma;
    private javax.swing.JTextField jTFPreco;
    // End of variables declaration//GEN-END:variables
}
