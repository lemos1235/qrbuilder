package club.lemos.qrbuilder.util;


/**
 * Some syntactic sugar
 */
public class SyntacticSugar {

  public static void throwIllegalArgumentExceptionIfEmpty(String parameter, String parameterName) {
    if (StringUtils.isEmpty(parameter)) {
      throw new IllegalArgumentException("Parameter " + parameter + " cannot be empty");
    }
  }
}
