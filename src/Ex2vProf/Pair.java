package Ex2vProf;

public class Pair<K extends Pessoa, V extends Animal> {

    private K k;
    private V[] animais;

    public Pair(K k){
        this.k = k;
    }

    public void addAnimal(V animal){
        animais[0]=animal;
    }

    public K getK(){
        return k;
    }

    public int getIdade(){
        return k.getIdade();
    }
}
