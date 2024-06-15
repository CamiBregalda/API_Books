package cch_books.view;

import static cch_books.http.ClienteHttp.baixarImagem;
import cch_books.model.Book;
import java.awt.Color;
import javax.swing.ImageIcon;

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
        jLBpdf = new javax.swing.JLabel();
        jLBpub = new javax.swing.JLabel();
        jLBImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPBack.setBackground(new java.awt.Color(84, 0, 84));

        jLBTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLBTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLBTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBTitulo.setText("Título do livro");

        jLBEditora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBEditora.setForeground(new java.awt.Color(255, 255, 255));
        jLBEditora.setText("Editora:");

        jLBAutores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBAutores.setForeground(new java.awt.Color(255, 255, 255));
        jLBAutores.setText("Autores:");

        jLBIdioma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBIdioma.setForeground(new java.awt.Color(255, 255, 255));
        jLBIdioma.setText("Preço:");

        jLBPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLBPreco.setText("Idioma:");

        jTADescricao.setEditable(false);
        jTADescricao.setColumns(20);
        jTADescricao.setLineWrap(true);
        jTADescricao.setRows(5);
        jTADescricao.setWrapStyleWord(true);
        jSPDescricao.setViewportView(jTADescricao);

        jLBDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBDescricao.setForeground(new java.awt.Color(255, 255, 255));
        jLBDescricao.setText("Descrição:");

        jLBDisponivelEm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBDisponivelEm.setForeground(new java.awt.Color(255, 255, 255));
        jLBDisponivelEm.setText("Disponível em:");

        jCBpdf.setBackground(new java.awt.Color(84, 0, 84));
        jCBpdf.setEnabled(false);

        jCBpub.setBackground(new java.awt.Color(84, 0, 84));
        jCBpub.setEnabled(false);

        jLBEditoraLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBEditoraLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLBEditoraLivro.setForeground(new java.awt.Color(255, 255, 255));

        jLBAutoresLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBAutoresLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLBAutoresLivro.setForeground(new java.awt.Color(255, 255, 255));

        jLBPrecoLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBPrecoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLBPrecoLivro.setForeground(new java.awt.Color(255, 255, 255));

        jLBIdiomaLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLBIdiomaLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLBIdiomaLivro.setForeground(new java.awt.Color(255, 255, 255));

        jLBpdf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLBpdf.setForeground(new java.awt.Color(255, 255, 255));
        jLBpdf.setText("PDF");

        jLBpub.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLBpub.setForeground(new java.awt.Color(255, 255, 255));
        jLBpub.setText("EPub");

        javax.swing.GroupLayout jPBackLayout = new javax.swing.GroupLayout(jPBack);
        jPBack.setLayout(jPBackLayout);
        jPBackLayout.setHorizontalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSPDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addComponent(jLBImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPBackLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLBIdioma, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLBPreco, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(jPBackLayout.createSequentialGroup()
                                                .addComponent(jLBEditora)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLBEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLBAutores)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLBPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLBAutoresLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLBIdiomaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addComponent(jLBDisponivelEm)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPBackLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPBackLayout.createSequentialGroup()
                                                .addComponent(jCBpub)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLBpub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPBackLayout.createSequentialGroup()
                                                .addComponent(jCBpdf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLBpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackLayout.createSequentialGroup()
                                .addComponent(jLBTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))))
        );
        jPBackLayout.setVerticalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLBImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLBDescricao))
                    .addGroup(jPBackLayout.createSequentialGroup()
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
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBpdf)
                                    .addComponent(jLBpdf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBpub)
                                    .addComponent(jLBpub))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLBPreco)
                            .addComponent(jLBIdiomaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        try {
            byte[] imageBytes = baixarImagem(livro.getThumbnailUrl());
            ImageIcon icon = new ImageIcon(imageBytes);
            jLBImagem.setIcon(icon);
        } catch (Exception e){
            System.out.println("Erro ao carregar imagem: " + e.getMessage());
        }
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
    private javax.swing.JLabel jLBImagem;
    private javax.swing.JLabel jLBPreco;
    private javax.swing.JLabel jLBPrecoLivro;
    private javax.swing.JLabel jLBTitulo;
    private javax.swing.JLabel jLBpdf;
    private javax.swing.JLabel jLBpub;
    private javax.swing.JPanel jPBack;
    private javax.swing.JScrollPane jSPDescricao;
    private javax.swing.JTextArea jTADescricao;
    // End of variables declaration//GEN-END:variables
}
