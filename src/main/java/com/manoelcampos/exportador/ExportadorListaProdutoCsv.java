package com.manoelcampos.exportador;

import java.util.List;

/**
 * Exporta dados de uma lista de {@link Produto} para CSV (Comma-Separated Values).
 *
 * @author Brendo Braz Sales
 */
class ExportadorListaProdutoCsv extends AbstractExportadorListaProduto {

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return valor;
    }

    @Override
    public String fecharColuna() {
        return ",";
    }

    @Override
    protected String gerarColunasLinha(List<String> valores) {
        final var sb = new StringBuilder();
        for (int i = 0; i < valores.size(); i++) {
            sb.append(abrirColuna(valores.get(i)));
            if (i < valores.size() - 1) {
                sb.append(fecharColuna());
            }
        }
        sb.append(fecharLinha());
        return sb.toString();
    }
}
