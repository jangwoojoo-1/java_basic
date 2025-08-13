package java_advanced_01.day14;

public class MyResource implements AutoCloseable{

    private String name;

    MyResource(String name){
        this.name = name;
        System.out.println("[MyResource(" + name + ")");
    }

    public String read1(){
        System.out.println("[MyResource( " + name + " ) 읽기");
        return "100";
    }

    @Override
    public void close() throws Exception {

    }
}
