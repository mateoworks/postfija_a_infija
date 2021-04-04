package postfijaainfija.app;
class Principal {
    public static void main(String[] args) {
        PostfijaAInfija objPostfijaAInfija = new  PostfijaAInfija();
        System.out.println("Hola");
        String postfija = "ab*c+";
        System.out.println(postfija);
        System.out.println(objPostfijaAInfija.cadenaInfija(postfija));
    }
}
