package singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First logger");
        ProgramLogger.getProgramLogger().addLogInfo("Second logger");
        ProgramLogger.getProgramLogger().addLogInfo("Third logger");
        ProgramLogger.getProgramLogger().showLogFile();
        System.out.println(ProgramLogger.getProgramLogger());   // проверка что это один объект
        System.out.println(ProgramLogger.getProgramLogger());   // проверка что это один объект
    }
}
