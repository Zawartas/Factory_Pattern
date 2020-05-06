package sample;

public class ZombieFabric {
    private final static HashMap<String,AnimalMaker> map=new HashMap<String,AnimalMaker>()
    {
        {
            put("Cat",(name)->new Cat(name));
            put("Dog",(name)->new Dog(name));
            put("Cow",(name)->new Cow(name));

            put("Fly",(name)->new Fly(name));
            put("Dragonfly",(name)->new Dragonfly(name));
            put("Ladybug",(name)->new Ladybug(name));

            put("Crocodile",(name)->new Crocodile(name));
            put("Turtle",(name)->new Turtle(name));
            put("Frog",(name)->new Frog(name));
        }
    };
    public static Animal make(String type,String name)
    {
        return map.get(type).make(name);
    }
    public static String[] keys()
    {
        String[] srt=new String[map.size()];
        map.keySet().toArray(srt);
        Arrays.sort(srt);
        return srt;
    }
}
