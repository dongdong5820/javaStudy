package letsjava.chapter2.ai;

/**
 * @author ranlay.su
 * @date 2021-05-28 16:07
 * @desc AI对话小程序
 */
public class AI {
    public String answer(String question) {
        String ret = null;

        ret = handleCanStart(question);
        if (ret != null) {
            return ret;
        }

        ret = handleAskTail(question);
        if (ret != null) {
            return ret;
        }

        return handleUnknown(question);
    }

    public String handleCanStart(String question) {
        String[] canStart = new String[]{"会","能","敢","有","在"};
        for (int i = 0; i < canStart.length; i++) {
            if (question.startsWith(canStart[i])) {
                return canStart[i] + "！";
            }
        }

        return null;
    }

    public String handleAskTail(String question) {
        String[] askTail = new String[]{"吗？","吗?","吗"};
        for (int i = 0; i < askTail.length; i++) {
            if (question.endsWith(askTail[i])) {
                return question.replace(askTail[i], "！");
            }
        }

        return null;
    }

    public String handleUnknown(String question) {
        return question + "！";
    }
}
