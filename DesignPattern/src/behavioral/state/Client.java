package behavioral.state;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(10);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(17);

        emergencyProjects.setFinish(false);

        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(19);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(22);
        emergencyProjects.WriteProgram();
	}

}
