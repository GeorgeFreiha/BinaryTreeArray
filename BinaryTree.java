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
       if(index>lastUsedIndex){ //O(1)
      return;
    }
    inOrder(index * 2);  //O(N/2)
    System.out.print(arr[index]+ " ");//O(1)  }-------------->O(N) 
    inOrder(index * 2 + 1);  //O(N/2)      ,SPACE is O(N)
    
    
  }
  //postOrder Traversal
  public void postOrder(int index){ 
    if(index>lastUsedIndex){ //O(1)
      return;
    }
    postOrder(index * 2);//O(N/2)
    postOrder(index * 2 + 1);//O(N/2)  }-------------->O(N)
    System.out.print(arr[index]+ " ");//O(1)      ,SPACE is O(N)
    
  }
  //levelOrder
  public void levelOrder(){
    for(int i = 1; i<=lastUsedIndex; i++){ //O(N); }-------------->O(N)
      System.out.print(arr[i]+" "); //O(1)     ,SPACE is O(1);
    }
    
    
   }
  //Search method
  
  public int search(String value){
    for(int i = 1; i<=lastUsedIndex; i++){ //O(N); 
      if(arr[i] == value){  //O(1)            }-------------->O(N)
        System.out.println("Value "+value+" found at index "+i); //O(1)
        return i; //O(1)   
      }
                                                    // SPACE is O(1);
    }
    System.out.println("The value does not exist in the Binary Tree"); //O(1)
    return -1; //O(1)   
    
  }
  //Delete method
  public void delete(String value){
    int location = search(value); //O(N)
    if(location == -1){  //O(1)
      return;           //}-------------->O(N)   ,SPACE is O(1);
    }else{
    arr[location] = arr[lastUsedIndex]; //O(1)
    lastUsedIndex--; //O(1)
    System.out.println("Node is successfully deleted"); //O(1)
      
    } 
  }
  //Delete binary tree
  public void deleteBT(){
    try{
      arr = null; //O(1)
      System.out.println("Binary Tree is successfully deleted"); //O(1)
                                   ///////}---------->O(1) , SPACE is O(1);
    } catch(Exception e){
       System.out.println("Error in deleting the tree"); //O(1)
      
      
    }
    
  }
  


}

