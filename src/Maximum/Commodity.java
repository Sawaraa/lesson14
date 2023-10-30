package Maximum;

import java.util.*;

public class Commodity {

   Comparator<Goods> nameComparator = new NameComparator();
   Comparator<Goods> lengthComparator = new LengthComparator();
   Comparator<Goods> widthComparator = new WidthComparator();
   Comparator<Goods> weightCpmparator = new WeightCoparator();
    Goods goods = new Goods();

    Queue<Goods> data = new LinkedList<>();

    public void add(Goods goods){
        data.add(goods);

        Iterator<Goods> iterator = data.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void remove(String name){

        Iterator<Goods> iterator = data.iterator();

        while (iterator.hasNext()){
            Goods currentGoods = iterator.next();
            if(currentGoods.getName().equalsIgnoreCase(name)){
                iterator.remove();
                System.out.println("Ви успішно видалили товар");
                return; // Exit the method after successful removal
            }
        }

        System.out.println("Такого товару не існує");
    }

    public void replace(String oldName, String newName, double newLength, double newWidth, double newWeight){

        if(data.isEmpty()){
            System.out.println("Черга порожня");
            return;
        }

        Iterator<Goods> iterator = data.iterator();

        while (iterator.hasNext()){
            Goods currentGoods = iterator.next();
            if(currentGoods.getName().equals(oldName)){
                currentGoods.setName(newName);
                currentGoods.setLength(newLength);
                currentGoods.setWidth(newWidth);
                currentGoods.setWeight(newWeight);
            }
            System.out.println(currentGoods);
        }

    }

   public void nameSort(){
       List<Goods> list = new ArrayList<>(data);
       Collections.sort(list, nameComparator);

       Iterator<Goods> iterator = list.iterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }

   public void lenghtSort(){
       List<Goods> list = new ArrayList<>(data);
       Collections.sort(list,lengthComparator);

       Iterator<Goods> iterator = list.iterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }

   public void widthSort(){
       List<Goods> list = new ArrayList<>(data);
       Collections.sort(list,widthComparator);

       Iterator<Goods> iterator = list.iterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }

   public void weightSort(){
       List<Goods> list = new ArrayList<>(data);
       Collections.sort(list,weightCpmparator);

       Iterator<Goods> iterator = list.iterator();

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }

   public void outputElement(String name){

        for (Goods goods1: data){
            if(goods1.getName().equalsIgnoreCase(name)){
                System.out.println(goods1);
            }
        }
   }

   public void exit(){
       System.exit(0);
   }


}
