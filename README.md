This is a simple qrcode builder that is copied from https://github.com/skrymer/qrbuilder

QRCodeBuilder
=========

The builder is very simple to use, as the following example will shows.

Add the following dependency in pom.xml.

```xml
<!-- replace here with the latest version -->
<dependency>
  <groupId>club.lemos</groupId>
  <artifactId>qrbuilder</artifactId>
  <version>1.0.1</version>
</dependency>
```

Create a QRCode with dimensions 250*250, a image overlay and some data:

```java
public class Main {
  public static final float TRANSPARENCY = 0.20f;
  public static final float OVERLAY_RATIO = 1f;
  public static final int WIDTH = 250;
  public static final int HEIGHT = 250;

  public static void main(String[] args) throws Exception {
    QRCode.ZXingBuilder.build(builder ->
        builder
            .withSize(WIDTH, HEIGHT)
            .and()
            .withData(loremIpsum)
            .and()
            .withDecorator(ColoredQRCode.colorizeQRCode(Color.green.darker()))
            .and()
            .withDecorator(ImageOverlay.addImageOverlay(readImage("src/test/resources/images/skull_bw.png"), TRANSPARENCY, OVERLAY_RATIO))
            .and()
            .withCharSet(StandardCharsets.UTF_8)
            .verify(true)

    ).toFile("./qrCode.png", "PNG");
  }

  public static BufferedImage readImage(String path) {
    try {
      return ImageIO.read(new File(path));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam scelerisque dictum ipsum, mollis faucibus neque. Vestibulum suscipit eu urna eget lobortis.";
}
```
The following qrCode is then generated:

![alt text](https://raw.github.com/wiki/skrymer/qrbuilder/images/qrcode.png "QRCode")

## Decorators

The builder uses the decorators to decorate(obviously) the generated QRCode. 

Decorators currently available:
* ImageOverlay 
* ColoredQRCode 

You can create new Decorators by implementing the Decorator interface
