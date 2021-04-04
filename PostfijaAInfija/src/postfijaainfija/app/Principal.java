package postfijaainfija.app;
class Principal {
    public static void main(String[] args) {
        PostfijaAInfija objPostfijaAInfija = new  PostfijaAInfija();
        String postfija = "ab-c*a-";
        System.out.println(postfija);
        System.out.println(objPostfijaAInfija.cadenaInfija(postfija));
    }
}
