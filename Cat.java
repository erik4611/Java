public class Cat implements Jumping, Running {

    protected String CatName;
    protected int CatJumpHeight;
    protected int CatRunLength;

    public Cat(String CatName, int CatJumpHeight, int CatRunLength) {
        this.CatJumpHeight = CatJumpHeight;
        this.CatRunLength = CatRunLength;
        this.CatName = CatName;

    }



    @Override
    public void Jumping(int wallHeight) {

        if (wallHeight <= CatJumpHeight) {
            System.out.println(CatName + " перепрыгнул");
        } else {
            System.out.println(CatName + " не смог перепрыгнуть");
        }

    }

    @Override
    public void Running(int threadLength) {
        if ( threadLength <= CatRunLength) {
            System.out.println(CatName + " пробежал");
        } else {
            System.out.println(CatName + " не смсог пробежать");
        }

    }
}
