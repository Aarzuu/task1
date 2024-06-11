public class Gebb <T> {
    private T value;
    //Öz generic methodunuzu yaradın-istənilən tipdə olan array-in elementlərini çapa versin
    public void print(T [] arr ){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
