package cch_books.view;

import static cch_books.http.ClienteHttp.baixarImagem;
import cch_books.model.Book;
import java.awt.Color;

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
        jPNImagem = new javax.swing.JPanel();
        jLBTitulo = new javax.swing.JLabel();
        jLBEditora = new javax.swing.JLabel();
        jLBAutores = new javax.swing.JLabel();
        jLBIdioma = new javax.swing.JLabel();
        jLBPreco = new javax.swing.JLabel();
        jSPDescricao = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jLBDescricao = new javax.swing.JLabel();
        jLBDisponivelEm = new javax.swing.JLabel();
        jCBpdf = new javax.swing.JCheckBox();
        jCBpub = new javax.swing.JCheckBox();
        jLBEditoraLivro = new javax.swing.JLabel();
        jLBAutoresLivro = new javax.swing.JLabel();
        jLBPrecoLivro = new javax.swing.JLabel();
        jLBIdiomaLivro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPNImagem.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPNImagemLayout = new javax.swing.GroupLayout(jPNImagem);
        jPNImagem.setLayout(jPNImagemLayout);
        jPNImagemLayout.setHorizontalGroup(
            jPNImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );
        jPNImagemLayout.setVerticalGroup(
            jPNImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        jLBIdioma.setText("Preço:");

        jLBPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBPreco.setText("País de Origem:");

        jTADescricao.setColumns(20);
        jTADescricao.setLineWrap(true);
        jTADescricao.setRows(5);
        jTADescricao.setWrapStyleWord(true);
        jSPDescricao.setViewportView(jTADescricao);

        jLBDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBDescricao.setText("Descrição:");

        jLBDisponivelEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBDisponivelEm.setText("Disponível em:");

        jCBpdf.setText("PDF");
        jCBpdf.setEnabled(false);

        jCBpub.setText("PUB");
        jCBpub.setEnabled(false);

        jLBEditoraLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBEditoraLivro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLBAutoresLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBAutoresLivro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLBPrecoLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBPrecoLivro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLBIdiomaLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBIdiomaLivro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPBackLayout = new javax.swing.GroupLayout(jPBack);
        jPBack.setLayout(jPBackLayout);
        jPBackLayout.setHorizontalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addComponent(jPNImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPBackLayout.createSequentialGroup()
                                                .addComponent(jLBEditora)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLBEditoraLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPBackLayout.createSequentialGroup()
                                                .addComponent(jLBAutores)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLBAutoresLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLBIdioma, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLBPreco, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLBPrecoLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(jLBIdiomaLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(23, 23, 23)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addComponent(jLBDisponivelEm)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBpub)
                                            .addComponent(jCBpdf))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLBTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
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
                        .addGap(39, 39, 39)
                        .addComponent(jPNImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLBDescricao))
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLBTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLBEditora)
                            .addComponent(jLBDisponivelEm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLBEditoraLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLBAutores)
                                    .addComponent(jLBAutoresLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLBPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBIdioma)))
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addComponent(jCBpdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBpub)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBIdiomaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBPreco))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void recebeDados(Book livro){
        if (livro.getTitulo() != null) {
            jLBTitulo.setText(livro.getTitulo());
        }

        if (livro.getEditora() != null) {
            jLBEditoraLivro.setText(livro.getEditora());
        }

        if (livro.getAutores() != null) {
            jLBAutoresLivro.setText(String.join(", ", livro.getAutores()));
        }

        if (livro.getPaisOrigem() != null) {
            jLBIdiomaLivro.setText(livro.getPaisOrigem());
        }

        if (livro.getCodMoeda() != null && livro.getValor() != null) {
            jLBPrecoLivro.setText(livro.getCodMoeda() + " " + livro.getValor());
        } else {
            jLBPrecoLivro.setText("Preço não encontrado");
        }
        
        if (livro.getDescricao() != null) {
            jTADescricao.setText(livro.getDescricao());
        }
        
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
    private javax.swing.JLabel jLBAutoresLivro;
    private javax.swing.JLabel jLBDescricao;
    private javax.swing.JLabel jLBDisponivelEm;
    private javax.swing.JLabel jLBEditora;
    private javax.swing.JLabel jLBEditoraLivro;
    private javax.swing.JLabel jLBIdioma;
    private javax.swing.JLabel jLBIdiomaLivro;
    private javax.swing.JLabel jLBPreco;
    private javax.swing.JLabel jLBPrecoLivro;
    private javax.swing.JLabel jLBTitulo;
    private javax.swing.JPanel jPBack;
    private javax.swing.JPanel jPNImagem;
    private javax.swing.JScrollPane jSPDescricao;
    private javax.swing.JTextArea jTADescricao;
    // End of variables declaration//GEN-END:variables
}
