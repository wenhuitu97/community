package life.majiang.community.exception;

/**
 * @author wenhuitu97
 * @date 2019-07-01 17:46
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {


    QUESTION_NOT_FOUND("你找的问题不在了，要不然你换个试试");

    private String message;
    CustomizeErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
