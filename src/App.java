class App {
  public static void main(String[] args) {
    System.out.println("Algo ...");

                          // new Construtor/NomeClasse
    ArCondicionado ar1 = new ArCondicionado("LG", 9000, false);
    ArCondicionado ar2 = new ArCondicionado("Midea", 23300, true);
    ArCondicionado ar3 = null;
    
    try {
      new ArCondicionado("  ", 9000, false);
    } catch(IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }

    System.out.println(ar1.marca); // LG
    System.out.println(ar1.btu); // 9000
    System.out.println(ar1.quente); // false
    System.out.println(ar1.lerTemperatura()); // 
    System.out.println(ar1.ligado); // false

    ar1.ligado = true;

    // manipular atributo (estado) diretamente
    // ar1.temperatura++;
    ar1.aumentarTemperatura(); // método/ação no objeto/comportamento
    System.out.println(ar1.lerTemperatura()); // 19
    
    ar1.aumentarTemperatura();
    ar1.aumentarTemperatura();
    
    System.out.println(ar1.lerTemperatura()); // 21
    System.out.println(ar1.lerTemperatura()); // 21
    System.out.println(ar1.lerTemperatura()); // 21
    System.out.println(ar1.lerTemperatura()); // 21
    
    ar1.aumentarTemperatura(); // 22
    ar1.aumentarTemperatura(); // 23
    ar1.aumentarTemperatura(); // 24
    ar1.aumentarTemperatura(); // 25
    ar1.aumentarTemperatura(); // ?
    ar1.aumentarTemperatura();
    ar1.aumentarTemperatura();
    ar1.aumentarTemperatura();
    ar1.aumentarTemperatura();
    ar1.aumentarTemperatura();
    
    System.out.println(ar1.lerTemperatura()); // 25

    // assertiva: Caso de Teste, espero que
    // a temperatura, neste ponto, seja 25.
    System.out.println(ar1.lerTemperatura());
    System.out.println(ar1.lerTemperatura() == 25);
    
    // ar1.temperatura = 26;
    
    System.out.println(ar1.lerTemperatura()); // 25
    System.out.println(ar1.lerTemperatura()); // 25
    System.out.println(ar1.lerTemperatura()); // 25
    System.out.println(ar1.lerTemperatura()); // 25


    // ar1.marca = "Equibras";
    
  }
}