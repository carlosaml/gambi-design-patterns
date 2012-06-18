public class BulletProof {
    
    public static void process(Object[] stuff) {
        try { doSomething(stuff[0]); } catch (Throwable t) {}
        try { doSomethingElse(stuff[1], stuff[7]); } catch (Throwable t) {}
        try { verify(stuff[3]); } catch (Throwable t) {}
    }

}

