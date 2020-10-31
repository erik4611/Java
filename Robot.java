public class Robot implements Running, Jumping {

    protected String robotName;
    protected int robotRunLength;
    protected int robotJumpHeight;


    public Robot(String robotName, int robotRunLength, int robotJumpHeight) {
        this.robotName = robotName;
        this.robotRunLength = robotRunLength;
        this.robotJumpHeight = robotJumpHeight;

    }

    @Override
    public void Running (int threadLength) {
        if ( threadLength <= robotRunLength) {
            System.out.println(robotName + " пробежал");
        } else {
            System.out.println(robotName + " не смсог пробежать");
        }


    }

    @Override
    public void Jumping(int wallHeight) {

        if (wallHeight <= robotJumpHeight) {
            System.out.println(robotName + " перепрыгнул");
        } else {
            System.out.println(robotName + " не смог перепрыгнуть");
        }


    }
}
