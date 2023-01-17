import java.util.Random;

public class MagicBox<T> {

    public T[] items;

    public MagicBox(int count){
        items = (T[]) new Object[count];
    }

    public boolean add(T item){
        for(int i = 0; i < items.length; i++){
            if(items[i] == null){
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick(){
        int emptyArr = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i] == null){
                emptyArr++;
            }
        }
        if(emptyArr != 0){
            throw new RuntimeException("Коробка не полна и осталось ещё "+ emptyArr + " ячеек заполнить");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }

    public int sizeItems(){
        return items.length;
    }

}
