public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        switch (tipoLoja) {
            case "Cosmético" -> {
                for (Loja loja : lojas) {
                    if (loja instanceof Cosmetico) {
                        count++;
                    }
                }
                return count;
            }
            case "Vestuário" -> {
                for (Loja loja : lojas) {
                    if (loja instanceof Vestuario) {
                        count++;
                    }
                }
                return count;
            }
            case "Bijuteria" -> {
                for (Loja loja : lojas) {
                    if (loja instanceof Bijuteria) {
                        count++;
                    }
                }
                return count;
            }
            case "Alimentação" -> {
                for (Loja loja : lojas) {
                    if (loja instanceof Alimentacao) {
                        count++;
                    }
                }
                return count;
            }
            case "Informática" -> {
                for (Loja loja : lojas) {
                    if (loja instanceof Informatica) {
                        count++;
                    }
                }
                return count;
            }
            default -> {
                return -1;
            }
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Loja[] lojasInformatica = new Loja[lojas.length];

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                lojasInformatica[i] = lojas[i];
            }
        }

        Informatica lojaSeguroMaisCaro = null;
        Double seguroMaisCaro = 0D;
        
        for (Loja loja : lojasInformatica) {
            Informatica lojaInfo = (Informatica) loja;
            if (lojaInfo.getSeguroEletronicos() > seguroMaisCaro) {
                seguroMaisCaro = lojaInfo.getSeguroEletronicos();
                lojaSeguroMaisCaro = lojaInfo;
            }
        }
        return lojaSeguroMaisCaro;
    }

    @Override
    public String toString() {
        return "Shopping {" +
                "Nome: '" + nome + '\'' +
                ", Endereço: " + endereco.toString() +
                ", Lojas: " + listarLojas() +
                '}';
    }

    private StringBuilder listarLojas() {
        StringBuilder listaLojas = new StringBuilder();

        for(Loja loja : lojas) {
            if (loja != null) {
                listaLojas.append(loja.getNome()).append("; ");
            }
        }
        return listaLojas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

}
