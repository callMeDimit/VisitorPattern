package com.dimit.p5;
public class Client {  
      public static void main(String[] args) {  
        DataResource o = new DataResource();  //依赖于ObjectStructure  
        //实例化具体元素  
        o.addData(new Man());    
        o.addData(new Women());  
        o.addData(new Monster());
        //当成功时不同元素的不同反映  
        Visitor suceessVisitor = new SuccessVisitor();  
        ReflectionVisitor rv = new ReflectionVisitorImpl(suceessVisitor);
        o.display(rv);
        
        Visitor fv = new FailVisitor();
        rv.updateVisitor(fv);
        o.display(rv);
        
        Visitor lv = new LoveVisitor();
        rv.updateVisitor(lv);
        o.display(rv);
    }  
}