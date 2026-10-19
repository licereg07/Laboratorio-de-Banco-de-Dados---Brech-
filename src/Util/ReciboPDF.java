package Util;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;

public class ReciboPDF {

    public static void gerarReciboTexto(String cliente, String vendedor, String total, String data, String itens) {
        try {
            // 1. Define o caminho da Área de Trabalho (Desktop)
            String caminhoDesktop = System.getProperty("user.home") + File.separator + "Desktop";
            
            // 2. Cria a pasta na Área de Trabalho se não existir
            File pastaDesktop = new File(caminhoDesktop + File.separator + "Recibos Brechó Alice");
            if (!pastaDesktop.exists()) {
                pastaDesktop.mkdirs();
            }

            // 3. Salva como HTML formatado para visualização perfeita
            String nomeArquivo = "Recibo_Venda_" + System.currentTimeMillis() + ".html";
            File arquivo = new File(pastaDesktop, nomeArquivo);
            
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), "UTF-8"));
            
            // Layout bonito estilizado igual cupom/recibo
            writer.write("<!DOCTYPE html>");
            writer.write("<html><head><meta charset='UTF-8'>");
            writer.write("<style>");
            writer.write("body { font-family: 'Courier New', monospace; background-color: #f4f4f4; padding: 20px; }");
            writer.write(".recibo { background: #fff; max-width: 400px; margin: auto; padding: 20px; border: 1px solid #ddd; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
            writer.write("h2 { text-align: center; margin-bottom: 5px; color: #333; }");
            writer.write(".sub { text-align: center; font-size: 12px; color: #666; margin-bottom: 15px; }");
            writer.write("hr { border: none; border-top: 1px dashed #000; margin: 10px 0; }");
            writer.write(".linha { display: flex; justify-content: space-between; font-size: 14px; margin: 4px 0; }");
            writer.write(".total { font-size: 16px; font-weight: bold; text-align: right; margin-top: 10px; }");
            writer.write(".rodape { text-align: center; font-size: 12px; margin-top: 20px; }");
            writer.write("</style></head><body>");
            
            writer.write("<div class='recibo'>");
            writer.write("<h2>BRECHÓ ALICE</h2>");
            writer.write("<div class='sub'>Comprovante de Compra</div>");
            writer.write("<hr>");
            writer.write("<div><b>Data/Hora:</b> " + data + "</div>");
            writer.write("<div><b>Cliente:</b> " + cliente + "</div>");
            writer.write("<div><b>Vendedor:</b> " + vendedor + "</div>");
            writer.write("<hr>");
            writer.write("<div><b>ITENS DA COMPRA:</b></div><br>");
            
            // Formatando as linhas de itens
            String[] linhasItens = itens.split("\n");
            for (String item : linhasItens) {
                if (!item.trim().isEmpty()) {
                    writer.write("<div class='linha'><span>" + item + "</span></div>");
                }
            }
            
            writer.write("<hr>");
            writer.write("<div class='total'>" + total + "</div>");
            writer.write("<hr>");
            writer.write("<div class='rodape'>Obrigado por comprar conosco! ♡</div>");
            writer.write("</div>");
            
            writer.write("</body></html>");
            writer.close();

            // 4. Abre o recibo automaticamente no navegador para visualização/impressão PDF
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(arquivo);
            }

            JOptionPane.showMessageDialog(null, "Recibo gerado e aberto com sucesso!\nSalvo em: Recibos Brechó Alice (Área de Trabalho)");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar recibo: " + e.getMessage());
        }
    }
}