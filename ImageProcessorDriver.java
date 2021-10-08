/** The Driver class for ImageProcessor */

public class ImageProcessorDriver {

    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor(args[0]);
        processor.convertToGrayscale();
        processor.store("output/grayscalePikachu.jpg");

        
        // FILL IN CODE - invoke other methods on Pikachu.jpg or sea.jpg, and store the result into jpg files


    }
}
