public enum LogsLogsLogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int typeLog;
    LogLevel(int typeLog){
        this.typeLog = typeLog;
    }
    public int getTypeLog(){
        return this.typeLog;
    }
}
