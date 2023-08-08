class ArCondicionado { // inicial maiúscula
  // atributos/estado do ar-condicionado

  // constante
  final String marca;
  final int btu;
  final boolean quente;
  // variável
  // privado
  private int temperatura = 18;
  boolean ligado = false;
  

  // construtor/inicializador
  ArCondicionado(
      String paramMarca, int paramBtu, boolean paramQuente) {

    if (paramMarca == null) {
      throw new NullPointerException("Marca não pode ser nula");
    }

    if (paramMarca.isBlank()) {
      throw new IllegalArgumentException("Marca não pode estar em branco");
    }

    marca = paramMarca;
    btu = paramBtu;
    quente = paramQuente;

    // temperatura = 18;
    // ligado = false;
  }

  void aumentarTemperatura() { // MÉTODO/COMANDO
    // temperatura = temperatura + 1;
    // temperatura += 1;
    if (temperatura < 25) temperatura++;
  }

  void baixarTemperatura() {
    if (temperatura > 16) temperatura--;
  }

  int lerTemperatura() { // MÉTODO/CONSULTA
    return temperatura;
  }
}
