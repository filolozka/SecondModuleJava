package lessonsExamples.lesson1308;

public class ArrayHandler {
    private String[] array;

    public ArrayHandler(String[] array){
        this.array = array;
    }

    public String[] getArray(){
        return array;
    }

    public void remove(int index){
        String[] res;
        if ((index >= 0) && (index < array.length)){
            res = new String[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    res[j] = array[i];
                    j++;
                }
            }
            array = res;
        }
    }

    public void remove2(int index){ //доделать
        String[] res;
        if ((index >= 0) && (index < array.length)){
            res = new String[array.length - 1];
           if (index > 0){
               System.arraycopy(array, 0, res, 0, index); //нативный метод, который делает копирование массива. написан на С
               //с помощью этого метода можно копировать массив сам в себя
           }
           if (index < array.length -1 ){
               System.arraycopy(array, index+1, res, index, array.length-1-index);
           }
        }
    }

    public void remove3(int index){
        if ((index >= 0)&&(index < array.length)){
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
    }
}
