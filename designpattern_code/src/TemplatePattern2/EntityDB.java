package TemplatePattern2;


import java.util.ArrayList;
import java.util.List;


public abstract class EntityDB  <T>{
    List<T> entities =  new ArrayList<>();

    protected abstract int getKey (T t);

    private boolean find(T t){
        for(T x : entities){
            if(getKey(x) == getKey(t)){
                return true;
            }
        }
       return false;
    }
    public boolean add(T t){
        if(!find(t)){
            entities.add(t);
        }
        return false;
    }
    public int update(T t){
        for(int i = 0; i < entities.size();i++){
            if(getKey(t)==getKey(entities.get(i))){
                entities.set(i, t);
                return 1;
            }
        }
        return 0;
    }

    public int delete(T t){
        for(int i = 0; i < entities.size();i++){
            if(getKey(t)==getKey(entities.get(i))){
                entities.remove(i);
                return 1;
            }
        }
        return 0;
    }

    public void display1(T t){

    }
    public void display(){
        entities.forEach(t->{
            display1(t);
        } );
    }

}
