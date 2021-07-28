package datastructure.array;

public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array(){this(10);}

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 在index索引的位置插入一个新元素e
     * @param index
     * @param e
     */
    public void add(int index, E e){

        if(size == data.length)
            resize(2 * data.length);

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        //移动元素，空出index的位置
        for(int i=size-1; i>=index; i--)
            data[i+1] = data[i];
        data[index] = e;
        size++;
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e){
        add(size, e);
    }

    /**
     *  获取index索引位置的元素
     * @param index
     * @return
     */
    public E get(int index){

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Get failed. Index is illegal");
        return data[index];
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    /**
     * 修改index索引位置的元素为e
     * @param index
     * @param e
     */
    public void set(int index, E e){

        if(index < 0 || index > size)
            throw new IllegalArgumentException("Set failed. Index is illegal");
        data[index] = e;
    }

    /**
     * 查找数组中是否有元素e
     * @param e
     * @return
     */
    public boolean contains(E e){

        for(int i=0; i<size; i++){
            if(data[i].equals(e))
                return true;
        }
        return false;
    }

    /**
     * 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
     * @param e
     * @return
     */
    public int find(E e){

        for(int i=0; i<size; i++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    /**
     *索引位置移除元素
     * @param index
     * @return
     */
    public E remove(int index){

        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed.Index is illegal");

        E ret = data[index];
        for(int i=index+1; i<size; i++)
            data[i-1] = data[i];
        size--;
        data[size] = null;

        if(size == data.length / 4)
            resize(data.length / 2);

        return ret;
    }

    /**
     * 从数组中删除第一个元素，返回删除的元素
     * @return
     */
    public E removeFirst(){

        return remove(0);
    }

    /**
     * 从数组中删除第一个元素，返回删除的元素
     * @return
     */
    public E removeLast(){

        return remove(size-1);
    }

    /**
     * 从数组中删除元素e
     * @param e
     */
    public void removeElement(E e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }

    /**
     * 将数组空间的容量变成newCapacity大小
     * @param newCapacity
     */
    private void resize(int newCapacity){

        E[] newData = (E[]) new Object[newCapacity];
        for(int i=0; i<size; i++)
            newData[i] = data[i];
        data = newData;
    }

    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("datastructure.array.Array:size = %d，capacity = %d\n", size, data.length));
        res.append("[");
        for(int i=0; i<size; i++){
            res.append(data[i]);
            if(i != size-1)
                res.append(",");
        }
        res.append("]");
        return res.toString();
    }

    public static void main(String[] args) {

        Array<Integer> array = new Array<>(20);
        for(int i=0; i<10; i++)
            array.addLast(i);
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);
    }

}
