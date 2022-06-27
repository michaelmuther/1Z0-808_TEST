class Methods8{
    static Methods8 ref;
    String[] arguments;
    public static void main(String args[]){
        ref = new Methods8();
        ref.func(args);
    }
    public void func(String[] args){
        ref.arguments = args;
    }
}
