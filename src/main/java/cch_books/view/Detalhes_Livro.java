package cch_books.view;

import cch_books.model.Book;

public class Detalhes_Livro extends javax.swing.JDialog {

    public Detalhes_Livro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Detalhes do Livro");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jLBTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                                                    .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLBIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLBPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPBackLayout.createSequentialGroup()
                                            .addGap(63, 63, 63)
                                            .addComponent(jLBAutores)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(78, 78, 78)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLBDisponivelEm)
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackLayout.createSequentialGroup()
                                                .addComponent(jCBpdf)
                                                .addGap(11, 11, 11))
                                            .addComponent(jCBpub, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLBTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))))
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSPDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPBackLayout.setVerticalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLBTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLBEditora)
                                .addComponent(jTFEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLBDisponivelEm, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBAutores))
                                .addGap(12, 12, 12)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBIdioma)))
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addComponent(jCBpdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBpub)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLBPreco)
                            .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLBDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void recebeDados(Book livro){
        System.out.println(livro);
        jLBTitulo.setText(livro.getTitulo());
        jTFEditora.setText(livro.getEditora());
        jTFAutores.setText(String.join(", ", livro.getAutores()));
        jTFIdioma.setText(livro.getLinguagem());
        jTFPreco.setText(livro.getCodMoeda() + " " + livro.getValor());
        jTADescricao.setText(livro.getDescricao());
        jCBpdf.setSelected(livro.isDisponivelPDF());
        jCBpub.setSelected(livro.isDisponivelEPub());
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Detalhes_Livro dialog = new Detalhes_Livro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
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
