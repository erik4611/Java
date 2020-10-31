public class Human implements Running, Jumping {

    protected String name;
    protected int jumpHeight;
    protected int runLength;

    public Human(String name, int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        this.name = name;
        }

        @Override
        public void Jumping (int wallHeight) {
            if (wallHeight <= jumpHeight) {
                System.out.println(name + " перепрыгнул");
            } else {
                System.out.println(name + " не смог перепрыгнуть");
            }


        }

        @Override
        public void Running (int threadLength) {
            if ( threadLength <= runLength) {
                System.out.println(name + " пробежал");
            } else {
                System.out.println(name + " не смсог пробежать");
            }

        }

}
