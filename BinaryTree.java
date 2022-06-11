public class BinaryTree{
  String [] arr;
  int lastUsedIndex;

  public BinaryTree(int size){
    arr = new String[size+1];
    this.lastUsedIndex = 0;
    System.out.println("Blank tree of size "+size+" has been created");
  }
  //is Full
    boolean isFull(){
    if(arr.length -1 == lastUsedIndex){
      return true;
    }else{
       return false;
      
    }
   
  }
  //insert Method
  void insert(String value){
    if(!isFull()){
      arr[lastUsedIndex+1] = value;
      lastUsedIndex++;
      System.out.println("The value of "+value+" has been added");
      
    }else{
      System.out.println("The BT is full");
    }
  }
  //preOrder Traversal

  public void preOrder(int index){
    if(index>lastUsedIndex){
      return;
    }
    System.out.print(arr[index]+ " ");
    preOrder(index * 2);
    preOrder(index * 2 + 1);
  }

  public void inOrder(int index){
       if(index>lastUsedIndex){
      return;
    }
    inOrder(index * 2);  //O(N/2)
    System.out.print(arr[index]+ " ");//O(1)  }-------------->O(N)
    inOrder(index * 2 + 1);  //O(N/2)
    
    
  }


}

